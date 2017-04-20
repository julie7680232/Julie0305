package tw.org.iii;
//�إ߲y���غc��,�i�H�]�w�y�@�}�l����m
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class MyPool5 extends JPanel{  //JPanel:��ܭ��O
	private Ball ball;   //�إ߲y���ݩ�
	private Timer timer; //�إߤ@�ӭp�ɾ��ݩ�
	private int viewW, viewH, dx, dy ;   //viewW, viewH���e�����e��,dx, dy�����ʪ���m
	
	public MyPool5(){
		timer = new Timer();  //�إߤ@�ӭp�ɾ�����
		ball = new Ball(10,10);    //�إߤ@�Ӳy����,�b�y�����O���]���s�W�y���غc��,�ҥH�i�H�]�w�@�}�l�y�b����
		dx = dy = 10;
		//�إ�timer������
		timer.schedule(ball, 1000, 60);   //�y���ʪ��ɶ��P��,�C��h�ַ|���q���]�ɳs��,16���k,�P���Y16�����@
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		
		viewW = getWidth(); viewH = getHeight(); 
	
		g2d.setColor(Color.BLACK);   //�]��Graphics2D g2d = (Graphics2D)g,�ҥH�I���C��n���s�w�q
		g2d.fillRect(0, 0, viewW, viewH);  //fill�����O������,�����I�����d��O(640,480)������,(0,0)�O�}�l�񺡦�m   //XX
		
		g2d.setColor(Color.GREEN);
		//g2d.fillOval(0, 0, 40, 40);    //fill�����O������,�����y���j�p�e����40������,(0,0)�O�y���}�l��m
		g2d.fillOval(ball.x, ball.y, 40, 40); 
	}
	
	private class Ball extends TimerTask{   //�إ߲y�����O
		int x,y;  //�y���y��(x,y)
		Ball(int x, int y){this.x=x;this.y=y;}   //�إ߲y���غc��,�M�w�@�}�l�y�b����,�]�w��ball = new Ball(10,10);

		@Override
		public void run() {  //�ɶ���F���o���
			//��ɸI���?
			if(x<0 || (x+40 > viewW)){  //x<0 =>��������� ; x+40 =>���k�����
				dx *= -1;  //����x��V
			}   
			if(y<0 || (y+40 > viewH)){  //���U�����
				dy *= -1;  //����y��V
			} 
			x += dx;  //x�y�в���dx=10
			y += dy;  //y�y�в���dy=10
			repaint();
		}
	}
}
