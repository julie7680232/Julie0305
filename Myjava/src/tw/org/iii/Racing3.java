package tw.org.iii;
//�s�@�ɨ��]�D:������Ҥl(�W�[�\��:�]�w�ĴX�x���l��������),�Q��interrupt()
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
	private JLabel [] lanes = new JLabel[8];   //�ŧi�]�D������}�C,��8�Ӷ]�D,��Ȭ�null(�򥻫��O�����,���󫬧O���Onull);lane���]�D
	private Car[] cars = new Car[8];     //�ŧi8�x���l
	private int rank;    //�ŧi�W��
	
	public Racing3(){
		super("Racing Game");
		setLayout(new GridLayout(lanes.length+2,1)); // (lanes.length+1)�����O8�Ӷ]�D�A�[�W2�����s(Go��Stop);GridLayout(int rows, int cols)
		
		go = new JButton("Go");add(go);
		stop = new JButton("stop");add(stop);
		for(int i=0;i<lanes.length; i++){
			JLabel lane = new JLabel((i+1) + ". ");   //�ŧi��8�Ӽ���
			lanes[i] = lane;  //�C���]�D�����ۤv����������,�@�}�C
			add(lane);  //�b�������W�[lane���e��
		}
		
		go.addActionListener(new ActionListener() {   //���UGo!���s,�|�]�H�U�{��
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
		stop.addActionListener(new ActionListener() {  //���UStop���s,�|�]�H�U�{��
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
		rank = 1;   //�w�q��l�Ȭ�1
		for(int i=0;i<lanes.length; i++){      //�M���W�@�����UGo!���]�D 
			lanes[i].setText((i+1) + ". ");   //�N�]�D���X�ӲM��,�ä��O�����b�W���M�z
		}
		//�h�x���l
		for(int i=0; i<cars.length; i++){
			cars[i] = new Car(i);
		}
		for(int i=0; i<cars.length; i++){
			cars[i].start();
		}
	}
	
	private void stopGame(){    
		cars[3].interrupt();  
		//1.�]��cars�O�����,�ҥH�I�sThread����kinterrupt�]�w��4�x����������,�|�btry catch�L�X�ҥ~,�����C�{�����ఱ���4�x���~��]
	}
	
	
	private class Car extends Thread{   //�|�N���l�g�{�������O,��K�s���~�����O���ݩʩM��k
		private int whichlane;  //�����@�Ӷ]�D
		Car(int lane){this.whichlane= lane;}  //���l�����]�D
		
		@Override
		public void run() {  
			//boolean isRunning = true;    //3.��k1-1:�{���~��]�w�q��true
			for(int i=0; i<100; i++){     //���l�]���B��,i<100�ۤv�ۭq 
				lanes[whichlane].setText(lanes[whichlane].getText()+ ">" );  //�g�~�����O�S����k�o�˨ϥ�,�g���������O,��K�s���~�����O���ݩʩM��k
				//API:setText(String text):Defines the single line of text this component will display.
				//API:getText():Returns the text string that the label displays.�^�Ǧr��
				try {
					Thread.sleep(10+(int)(Math.random()*200));      
					//���l���t���H��,(int)(Math.random()*200)���d��0~199,10+(int)(Math.random()*200)���d��10~209
				} catch (InterruptedException e) {  //�]��interrupt,try catch�|������ҥ~,�ҥH�{���g�b�ҥ~{}
					//isRunning = false;   //3.��k1-2:���ͨҥ~��,�{������,�Y��false	
					//break;                //3.��k1-3:�{������,���X�j��	
					//System.out.println(lane + ":OK");  //2.��stop�|�]�X�ҥ~,�L�X���C,�ݸ��X�j��,�n��������,������QQ�o�C,����ؤ�k
					return;   //3.��k2:��k��������return
				} 
			}
			//if(isRunning){      //3.��k1-4:���p�{���~��](�Y��true),����H�U�{��
				lanes[whichlane].setText(lanes[whichlane].getText()+ rank++ );  //QQ  //rank++�����O�W���Ĥ@�W,�U�@�ӲĤG�W,...�H������
			//}     //3.��k1-5
		}
	} 
	
	public static void main(String[] args) {
		new Racing3();
	}
}
