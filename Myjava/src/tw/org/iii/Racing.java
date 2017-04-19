package tw.org.iii;
//�s�@�ɨ��]�D:������Ҥl(�@���]�D�@�x��),���{�����@��bug,�p�G���UGo!�{���}�l�],�A����2��Go!���s,�h�|���U�h�]
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing extends JFrame{
	private JButton go;     //���s�B�J2.
	private JLabel lane;   //���s�B�J3. //lane���]�D
	public Racing(){
		super("Racing Game");  //�������ͨB�J1.
		setLayout(new GridLayout(2,1)); //���s�B�J1.GridLayout(int rows, int cols)
		
		go = new JButton("Go");    //���s�B�J4.
		lane = new JLabel("1. ");  //���s�B�J5.
		
		add(go);add(lane);        //���s�B�J6.
		
		go.addActionListener(new ActionListener() {   //���l�n�]���B�J2.���UGo!���s,�|�]�H�U�{��
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
				
		setSize(800,480);   //�������ͨB�J2.
		setVisible(true);   //�������ͨB�J3.
		setDefaultCloseOperation(EXIT_ON_CLOSE);  //�������ͨB�J4.
	}
	
	private void go(){   ////���l�n�]���B�J3.
		Car car1 = new Car();
		car1.start();
	}

	private class Car extends Thread{  //�|�N���l�g�{�������O,��K�s���~�����O���ݩʩM��k
		@Override
		public void run() {    //���l�n�]���B�J1.
			for(int i=0; i<100; i++){  //���l�]���B��,i<100�ۤv�ۭq   
				lane.setText(lane.getText()+ ">" );  //�g�~�����O�S����k�o�˨ϥ�,�g���������O,��K�s���~�����O���ݩʩM��k
				//API:setText(String text):Defines the single line of text this component will display.
				//API:getText():Returns the text string that the label displays.�^�Ǧr��
				try {
					Thread.sleep(100);      //����{����]�ӧ֨S���Pı,��">"�]�C�@�I
				} catch (InterruptedException e) {
				} 
			}
		}
	} 
	
	public static void main(String[] args) {
		new Racing();     //�������ͨB�J5.
	}
}
