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

public class MyPool9 extends JPanel{  //JPanel:顯示面板
//	private Ball ball;
//	private Timer timer;
//	private int viewW,viewH, dx, dy;
	private LinkedList<Ball> balls;
	public MyPool9(){
//		timer = new Timer();
		timer.schedule(new ViewTask(), 0, 60);
		balls = new LinkedList<>();
		ball = new Ball(10,10);   //2.設定求在哪裡開始跑,設定10,10
		//dx = dy = 10 ;  //每顆球都相同的dx,dy
		//timer.schedule(ball, 1000, 60);
//		setBackground(Color.BLACK);
		addMouseListener(new MyMouseAdapter());
	}
	private class MyMouseAdapter extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			Ball ball = new Ball{e.getY(),e.getY()};
			balls.add(ball);
			timer.schedule(ball, 1000, (int)(Math.random()*70);  //球移動的更新頻率:60
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
	
//		g2d.setColor(Color.BLACK);   //因為Graphics2D g2d = (Graphics2D)g,所以背景顏色要重新定義
//		g2d.fillRect(0, 0, 640, 480); //改成g2d.fillRect(0, 0, viewW, viewH); 
		//g2d.fillRect(0, 0, viewW, viewH); 
		
//		g2d.setColor(Color.GREEN);
//		g2d.fillOval(0, 0, 40, 40);
		for(Ball ball : balls){
			g2d.drawOval(ball.x, ball.y, 40, 40);
		}
	}
	private class Ball extends TimerTask{
		int x,y,dx,dy;
		Ball(int x, int y){this.x=x;this.y=y; dx = dy = 10;}  //1.設定求在哪裡開始跑   // dx = dy = 10 設定每顆球有不同dx,dy
		
//		@Override
//		public void run() {
//			if(x<0 || x+40 > viewW){
//				dx *=-1;  //改變x方向
//			}
//			if(y<0 || y+40 > viewH){
//				dy *=-1;  //改變y方向
//			}
//			x += dx;
//			y += dy;
//			repaint();
//		}
	}
}


