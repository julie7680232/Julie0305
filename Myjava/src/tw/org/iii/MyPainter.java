package tw.org.iii;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
                         //fixed
public class MyPainter extends JPanel implements MouseListener{
	private  int x0,y0,x1,y1,x,y,w,h;
	public MyPainter(){ //
		setBackground(Color.yellow);
		addMouseListener(this);  //�e�U�ڦۤvť�ƹ�,�������w�q����5�ؤ�k��@,5�ؤ�k���n��
		x0 = y0 = x1 = y1 = -100;  //���F�קK�e���@�}�l�X�{�@�Ӭ�����I
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;  
		//�]���n�M��]�w�ʲӪ��{��,g�n��L���^���(�]���{�b�bjavax.swing��),�ҥH���s�]�wg,
		//�N�쥻��Graphics g �]�w��Graphics2D  g2d,Graphics2D�O�{Graphics�������O,
		//���s�]�w�@�ӰѼ�g2d�N���쥻��g 
		//���O�ڭn���l,�A���ڪk�ԧQ,���ڧ�k�ԧQ���^���,�j���૬�ܦ����l
		
		g2d.setStroke(new BasicStroke(4));  //�]�w�ʲӬ�4
		g2d.setColor(Color.RED);
		//g2d.setColor(Color.Blue);
		//g2d.drawLine(0,0,200,200);
		//g2d.drawLine(x0,y0,x1,y1);
		g2d.drawOval(x, y, w, h);
		//System.out.println("paint");
	}

	@Override
	public void mouseClicked(MouseEvent e) {  //MouseEvent�����O��T�b����;e�N�����O�ƥ�
		System.out.println("Clicked"); 
		//�ƹ��b��a�I�@�U�A��}�|�X�{Clicked,�Y���I�@�U���ʦA��}�h���|�X�{
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//System.out.println("Presses" + e.getX() + "X" + e.getY() + "Y" );
		//e���ƥ�,e.getX()�����O����{�����@�U�e����,�|�X�{����X��Y�y��
		x0 = e.getX(); y0 = e.getY();     //�ƹ��b�e�������Ĥ@�U���y��
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		x1 = e.getX(); y1 = e.getY();     //�ƹ��b�e�������Ĥ@�U���y�Ы�,��������,����A�I��},(x1,y1)����A�I�y��
		int r = Math.abs(x0-x1);           //�o�����(�ζ��)���b�|
		w = h = 2*r;                       //����(�ζ��)���e����2���b�|
		x = x0 - r;                        //�o��b�|��,�Ĥ@�I���y��(x0,y0)�����b�|�Y������(�ζ��)���̥��W�����y��(x,y)   
		y = y0 - r;
		//System.out.println("Released");
		repaint();
	}
}