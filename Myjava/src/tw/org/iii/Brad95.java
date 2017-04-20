package tw.org.iii;
//跑MyClock及MyPool及MyPool2~8之視窗程式
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Brad95 extends JFrame{
	private MyClock myClock;  //定義屬性時鐘
	private MyPool8 myPool;   //須修改名稱
	
	Brad95(){
		setLayout(new BorderLayout());
		
		myClock = new MyClock();          //將時鐘建立新的物件
		add(myClock,BorderLayout.NORTH);  //時鐘放在面板北邊
		
		myPool = new MyPool8();          //將時鐘建立新的物件        //須修改名稱
		add(myPool,BorderLayout.CENTER);  //時鐘放在面板北邊
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Brad95();
	}
}
