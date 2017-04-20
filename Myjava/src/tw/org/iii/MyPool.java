package tw.org.iii;
//建立背景及球
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class MyPool extends JPanel{  //JPanel:顯示面板

	public MyPool(){
		setBackground(Color.BLACK);
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
	
		g2d.setColor(Color.BLACK);   //因為Graphics2D g2d = (Graphics2D)g,所以背景顏色要重新定義
		g2d.fillRect(0, 0, 640, 480);  //fill指的是全部填滿,此指背景的範圍是(640,480)全部填滿,(0,0)是開始填滿位置
		
		g2d.setColor(Color.GREEN);
		g2d.fillOval(0, 0, 40, 40);    //fill指的是全部填滿,此指球的大小寬高為40全部填滿,(0,0)是球的開始位置

	}
}
