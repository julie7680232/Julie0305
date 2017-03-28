package tw.org.iii;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Brad35 extends JFrame{  // teacher Brad24
	private JButton open,save,exit;//,brad;
	private MyPainter6 myPainter;  //可自行改MyPainter
    
	Brad35(){   //建構式:初始化
    	//super();
    	super ("視窗程式");
    	setLayout(new BorderLayout());  //請了一個室內設計師來處理你的版面FlowLayout或BorderLayout
    	open = new JButton("Open");
    	save = new JButton("Save");
    	exit = new JButton("Exit");
    	myPainter = new MyPainter6();   //可自行改MyPainter
    	//brad = new JButton("brad");
    	//add(open,BorderLayout.NORTH);
    	//add(save,BorderLayout.WEST);
    	//add(exit,BorderLayout.CENTER);
    	JPanel top = new JPanel(new FlowLayout());
    	top.add(open);top.add(save);top.add(exit);//區域變數,還沒有發生關係,只是定義按鈕在頂端
    	
       	add(top,BorderLayout.NORTH);   //此列讓區域變數和視窗程式發生關係
    	//add(brad,BorderLayout.CENTER);
    	add(myPainter,BorderLayout.CENTER);
    	
    	
    	
    	setSize(640,480);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
	public static void main(String[] args) {
		new Brad35(); //創建一個新的類別物件
		

	}

}
