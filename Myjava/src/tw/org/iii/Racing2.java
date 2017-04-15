package tw.org.iii;
//�s�@�ɨ��]�D:������Ҥl(�]�D�W�[)
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing2 extends JFrame{
	private JButton go;
	private JLabel [] lanes = new JLabel[8];   //lane���]�D
	private Car[] cars = new Car[8];
	private int rank;
	
	public Racing2(){
		super("Racing Game");add(go);
		setLayout(new GridLayout(lanes.length+1,1)); // �h�Ӷ]�D;GridLayout(int rows, int cols)
		
		go = new JButton("Go");
		for(int i=0;i<lanes.length; i++){
			JLabel lane = new JLabel((i+1) + ". ");
			lanes[i] = lane;  //�W�[�]�D     //
			add(lane);  //lane���e��
		}
		
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
		rank = 1;
		//�h�x���l
		for(int i=0;i<lanes.length; i++){
			lanes[i].setText((i+1) + ". ");
		}
//		for(int i=0;i<lanes.length; i++){
//			JLabel lane = new JLabel((i+1) + ". ");
//			lanes[i] = lane;  //�W�[�]�D     //
//		}
		for(int i=0; i<cars.length; i++){
			cars[i] = new Car(i);
		}
		for(int i=0; i<cars.length; i++){
			cars[i].start();
		}
	}

	private class Car extends Thread{
		private int lane;  //��Lane�����@�Ӷ]�D
		Car(int lane){this.lane= lane;}
		@Override
		public void run() {
			for(int i=0; i<100; i++){
				lanes[lane].setText(lanes[lane].getText()+ ">" );  //
				try {
					Thread.sleep(10+(int)(Math.random()*200));      //����{����]�ӧ֨S���Pı
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
