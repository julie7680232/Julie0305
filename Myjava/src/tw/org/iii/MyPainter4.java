package tw.org.iii;
import java.awt.BasicStroke;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
                         
public class MyPainter4 extends JPanel 
//implements MouseListener  //�]�����ݭn���ҷӪ����ؤ�k,�w�Q�R��,�G��@���ҷӭn�R��
{
	private  int x0,y0,x1,y1,x,y,w,h;
	private MyMouseAdapter myMouseAdapter;   //1.
	public MyPainter4(){ 
		setBackground(Color.yellow);
		myMouseAdapter = new MyMouseAdapter(this);    //2.
		addMouseListener(myMouseAdapter);       //3.
		x0 = y0 = x1 = y1 = -100;  
	}
	
	void setX0(int x0){this.x0=x0;}   //�S���Ǧ^��set��void
	void setY0(int y0){this.y0=y0;}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g; 
		
		g2d.setStroke(new BasicStroke(4));  
		g2d.setColor(Color.RED);
		g2d.drawLine(x0,y0,x1,y1);
		//g2d.drawOval(x, y, w, h);
	}
	void changeLine(int x1,int y1){
		this.x1 = x1;this.y1 = y1;
		int r = Math.abs(x0-this.x1);        
		w = h = 2*r;                      
		x = x0 - r;                       
		y = y0 - r;
		repaint();
	}
}
//��������LMyPainter�ݭn�⦹������������,�]��MyMouseAdapter�ŧi��private,���Opublic  ,���D�令MyMouseAdapter4

class MyMouseAdapter extends MouseAdapter{   //����n�~��,�]����H���O,�w��کһݭn����@,���ݭn��MyPainter�C�Ӥ�k���ݭn��@
	private MyPainter4 painter;
	public MyMouseAdapter(MyPainter4 myPainter){            //�MMyPainter4�������Y
		this.painter = myPainter;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		super.mousePressed(e);
		painter.setX0(e.getX());
		painter.setY0(e.getY());
		//x0 = e.getX(); y0 = e.getY(); 
	}
	
	@Override
		public void mouseReleased(MouseEvent e) {
			super.mouseReleased(e);
			int x1 = e.getX(),y1 = e.getY();
			painter.changeLine(x1, y1);
		}
}
