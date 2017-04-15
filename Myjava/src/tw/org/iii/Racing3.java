package tw.org.iii;
//�s�@�ɨ��]�D:������Ҥl(�W�[�\��:�]�w�ĴX�x���l��������)
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
	private JLabel [] lanes = new JLabel[8];   //lane���]�D
	private Car[] cars = new Car[8];
	private int rank;
	
	public Racing3(){
		super("Racing Game");
		setLayout(new GridLayout(lanes.length+2,1)); // �h�Ӷ]�D;GridLayout(int rows, int cols)
		
		go = new JButton("Go");add(go);
		stop = new JButton("stop");add(stop);
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
	
	private void stopGame(){
		cars[3].interrupt();  //�]�w��4�x����������
	}
	
	
	private class Car extends Thread{
		private int lane;  //��Lane�����@�Ӷ]�D
		Car(int lane){this.lane= lane;}
		@Override
		public void run() {
			//boolean isRunning = true;    //��k1-1
			for(int i=0; i<100; i++){
				lanes[lane].setText(lanes[lane].getText()+ ">" );  //
				try {
					Thread.sleep(10+(int)(Math.random()*200));      //����{����]�ӧ֨S���Pı
				} catch (InterruptedException e) {
					//isRunning = false;   //��k1-2	
					//break;                //��k1-3	
					//System.out.println(lane + ":OK");//��stop�|�]�X�ҥ~,�L�X���C,�ݸ��X�j��,�n��������,������QQ�o�C,����ؤ�k
					//return;   //��k2
				} 
			}
			//if(isRunning){      //��k1-4
				lanes[lane].setText(lanes[lane].getText()+ rank++ );  //QQ
			//}     //��k1-5
		}
	} 
	
	public static void main(String[] args) {
		new Racing3();
	}
}
