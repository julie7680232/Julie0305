package tw.org.iii;
//製作賽車跑道:執行緒例子(跑道增加)
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing2 extends JFrame{
	private JButton go;
	private JLabel [] lanes = new JLabel[8];   //lane指跑道
	private Car[] cars = new Car[8];
	private int rank;
	
	public Racing2(){
		super("Racing Game");add(go);
		setLayout(new GridLayout(lanes.length+1,1)); // 多個跑道;GridLayout(int rows, int cols)
		
		go = new JButton("Go");
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
				} 
			}
			lanes[lane].setText(lanes[lane].getText()+ rank++ );
		}
	} 
	
	public static void main(String[] args) {
		new Racing2();
	}
}
