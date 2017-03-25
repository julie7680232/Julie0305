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
                         //fixed
public class MyPainter3 extends JPanel implements MouseListener{  //需要實作MouseListener,若設定後不需要考這張實作證照
	private  int x0,y0,x1,y1,x,y,w,h;
	private MyMouseAdapter  myMouseAdapter; 
	public MyPainter3(){ //
		setBackground(Color.yellow);
		addMouseListener(this);  //委託我自己聽滑鼠
		
		
		addMouseListener(new MyMouseAdapter());   //此列和上一列都可以聽
		x0 = y0 = x1 = y1 = -100;  //為了避免畫面一開始出現一個紅色圓點
	}
	void  setX0(int x0){this.x0}//沒有傳回值set用void
	int //需要傳回值,get用int
	
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;  
		//因為要尋找設定粗細的程式,g要把他打回原形(因為現在在javax.swing中),所以重新設定g,
		//將原本的Graphics g 設定成Graphics2D  g2d,Graphics2D是認Graphics為父類別,
		//重新設定一個參數g2d代替原本的g 
		//像是我要車子,你給我法拉利,但我把法拉利打回原形,強制轉型變成車子
		
		g2d.setStroke(new BasicStroke(4));  //設定粗細為4
		g2d.setColor(Color.RED);
		//g2d.setColor(Color.Blue);
		//g2d.drawLine(0,0,200,200);
		//g2d.drawLine(x0,y0,x1,y1);
		g2d.drawOval(x, y, w, h);
		//System.out.println("paint");
	}
	void changeLine(int x1,int y1);
	

	@Override
	public void mouseClicked(MouseEvent e) {  //MouseEvent指的是資訊在那邊;e代表的是事件
		System.out.println("Clicked"); 
		//滑鼠在原地點一下再放開會出現Clicked,若先點一下移動再放開則不會出現
		                            
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
		//e為事件,e.getX()指的是執行程式按一下畫面時,會出現按的X及Y座標
		x0 = e.getX(); y0 = e.getY();     //滑鼠在畫面中按第一下之座標
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		x1 = e.getX(); y1 = e.getY();     //滑鼠在畫面中按第一下之座標後,按住不放,直到A點放開,(x1,y1)此為A點座標
		int r = Math.abs(x0-x1);           //得到橢圓形(或圓形)之半徑
		w = h = 2*r;                       //橢圓形(或圓形)之寬高為2倍半徑
		x = x0 - r;                        //得到半徑後,第一點之座標(x0,y0)扣掉半徑即為橢圓形(或圓形)之最左上角之座標(x,y)   
		y = y0 - r;
		//System.out.println("Released");
		repaint();
		
	}

}

class MyMouseAdapter extends MouseAdapter{
	private MyPainter3 painter;
	public MyMouseAdapter (MyPainter3 painter);
	
	@Override
	public void mousePressed(MouseEvent e) {

		x0 = e.getX(); y0 = e.getY();     //滑鼠在畫面中按第一下之座標
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		super.mouseReleased(e);
		int x1 = e.getX(); y1 = e.getY();    
		painter .setX1
		
		painter.changeLine(x1), y1);
		
	}

}