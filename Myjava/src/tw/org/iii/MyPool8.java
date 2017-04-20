package tw.org.iii;
//�إߦh���y,�C���y�]���W�v�����P,repaint()��s�W�v
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class MyPool8 extends JPanel{  //JPanel:��ܭ��O
	private Ball ball;   //�إ߲y���ݩ�
	private Timer timer; //�إߤ@�ӭp�ɾ��ݩ�
	private int viewW, viewH ;   //viewW, viewH���e�����e��
	private LinkedList<Ball> balls;    //�y�ܦh
	
	public MyPool8(){
		timer = new Timer();  //�إߤ@�ӭp�ɾ�����
		timer.schedule(new ViewTask(), 0, 60);  //�y���ʪ���s�W�v,�h�[�ݤ@��?0.6��
		balls = new LinkedList<>();  //�إ�balls LinkedList<>()����
		//ball = new Ball(10,10);    //�إߤ@�Ӳy����,�b�y�����O���]���s�W�y���غc��,�ҥH�i�H�]�w�@�}�l�y�b����
		//dx = dy = 10;  => ���i�u��,�����T�w,�_�h�C���y�]�o���@��
		//�إ�timer������
		//timer.schedule(ball, 1000, 60);   //�y���ʪ��ɶ��P��,�C���h�ַ|���q���]�ɳs��,16�����k,�P���Y16�����@    //���u���@���y���ɭ�,�h���y�N���ݦ��C
	    addMouseListener(new MyMouseAdapter());   //�إ߷ƹ�����
	}
	
	private class MyMouseAdapter extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {   //���U�ƹ��Უ�ͤ@���s���y
			Ball ball = new Ball(e.getX(), e.getY());   //�ƹ��������,�N�O�s�y��(x,y)�y��
			balls.add(ball);    //�Nball�W�[��balls�W
			timer.schedule(ball, 1000, 30+(int)(Math.random()*70));   //�g������,timer�O����y���첾  		
		}
	}
	private class ViewTask extends TimerTask{  //�t�~�إ�repaint()�ó]�w���W�v  //�����ݵe���O�T�w��,�W�v�ۤv�q�w,���Hrun()��,�Y�Hrun���@����s�W�v�|�e������
		@Override
		public void run() {
			repaint();
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		
		viewW = getWidth(); viewH = getHeight(); 
	
		g2d.setColor(Color.BLACK);   //�]��Graphics2D g2d = (Graphics2D)g,�ҥH�I���C��n���s�w�q
		g2d.fillRect(0, 0, viewW, viewH);  //fill�����O������,�����I�����d��O(640,480)������,(0,0)�O�}�l�񺡦�m   //XX
		
		g2d.setColor(Color.GREEN);
		//g2d.fillOval(0, 0, 40, 40);    //fill�����O������,�����y���j�p�e����40������,(0,0)�O�y���}�l��m
		//g2d.fillOval(ball.x, ball.y, 40, 40); => �e��@���y���ɭ�
		
		for(Ball ball :balls){     //�e�s�y
			g2d.fillOval(ball.x, ball.y, 40, 40);  //�s�y���y�Фμe��
		}
	}
	
	private class Ball extends TimerTask{   //�إ߲y�����O
		int x, y, dx, dy;  //�y���y��(x,y),�y���ʪ���m:dx,dy
		Ball(int x, int y){this.x=x;this.y=y; dx = dy = 10;}      
		//�إ߲y���غc��,�M�w�@�}�l�y�b����,�]�w��ball = new Ball(10,10);  //dx,dy�Q�n���u��,�b��dx = dy = 10����l��

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
		}
	}
}