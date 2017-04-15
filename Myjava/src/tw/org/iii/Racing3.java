package tw.org.iii;
//製作賽車跑道:執行緒例子(增加功能:設定第幾台車子提早結束)
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
	private JLabel [] lanes = new JLabel[8];   //lane指跑道
	private Car[] cars = new Car[8];
	private int rank;
	
	public Racing3(){
		super("Racing Game");
		setLayout(new GridLayout(lanes.length+2,1)); // 多個跑道;GridLayout(int rows, int cols)
		
		go = new JButton("Go");add(go);
		stop = new JButton("stop");add(stop);
		for(int i=0;i<lanes.length; i++){
			JLabel lane = new JLabel((i+1) + ". ");
			lanes[i] = lane;  //增加跑道     //
			add(lane);  //lane的畫面
		}
		
		go.addActionListener(new ActionListener() {   //按下按鈕
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
		stop.addActionListener(new ActionListener() {
			
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
		rank = 1;
		//多台車子
		for(int i=0;i<lanes.length; i++){
			lanes[i].setText((i+1) + ". ");
		}
//		for(int i=0;i<lanes.length; i++){
//			JLabel lane = new JLabel((i+1) + ". ");
//			lanes[i] = lane;  //增加跑道     //
//		}
		for(int i=0; i<cars.length; i++){
			cars[i] = new Car(i);
		}
		for(int i=0; i<cars.length; i++){
			cars[i].start();
		}
	}
	
	private void stopGame(){
		cars[3].interrupt();  //設定第4台車提早結束
	}
	
	
	private class Car extends Thread{
		private int lane;  //此Lane為哪一個跑道
		Car(int lane){this.lane= lane;}
		@Override
		public void run() {
			//boolean isRunning = true;    //方法1-1
			for(int i=0; i<100; i++){
				lanes[lane].setText(lanes[lane].getText()+ ">" );  //
				try {
					Thread.sleep(10+(int)(Math.random()*200));      //執行程式後跑太快沒有感覺
				} catch (InterruptedException e) {
					//isRunning = false;   //方法1-2	
					//break;                //方法1-3	
					//System.out.println(lane + ":OK");//按stop會跑出例外,印出此列,需跳出迴圈,要提早結束,不執行QQ這列,有兩種方法
					//return;   //方法2
				} 
			}
			//if(isRunning){      //方法1-4
				lanes[lane].setText(lanes[lane].getText()+ rank++ );  //QQ
			//}     //方法1-5
		}
	} 
	
	public static void main(String[] args) {
		new Racing3();
	}
}
