package tw.org.iii;
//建立球的建構式,可以設定球一開始之位置
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class MyPool5 extends JPanel{  //JPanel:顯示面板
	private Ball ball;   //建立球的屬性
	private Timer timer; //建立一個計時器屬性
	private int viewW, viewH, dx, dy ;   //viewW, viewH為畫面之寬高,dx, dy為移動的位置
	
	public MyPool5(){
		timer = new Timer();  //建立一個計時器物件
		ball = new Ball(10,10);    //建立一個球物件,在球的類別中因為新增球的建構式,所以可以設定一開始球在哪裡
		dx = dy = 10;
		//建立timer之任務
		timer.schedule(ball, 1000, 60);   //球移動的時間周期,每秒多少會讓電腦跑時連續,16秒左右,周期即16分之一
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		
		viewW = getWidth(); viewH = getHeight(); 
	
		g2d.setColor(Color.BLACK);   //因為Graphics2D g2d = (Graphics2D)g,所以背景顏色要重新定義
		g2d.fillRect(0, 0, viewW, viewH);  //fill指的是全部填滿,此指背景的範圍是(640,480)全部填滿,(0,0)是開始填滿位置   //XX
		
		g2d.setColor(Color.GREEN);
		//g2d.fillOval(0, 0, 40, 40);    //fill指的是全部填滿,此指球的大小寬高為40全部填滿,(0,0)是球的開始位置
		g2d.fillOval(ball.x, ball.y, 40, 40); 
	}
	
	private class Ball extends TimerTask{   //建立球的類別
		int x,y;  //球有座標(x,y)
		Ball(int x, int y){this.x=x;this.y=y;}   //建立球的建構式,決定一開始球在哪裡,設定於ball = new Ball(10,10);

		@Override
		public void run() {  //時間到了做這件事
			//何時碰牆壁?
			if(x<0 || (x+40 > viewW)){  //x<0 =>撞左邊牆壁 ; x+40 =>撞右邊牆壁
				dx *= -1;  //改變x方向
			}   
			if(y<0 || (y+40 > viewH)){  //撞下面牆壁
				dy *= -1;  //改變y方向
			} 
			x += dx;  //x座標移動dx=10
			y += dy;  //y座標移動dy=10
			repaint();
		}
	}
}
