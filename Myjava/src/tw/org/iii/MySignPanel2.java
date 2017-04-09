package tw.org.iii;
//�֦��h���u
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JPanel;

public class MySignPanel2 extends JPanel{
	private LinkedList<LinkedList<HashMap<String,Integer>>> lines;   //�֦��h���u,��LinkedList(�i����,�����ǩ�)
	//HashMap<String,Integer>�O�@���I
	//<LinkedList<HashMap<String,Integer>>�O�ܦh�I���X�ܦ��@���u
	
	
	public MySignPanel2(){
		setBackground(Color.YELLOW);
		
		MyMouseListener listener = new MyMouseListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		
		lines = new LinkedList<>();
		
		
	}
	//1. mouse event, 2. data structure, 3. draw
	
	@Override
	protected void paintComponent(Graphics g) {   //�e��
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g; 
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(4));
		
		for(LinkedList<HashMap<String,Integer>> line : lines){  //�k��O�M�X����H,����O�M�X�̪�����F��;�����M�X�Ҧ��u���@���u
			for(int i=1; i<line.size(); i++){
			HashMap<String,Integer> p0 = line.get(i-1);  
			HashMap<String,Integer> p1 = line.get(i);
			int x0 = p0.get("x"),y0 = p0.get("y");    //�]���n�e�u�ҥH���X��
			int x1 = p1.get("x"),y1 = p1.get("y");
			g2d.drawLine(x0, y0, x1, y1);
			//g2d.drawLine(line.get(i-1).get("x"),line.get(i-1).get("y"),line.get(i).get("x"),line.get(i).get("y"));  //�M�W�@�C�ۦP
			}
		}
	}
	
	private class MyMouseListener extends MouseAdapter{  //�������O
		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			LinkedList<HashMap<String,Integer>> line = new LinkedList<>();//(x0,y0)��(x1,y1)�@�@���u��,(x1,y1)���U�@���s�u���_�I
			
			HashMap<String,Integer> point = new HashMap<>(); 
			point.put("x",e.getX());
			point.put("y",e.getY());
			line.add(point);    //�I�M�u���o�����Y
			
			lines.add(line);  //�Ĥ@���s�u�s������򪺽u
		}
		@Override
			public void mouseDragged(MouseEvent e) {
				super.mouseDragged(e);
				HashMap<String,Integer> point = new HashMap<>(); 
				point.put("x",e.getX());
				point.put("y",e.getY());
				lines.getLast().add(point);    //�̫�@���I��򪾹D���O�̫�@���I��u�s���_��,��getLast()
				repaint();
			}
	}
}
