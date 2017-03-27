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
                         
public class MyPainter3 extends JPanel implements MouseListener{
	private  int x0,y0,x1,y1,x,y,w,h;
	private MyMouseAdapter myMouseAdapter;   //1.
	public MyPainter3(){ 
		setBackground(Color.yellow);
		addMouseListener(this);                        //第一種方式聽
		myMouseAdapter = new MyMouseAdapter(this);    //2.
		addMouseListener(myMouseAdapter);       //3.
		//addMouseListener(new MyMouseAdapter());        //第二種方式聽,有兩種方式都可以聽,此行可取代1.2.3.
		x0 = y0 = x1 = y1 = -100;  
	}
	
	void setX0(int x0){this.x0=x0;}   //沒有傳回值set用void
	void setY0(int y0){this.y0=y0;}
	void setX1(int x1){this.x1=x1;}
	void setY1(int y1){this.y1=y1;}
	int getX0(){return x0;}         //需要傳回值,get用int
	int getY0(){return y0;}
	int getXX(){return x;}      
	int getYY(){return y;}
	int getWW(){return w;}        
	int getHH(){return h;}
	void setXX(int x){this.x=x;}
	void setYY(int y){this.y=y;}
	void setWW(int w){this.w=w;}
	void setHH(int h){this.h=h;}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;  
		
		
		g2d.setStroke(new BasicStroke(4));  
		g2d.setColor(Color.RED);
		//g2d.setColor(Color.Blue);
		//g2d.drawLine(0,0,200,200);
		//g2d.drawLine(x0,y0,x1,y1);
		g2d.drawOval(x, y, w, h);
		//System.out.println("paint");
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
		//System.out.println("Presses" + e.getX() + "X" + e.getY() + "Y" );
		x0 = e.getX(); y0 = e.getY(); 
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		x1 = e.getX(); y1 = e.getY();     
		int r = Math.abs(x0-x1);        
		w = h = 2*r;                      
		x = x0 - r;                       
		y = y0 - r;
		repaint();
	}
}

class MyMouseAdapter extends MouseAdapter{   //為何要繼承,因為抽象類別,針對我所需要的實作,不需要像MyPainter每個方法都需要實作
	private MyPainter3 painter;
	public MyMouseAdapter(MyPainter3 myPainter3){            //和MyPainter2產生關係
		this.painter = myPainter3;
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
			painter.setX1(x1);
			painter.setY1(y1);
			//x1 = e.getX(); y1 = e.getY();    	 
			int r = Math.abs(painter.getX0()-x1);        
			painter.setWW(2*r);
			painter.setHH(2*r);
			//w = h = 2*r;      
			painter.setXX(painter.getX0()-r);
			painter.setYY(painter.getY0()-r);
			//x = x0 - r;                       
			//y = y0 - r;
			painter.repaint();
			
		}
}

