package tw.org.iii;
//建立時鐘
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class MyClock extends JLabel{  //JPanel:顯示面板
	private Timer timer;
	private int i;
	
	public MyClock(){
		timer = new Timer();
		timer.schedule(new MyClockTask(), 0, 1000);   //給一個顯示時鐘的任務,現在立馬執行,間隔一秒鐘執行一次
		//setText("15:01:32");  //1.直接在視窗面板上顯示出15:01:32
	}
	
	private class MyClockTask extends TimerTask{   
		@Override
		public void run() {  //時間到了會顯示現在時間
			Calendar now = Calendar.getInstance();   //3.顯示正確時間   
			/*因為Calendar建構式為protected:用於繼承子類別,相同package,不能直接呼叫,而且Calendar又是抽象類別,
			所以通常這個會有static物件方法可以回傳正確時間,就是getInstance(),沒有給預設值就是現在時間*/
			int hh = now.get(Calendar.HOUR_OF_DAY);  //HOUR_OF_DAY:24小時制 //API:get(int field),中間是欄位名稱,看API:Calendar的Field Summary
			int mm = now.get(Calendar.MINUTE);
			int ss = now.get(Calendar.SECOND);
			setText(hh + ":" + mm + ":" + ss);
			//setText("now:" + i++);  //2.在視窗面板上可以看到數字在跑
		}	
	}
}
