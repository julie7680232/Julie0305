package tw.org.iii;
//�إ߭I���βy
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class MyPool extends JPanel{  //JPanel:��ܭ��O

	public MyPool(){
		setBackground(Color.BLACK);
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
	
		g2d.setColor(Color.BLACK);   //�]��Graphics2D g2d = (Graphics2D)g,�ҥH�I���C��n���s�w�q
		g2d.fillRect(0, 0, 640, 480);  //fill�����O������,�����I�����d��O(640,480)������,(0,0)�O�}�l�񺡦�m
		
		g2d.setColor(Color.GREEN);
		g2d.fillOval(0, 0, 40, 40);    //fill�����O������,�����y���j�p�e����40������,(0,0)�O�y���}�l��m

	}
}
