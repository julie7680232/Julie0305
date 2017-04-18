package tw.org.iii;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DigitalSign extends JFrame{ 
	private JButton clear, undo, redo, save, open;
	private MySignPanel3 msp;     //���ק�W��
	
	public DigitalSign(){
		super("Digital Sign");//1
		setLayout(new BorderLayout());
		
		clear = new JButton("Clear");undo = new JButton("Undo");redo = new JButton("Redo");
		JPanel top = new JPanel(new FlowLayout());top.add(clear);top.add(undo);top.add(redo);
		add(top,BorderLayout.NORTH);
				
		msp = new MySignPanel3();  //�W�[�@�ӵe���b��������       //���ק�W��  
		add(msp,BorderLayout.CENTER);
		
		clear.addActionListener(new ActionListener() {      //���Uclear���s���H�U�Ʊ�,�Y�s�Wclear�\��
			//��clear���s�U�h�ѽ�ť��
			@Override
			public void actionPerformed(ActionEvent e) {
				msp.clear();  //�I�smsp(�YMySignPanel3)��clear��k
			}
		});
		
		undo.addActionListener(new ActionListener() {     //���Uundo���s���H�U�Ʊ�,�s�Wundo�\��
			//��undo���s�U�h�ѽ�ť��
			@Override
			public void actionPerformed(ActionEvent e) {
				msp.undo();
				
			}
		});
		
		redo.addActionListener(new ActionListener() {    //���Uredo���s���H�U�Ʊ�,�s�Wredo�\��
			//��redo���s�U�h�ѽ�ť��
			@Override
			public void actionPerformed(ActionEvent e) {
				msp.redo();
				
			}
		});
		
		setSize(640,480);//2
		setVisible(true);//3
		setDefaultCloseOperation(EXIT_ON_CLOSE);//4
		
	}
	
	public static void main(String[] args) {
		new DigitalSign();//5

	}

}
