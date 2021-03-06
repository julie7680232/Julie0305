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
                         
public class MyPainter5 extends JPanel 
//implements MouseListener  //因為不需要此證照的五種方法,已被刪除,故實作此證照要刪除
{
	private  int x0,y0,x1,y1,x,y,w,h;
	public MyPainter5(){ 
		setBackground(Color.yellow);
		addMouseListener(new MyMouseAdapter2());       //MyMouseAdapter()改為內部類別,非外部類別,所以名稱可不用執行更改
		x0 = y0 = x1 = y1 = -100;  
	}
	
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g; 
		
		g2d.setStroke(new BasicStroke(4));  
		g2d.setColor(Color.RED);
		g2d.drawLine(x0,y0,x1,y1);
		//g2d.drawOval(x, y, w, h);
	}
	
	private class MyMouseAdapter2 extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			x0 = e.getX(); y0 = e.getY(); 
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			super.mouseReleased(e);
			x1 = e.getX(); y1 = e.getY();     
			int r = Math.abs(x0-x1);        
			w = h = 2*r;                      
			x = x0 - r;                       
			y = y0 - r;
			repaint();
		}
	}
	
	
}