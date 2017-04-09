package tw.org.iii;
//擁有一條線
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JPanel;

public class MySignPanel extends JPanel{
	private LinkedList<HashMap<String,Integer>> line;   //擁有一條線
	
	public MySignPanel(){
		setBackground(Color.YELLOW);
		
		MyMouseListener listener = new MyMouseListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		
		line = new LinkedList<>();
		
		
	}
	//1. mouse event, 2. data structure, 3. draw
	
	@Override
	protected void paintComponent(Graphics g) {   //畫圖
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g; 
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(4));
		
		
		for(int i=1; i<line.size(); i++){
			HashMap<String,Integer> p0 = line.get(i-1);  
			HashMap<String,Integer> p1 = line.get(i);
			int x0 = p0.get("x"),y0 = p0.get("y");    //因為要畫線所以取出來
			int x1 = p1.get("x"),y1 = p1.get("y");
			g2d.drawLine(x0, y0, x1, y1);
			//g2d.drawLine(line.get(i-1).get("x"),line.get(i-1).get("y"),line.get(i).get("x"),line.get(i).get("y"));  //和上一列相同
		}
	}
	
	private class MyMouseListener extends MouseAdapter{  //內部類別
		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			HashMap<String,Integer> point = new HashMap<>(); 
			point.put("x",e.getX());
			point.put("y",e.getY());
			line.add(point);    //點和線須發生關係
		}
		@Override
			public void mouseDragged(MouseEvent e) {
				super.mouseDragged(e);
				HashMap<String,Integer> point = new HashMap<>(); 
				point.put("x",e.getX());
				point.put("y",e.getY());
				line.add(point);    //點和線須發生關係
				repaint();
			}
	}
}
