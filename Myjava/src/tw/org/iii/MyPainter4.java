package tw.org.iii;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.dnd.MouseDragGestureRecognizer;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
                     
public class MyPainter4 extends JPanel { 
	private  int x0,y0,x1,y1,x,y,w,h; 
	public MyPainter4(){ //
		setBackground(Color.yellow);
		addMouseListener(new MyMouseAdapter());   //���C�M�W�@�C���i�Hť
		x0 = y0 = x1 = y1 = -100;  //���F�קK�e���@�}�l�X�{�@�Ӭ�����I
	}

	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;  
		//�]���n�M��]�w�ʲӪ��{��,g�n��L���^���(�]���{�b�bjavax.swing��),�ҥH���s�]�wg,
		//�N�쥻��Graphics g �]�w��Graphics2D  g2d,Graphics2D�O�{Graphics�������O,
		//���s�]�w�@�ӰѼ�g2d�N���쥻��g 
		//���O�ڭn���l,�A���ڪk�ԧQ,���ڧ�k�ԧQ���^���,�j���૬�ܦ����l
		
		g2d.setStroke(new BasicStroke(4));  //�]�w�ʲӬ�4
		g2d.setColor(Color.RED);
		//g2d.setColor(Color.Blue);
		//g2d.drawLine(0,0,200,200);
		//g2d.drawLine(x0,y0,x1,y1);
		g2d.drawOval(x, y, w, h);
		//System.out.println("paint");
	}
	void  changeLine
	
}
	
private	class MyMouse
	
}