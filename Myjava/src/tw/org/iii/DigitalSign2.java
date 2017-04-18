package tw.org.iii;
//�u�i�H����C��
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.security.auth.login.AccountLockedException;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DigitalSign2 extends JFrame{ 
	private JButton clear, undo, redo, save, open, color;
	private MySignPanel3 msp;     //���ק�W��
	
	public DigitalSign2(){
		super("Digital Sign");//1
		setLayout(new BorderLayout());
		
		clear = new JButton("Clear");undo = new JButton("Undo");redo = new JButton("Redo");
		color = new JButton("Color");
		JPanel top = new JPanel(new FlowLayout());top.add(clear);top.add(undo);top.add(redo);top.add(color);
		add(top,BorderLayout.NORTH);
				
		msp = new MySignPanel3();  //���ק�W��
		add(msp,BorderLayout.CENTER);
		
		clear.addActionListener(new ActionListener() {      //���Uclear���s���H�U�Ʊ�,�Y�s�Wclear�\��
			//��clear���s�U�h�ѽ�ť��
			@Override
			public void actionPerformed(ActionEvent e) {
				msp.clear();
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
		
		color.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			Color newColor = JColorChooser.showDialog(DigitalSign2.this, "Select a Color", Color.BLUE);	
			//API:showDialog(Component component, String title, Color initialColor)
			//API:javax.swing => JColorChooser =>showDialog
			}
		});
		
		
		
		
		
		setSize(640,480);//2
		setVisible(true);//3
		setDefaultCloseOperation(EXIT_ON_CLOSE);//4
		
	}
	
	public static void main(String[] args) {
		new DigitalSign2();//5

	}

}
