package tw.org.iii;
//新增clear.undo.redo.color
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JPanel;

public class MySignPanel3 extends JPanel{
	private LinkedList<LinkedList<HashMap<String,Integer>>> lines,recycle;   //擁有多條線,用LinkedList(可重複,有順序性)
	//HashMap<String,Integer>是一個點
	//<LinkedList<HashMap<String,Integer>>是很多點結合變成一條線
	
	
	public MySignPanel3(){
		setBackground(Color.YELLOW);
		
		MyMouseListener listener = new MyMouseListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		
		lines = new LinkedList<>();
		recycle = new LinkedList<>();
		
		
	}
	//1. mouse event, 2. data structure, 3. draw
	
	@Override
	protected void paintComponent(Graphics g) {   //畫圖
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g; 
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(4));
		
		for(LinkedList<HashMap<String,Integer>> line : lines){  //右邊是尋訪之對象,左邊是尋訪裡的什麼東西;此為尋訪所有線的一條線
			for(int i=1; i<line.size(); i++){
			HashMap<String,Integer> p0 = line.get(i-1);  
			HashMap<String,Integer> p1 = line.get(i);
			int x0 = p0.get("x"),y0 = p0.get("y");    //因為要畫線所以取出來
			int x1 = p1.get("x"),y1 = p1.get("y");
			g2d.drawLine(x0, y0, x1, y1);
			//g2d.drawLine(line.get(i-1).get("x"),line.get(i-1).get("y"),line.get(i).get("x"),line.get(i).get("y"));  //和上一列相同
			}
		}
	}

	public void clear(){  
		lines.clear();
		repaint();
	}
	public void undo(){
		//lines.removeLast();
		if(lines.size()>0){
			recycle.add(lines.removeLast());    //你丟我檢,為了製作redo
			repaint();
		}
	}
	public void redo(){
		if(recycle.size()>0){
			lines.add(recycle.removeLast());     //畫一條新線,但資源回收桶還可以叫回舊線故增加第78列
			repaint();
		}
	}
	
	
	
	private class MyMouseListener extends MouseAdapter{  //內部類別
		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			//draw a new line
			recycle.clear();
		
			LinkedList<HashMap<String,Integer>> line = new LinkedList<>();//(x0,y0)到(x1,y1)作一條線後,(x1,y1)為下一條新線的起點
			
			HashMap<String,Integer> point = new HashMap<>(); 
			point.put("x",e.getX());
			point.put("y",e.getY());
			line.add(point);    //點和線須發生關係
			
			lines.add(line);  //第一條新線連結到後續的線
			
		}
		@Override
			public void mouseDragged(MouseEvent e) {
				super.mouseDragged(e);
				HashMap<String,Integer> point = new HashMap<>(); 
				point.put("x",e.getX());
				point.put("y",e.getY());
				lines.getLast().add(point);    //最後一個點怎麼知道它是最後一個點把線連結起來,用getLast()
				repaint();
				
				
			}
	}
}
