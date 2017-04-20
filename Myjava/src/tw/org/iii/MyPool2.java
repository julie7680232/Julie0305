package tw.org.iii;
//讓球可以移動
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class MyPool2 extends JPanel{  //JPanel:顯示面板
	private Ball ball;   //建立球的屬性
	private Timer timer; //建立一個計時器屬性
	
	public MyPool2(){
		timer = new Timer();  //建立一個計時器物件
		ball = new Ball();    //建立一個球物件
		//建立timer之任務
		timer.schedule(ball, 1000, 60);   //球移動的時間周期,每秒多少會讓電腦跑時連續,16秒左右,周期即16分之一
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
	
		g2d.setColor(Color.BLACK);   //因為Graphics2D g2d = (Graphics2D)g,所以背景顏色要重新定義
		g2d.fillRect(0, 0, 640, 480);  //fill指的是全部填滿,此指背景的範圍是(640,480)全部填滿,(0,0)是開始填滿位置
		
		g2d.setColor(Color.GREEN);
		//g2d.fillOval(0, 0, 40, 40);    //fill指的是全部填滿,此指球的大小寬高為40全部填滿,(0,0)是球的開始位置
		g2d.fillOval(ball.x, ball.y, 40, 40); 
	}
	
	private class Ball extends TimerTask{   //建立球的類別
		int x,y;  //球有座標(x,y)

		@Override
		public void run() {   //時間到了做這件事
			x += 10;  //x座標移動10
			y += 10;  //y座標移動10
			repaint();
		}
	}
}
