package tw.org.iii;
//製作賽車跑道:執行緒例子(一條跑道一台車),此程式有一個bug,如果按下Go!程式開始跑,再按第2次Go!按鈕,則會接下去跑
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing extends JFrame{
	private JButton go;     //按鈕步驟2.
	private JLabel lane;   //按鈕步驟3. //lane指跑道
	public Racing(){
		super("Racing Game");  //視窗產生步驟1.
		setLayout(new GridLayout(2,1)); //按鈕步驟1.GridLayout(int rows, int cols)
		
		go = new JButton("Go");    //按鈕步驟4.
		lane = new JLabel("1. ");  //按鈕步驟5.
		
		add(go);add(lane);        //按鈕步驟6.
		
		go.addActionListener(new ActionListener() {   //車子要跑的步驟2.按下Go!按鈕,會跑以下程式
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
				
		setSize(800,480);   //視窗產生步驟2.
		setVisible(true);   //視窗產生步驟3.
		setDefaultCloseOperation(EXIT_ON_CLOSE);  //視窗產生步驟4.
	}
	
	private void go(){   ////車子要跑的步驟3.
		Car car1 = new Car();
		car1.start();
	}

	private class Car extends Thread{  //會將車子寫程內部類別,方便存取外部類別的屬性和方法
		@Override
		public void run() {    //車子要跑的步驟1.
			for(int i=0; i<100; i++){  //車子跑的步數,i<100自己自訂   
				lane.setText(lane.getText()+ ">" );  //寫外部類別沒有辦法這樣使用,寫成內部類別,方便存取外部類別的屬性和方法
				//API:setText(String text):Defines the single line of text this component will display.
				//API:getText():Returns the text string that the label displays.回傳字串
				try {
					Thread.sleep(100);      //執行程式後跑太快沒有感覺,讓">"跑慢一點
				} catch (InterruptedException e) {
				} 
			}
		}
	} 
	
	public static void main(String[] args) {
		new Racing();     //視窗產生步驟5.
	}
}
