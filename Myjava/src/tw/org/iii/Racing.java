package tw.org.iii;
//�s�@�ɨ��]�D:������Ҥl(�@���]�D)
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing extends JFrame{
	private JButton go;
	private JLabel lane;   //lane���]�D
	public Racing(){
		super("Racing Game");
		setLayout(new GridLayout(2,1)); //GridLayout(int rows, int cols)
		
		go = new JButton("Go");
		lane = new JLabel("1. ");
		
		add(go);add(lane);
		
		go.addActionListener(new ActionListener() {   //���U���s
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
					Thread.sleep(100);      //����{����]�ӧ֨S���Pı
				} catch (InterruptedException e) {
					
				} 
			}
		}
	} 
	
	public static void main(String[] args) {
		new Racing();
	}
}
