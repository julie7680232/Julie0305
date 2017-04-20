package tw.org.iii;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class MyPool9 extends JPanel{  //JPanel:��ܭ��O
//	private Ball ball;
//	private Timer timer;
//	private int viewW,viewH, dx, dy;
	private LinkedList<Ball> balls;
	public MyPool9(){
//		timer = new Timer();
		timer.schedule(new ViewTask(), 0, 60);
		balls = new LinkedList<>();
		ball = new Ball(10,10);   //2.�]�w�D�b���̶}�l�],�]�w10,10
		//dx = dy = 10 ;  //�C���y���ۦP��dx,dy
		//timer.schedule(ball, 1000, 60);
//		setBackground(Color.BLACK);
		addMouseListener(new MyMouseAdapter());
	}
	private class MyMouseAdapter extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			Ball ball = new Ball{e.getY(),e.getY()};
			balls.add(ball);
			timer.schedule(ball, 1000, (int)(Math.random()*70);  //�y���ʪ���s�W�v:60
		}
	}
	private class ViewTask extends TimerTask{
		@Override
		public void run() {
			repaint();
			
		}
	}
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		//viewW = getWidth();
		//viewH = getHeight();
	
//		g2d.setColor(Color.BLACK);   //�]��Graphics2D g2d = (Graphics2D)g,�ҥH�I���C��n���s�w�q
//		g2d.fillRect(0, 0, 640, 480); //�令g2d.fillRect(0, 0, viewW, viewH); 
		//g2d.fillRect(0, 0, viewW, viewH); 
		
//		g2d.setColor(Color.GREEN);
//		g2d.fillOval(0, 0, 40, 40);
		for(Ball ball : balls){
			g2d.drawOval(ball.x, ball.y, 40, 40);
		}
	}
	private class Ball extends TimerTask{
		int x,y,dx,dy;
		Ball(int x, int y){this.x=x;this.y=y; dx = dy = 10;}  //1.�]�w�D�b���̶}�l�]   // dx = dy = 10 �]�w�C���y�����Pdx,dy
		
//		@Override
//		public void run() {
//			if(x<0 || x+40 > viewW){
//				dx *=-1;  //����x��V
//			}
//			if(y<0 || y+40 > viewH){
//				dy *=-1;  //����y��V
//			}
//			x += dx;
//			y += dy;
//			repaint();
//		}
	}
}


