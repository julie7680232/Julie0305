package tw.org.iii;
//�s�@�ɨ��]�D:������Ҥl(�W�[�\��:���H�Ĥ@�W�Y���ζ]�F,����C��)-2
/*�����@����Go!�]���t�׷|�V�ӶV��,�]���Ĥ@����Go!8�x���b�]�D�W�],�A���@��Go!�A�t�~8�x���]�b�Ĥ@�����]�D�W�],�ɭP�W�v�@���֥[,
�]���{���]�ܦh��lanes[whichlane].setText(lanes[whichlane].getText()+ ">" ),���{���ѨM�o����,�Y�������A
*/
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Racing5 extends JFrame{
	private JButton go;
	private JLabel [] lanes = new JLabel[8];   //�ŧi�]�D������}�C,��8�Ӷ]�D,��Ȭ�null(�򥻫��O�����,���󫬧O���Onull);lane���]�D
	private Car[] cars = new Car[8];     //�ŧi8�x���l
	private int rank;    //�ŧi�W��
	private boolean isRunning ; //�w�]�Ȭ�false,�Y���l�S���b�]
	
	public Racing5(){
		super("Racing Game");
		setLayout(new GridLayout(lanes.length+1,1)); // (lanes.length+1)�����O8�Ӷ]�D�A�[�W1�����s(Go);GridLayout(int rows, int cols)
		
		go = new JButton("Go");add(go);
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
				
		setSize(800,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void go(){
//		�`��:���UGo!��,�YisRunning(��true)�h���l�}�l�]�h����H�U�{��,���p�G�S��isRunning(false)���l�N���|�],
//      �ϥΪ̦p�G�A���@��Go!�|�A�s�W�t�~8�x���l�b�]�D�W���],�t���٬O�V�ӶV��,�M�쥻�{���@��,�S���ѨM�����D
//		isRunning =!isRunning;  //�t�t�o��,����true,�Y���l�A�]
//		if(isRunning){  //���pisRunning(�Y���l�b�]),�A���UGo!�h�|�A�s�W�t�~8�x���l�b�]�D�W���]
//			rank = 1;
//			//�h�x���l
//			for(int i=0;i<lanes.length; i++){
//				lanes[i].setText((i+1) + ". ");
//				}
//			for(int i=0; i<cars.length; i++){
//				cars[i] = new Car(i);
//				}
//			for(int i=0; i<cars.length; i++){
//				cars[i].start();
//				}
//		}
		
		//���l�S���b�]��,�~�|���s��8�x���l�b�]�D�W���],�@�����ƫ�Go!���|�v�T�쥻�����l
		if(!isRunning){   //��!isRunning���i�ରtrue,���i�ରfalse,�@�}�l��Go!�]isRunning��l�Ȭ�false,�ҥH!isRunning�t�t�o��,����true,�}�l����H�U�{��
			              //��w�g���UGo!���s,�hisRunning = true;�ҥH�ĤG����Go!���s,�h!isRunning��false,���|����H�U�{��,�G���l�]����,isRunning�n�^�_���l��,�n�AstopGame()�gisRunning = false;
			isRunning = true;
			rank = 1;
			//�h�x���l
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
	}
	
	private void stopGame(){    
		for(Car car:cars){
			car.interrupt();  //���l��������
		}  
		isRunning = false;  //���l�]����,isRunning�^�_���l��
	}
	
	private class Car extends Thread{   //�|�N���l�g�{�������O,��K�s���~�����O���ݩʩM��k
		private int whichlane;  //�����@�Ӷ]�D
		Car(int lane){this.whichlane= lane;}  //���l�����]�D
		
		@Override
		public void run() {  
			for(int i=0; i<100; i++){     //���l�]���B��,i<100�ۤv�ۭq 
				lanes[whichlane].setText(lanes[whichlane].getText()+ ">" );  //�g�~�����O�S����k�o�˨ϥ�,�g���������O,��K�s���~�����O���ݩʩM��k
				//API:setText(String text):Defines the single line of text this component will display.
				//API:getText():Returns the text string that the label displays.�^�Ǧr��
				try {
					Thread.sleep(10+(int)(Math.random()*200));      
					//���l���t���H��,(int)(Math.random()*200)���d��0~199,10+(int)(Math.random()*200)���d��10~209
				} catch (InterruptedException e) {  //�]��interrupt,try catch�|������ҥ~,�ҥH�{���g�b�ҥ~{}
					//System.out.println(lane + ":OK");  //2.��stop�|�]�X�ҥ~,�L�X���C,�ݸ��X�j��,�n��������,������QQ�o�C,����ؤ�k
					return;   //3.��k2:��k��������return
				} 
			}
				lanes[whichlane].setText(lanes[whichlane].getText() + "==> WINNER" );  //QQ  //rank++�����O�W���Ĥ@�W,�U�@�ӲĤG�W,...�H������
				stopGame();
		}
	}
	
	public static void main(String[] args) {
		new Racing5();
	}
}
