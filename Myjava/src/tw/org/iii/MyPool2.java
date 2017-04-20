package tw.org.iii;
//���y�i�H����
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class MyPool2 extends JPanel{  //JPanel:��ܭ��O
	private Ball ball;   //�إ߲y���ݩ�
	private Timer timer; //�إߤ@�ӭp�ɾ��ݩ�
	
	public MyPool2(){
		timer = new Timer();  //�إߤ@�ӭp�ɾ�����
		ball = new Ball();    //�إߤ@�Ӳy����
		//�إ�timer������
		timer.schedule(ball, 1000, 60);   //�y���ʪ��ɶ��P��,�C��h�ַ|���q���]�ɳs��,16���k,�P���Y16�����@
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
	
		g2d.setColor(Color.BLACK);   //�]��Graphics2D g2d = (Graphics2D)g,�ҥH�I���C��n���s�w�q
		g2d.fillRect(0, 0, 640, 480);  //fill�����O������,�����I�����d��O(640,480)������,(0,0)�O�}�l�񺡦�m
		
		g2d.setColor(Color.GREEN);
		//g2d.fillOval(0, 0, 40, 40);    //fill�����O������,�����y���j�p�e����40������,(0,0)�O�y���}�l��m
		g2d.fillOval(ball.x, ball.y, 40, 40); 
	}
	
	private class Ball extends TimerTask{   //�إ߲y�����O
		int x,y;  //�y���y��(x,y)

		@Override
		public void run() {   //�ɶ���F���o���
			x += 10;  //x�y�в���10
			y += 10;  //y�y�в���10
			repaint();
		}
	}
}
