package tw.org.iii;
//製作賽車跑道:執行緒例子(一條跑道)
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing extends JFrame{
	private JButton go;
	private JLabel lane;   //lane指跑道
	public Racing(){
		super("Racing Game");
		setLayout(new GridLayout(2,1)); //GridLayout(int rows, int cols)
		
		go = new JButton("Go");
		lane = new JLabel("1. ");
		
		add(go);add(lane);
		
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
		Car car1 = new Car();
		car1.start();
	}

	private class Car extends Thread{
		@Override
		public void run() {
			for(int i=0; i<100; i++){
				lane.setText(lane.getText()+ ">" );  //
				try {
					Thread.sleep(100);      //執行程式後跑太快沒有感覺
				} catch (InterruptedException e) {
					
				} 
			}
		}
	} 
	
	public static void main(String[] args) {
		new Racing();
	}
}
