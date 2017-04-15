package tw.org.iii;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Brad95 extends JFrame{

	public static void main(String[] args) {
		private MyClock myClock;
		private Mypool mypool;
		Brad95(){
			setLayout(new BorderLayout());
			
			myClock = new MyClock;
			add(myClock,BorderLayout.NORTH);
			
			setSize(640,480);
			setVisable(true);
			
		}

	}

}
