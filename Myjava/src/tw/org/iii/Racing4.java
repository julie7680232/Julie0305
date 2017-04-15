package tw.org.iii;
//製作賽車跑道:執行緒例子(增加功能:有人第一名即不用跑了,停止遊戲)-1
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Racing4 extends JFrame{
	private JButton go;
	private JLabel [] lanes = new JLabel[8];   //lane指跑道
	private Car[] cars = new Car[8];
	private int rank;
	
	public Racing4(){
		super("Racing Game");
		setLayout(new GridLayout(lanes.length+1,1)); // 多個跑道;GridLayout(int rows, int cols)
		
		go = new JButton("Go");add(go);
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
		for(int i=0; i<cars.length; i++){
			cars[i] = new Car(i);
		}
		for(int i=0; i<cars.length; i++){
			cars[i].start();
		}
	}
	
	private void stopGame(){
		for(Car car:cars){
			car.interrupt();  //車子提早結束
		}
	}
	
	
	private class Car extends Thread{
		private int lane;  //此Lane為哪一個跑道
		Car(int lane){this.lane= lane;}
		@Override
		public void run() {
			for(int i=0; i<100; i++){
				lanes[lane].setText(lanes[lane].getText()+ ">" );  //
				try {
					Thread.sleep(10+(int)(Math.random()*200));      //執行程式後跑太快沒有感覺
				} catch (InterruptedException e) {
					
					//System.out.println(lane + ":OK");//按stop會跑出例外,印出此列,需跳出迴圈,要提早結束,不執行QQ這列
					return;   
				} 
			}
			
				lanes[lane].setText(lanes[lane].getText()+ "==> WINNER" );  
				stopGame();
		}
	} 
	
	public static void main(String[] args) {
		new Racing4();
	}
}
//執行後一直按Go!跑的速度會越來越快,因為相同跑道,頻率一直累加,因為程式跑很多次