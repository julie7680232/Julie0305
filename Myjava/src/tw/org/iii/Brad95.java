package tw.org.iii;
//�]MyClock��MyPool��MyPool2~8�������{��
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Brad95 extends JFrame{
	private MyClock myClock;  //�w�q�ݩʮ���
	private MyPool8 myPool;   //���ק�W��
	
	Brad95(){
		setLayout(new BorderLayout());
		
		myClock = new MyClock();          //�N�����إ߷s������
		add(myClock,BorderLayout.NORTH);  //������b���O�_��
		
		myPool = new MyPool8();          //�N�����إ߷s������        //���ק�W��
		add(myPool,BorderLayout.CENTER);  //������b���O�_��
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Brad95();
	}
}
