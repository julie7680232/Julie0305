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
		addMouseListener(new MyMouseAdapter());   //此列和上一列都可以聽
		x0 = y0 = x1 = y1 = -100;  //為了避免畫面一開始出現一個紅色圓點
	}

	
	
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
	void  changeLine
	
}
	
private	class MyMouse
	
}