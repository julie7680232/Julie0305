package tw.org.iii;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.MouseListener;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class MyPainter extends JPanel implements MouseListener{
	private  int x0,y0,x1,y1,x,y,w,h;
	public MyPainter(){ //
		setBackground(Color.yellow);
		addMouseListener(this);
		x0 = y0 = x1 = y1 = -1;
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setStroke(new BasicStroke(4));
		g2d.setColor(Color.RED);
		g2d.drawLine(x0,y0,x1,y1);
		g2d.drawOval(x, y, w, h);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Clicked");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x0 =e.getX();y0 =e.getY();
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		x1 =e.getX();y1 =e.getY();
		int r = Math.abs(x0-x1);
		w = h = 2*r;
		x=x0-r;
		y=y0-r;
		repainr();  //­«µe
	}

}
