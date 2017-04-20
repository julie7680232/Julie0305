package tw.org.iii;
//製作賽車跑道:執行緒例子(增加功能:設定第幾台車子提早結束),利用interrupt()
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Racing3 extends JFrame{
	private JButton go,stop;
	private JLabel [] lanes = new JLabel[8];   //宣告跑道為物件陣列,有8個跑道,初值為null(基本型別有初值,物件型別都是null);lane指跑道
	private Car[] cars = new Car[8];     //宣告8台車子
	private int rank;    //宣告名次
	
	public Racing3(){
		super("Racing Game");
		setLayout(new GridLayout(lanes.length+2,1)); // (lanes.length+1)指的是8個跑道再加上2顆按鈕(Go及Stop);GridLayout(int rows, int cols)
		
		go = new JButton("Go");add(go);
		stop = new JButton("stop");add(stop);
		for(int i=0;i<lanes.length; i++){
			JLabel lane = new JLabel((i+1) + ". ");   //宣告有8個標籤
			lanes[i] = lane;  //每條跑道都有自己對應之標籤,作陣列
			add(lane);  //在視窗中增加lane的畫面
		}
		
		go.addActionListener(new ActionListener() {   //按下Go!按鈕,會跑以下程式
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
		stop.addActionListener(new ActionListener() {  //按下Stop按鈕,會跑以下程式
			@Override
			public void actionPerformed(ActionEvent e) {
				stopGame();
			}
		});
				
		setSize(800,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void go(){
		rank = 1;   //定義初始值為1
		for(int i=0;i<lanes.length; i++){      //清除上一次按下Go!的跑道 
			lanes[i].setText((i+1) + ". ");   //將跑道拿出來清除,並不是直接在上面清理
		}
		//多台車子
		for(int i=0; i<cars.length; i++){
			cars[i] = new Car(i);
		}
		for(int i=0; i<cars.length; i++){
			cars[i].start();
		}
	}
	
	private void stopGame(){    
		cars[3].interrupt();  
		//1.因為cars是執行緒,所以呼叫Thread的方法interrupt設定第4台車提早結束,會在try catch印出例外,但此列程式不能停止第4台車繼續跑
	}
	
	
	private class Car extends Thread{   //會將車子寫程內部類別,方便存取外部類別的屬性和方法
		private int whichlane;  //為哪一個跑道
		Car(int lane){this.whichlane= lane;}  //車子對應跑道
		
		@Override
		public void run() {  
			//boolean isRunning = true;    //3.方法1-1:程式繼續跑定義為true
			for(int i=0; i<100; i++){     //車子跑的步數,i<100自己自訂 
				lanes[whichlane].setText(lanes[whichlane].getText()+ ">" );  //寫外部類別沒有辦法這樣使用,寫成內部類別,方便存取外部類別的屬性和方法
				//API:setText(String text):Defines the single line of text this component will display.
				//API:getText():Returns the text string that the label displays.回傳字串
				try {
					Thread.sleep(10+(int)(Math.random()*200));      
					//車子的速度隨機,(int)(Math.random()*200)的範圍為0~199,10+(int)(Math.random()*200)的範圍為10~209
				} catch (InterruptedException e) {  //因為interrupt,try catch會捕捉到例外,所以程式寫在例外{}
					//isRunning = false;   //3.方法1-2:產生例外時,程式停止,即為false	
					//break;                //3.方法1-3:程式停止,跳出迴圈	
					//System.out.println(lane + ":OK");  //2.按stop會跑出例外,印出此列,需跳出迴圈,要提早結束,不執行QQ這列,有兩種方法
					return;   //3.方法2:方法的結束為return
				} 
			}
			//if(isRunning){      //3.方法1-4:假如程式繼續跑(即為true),執行以下程式
				lanes[whichlane].setText(lanes[whichlane].getText()+ rank++ );  //QQ  //rank++指的是名次第一名,下一個第二名,...以此類推
			//}     //3.方法1-5
		}
	} 
	
	public static void main(String[] args) {
		new Racing3();
	}
}
