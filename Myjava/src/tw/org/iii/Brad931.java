package tw.org.iii;
//sleep時間精準度不高,不能控制周期任務,可以用class Timer及TimerTask
import java.util.Timer;
import java.util.TimerTask;

public class Brad931 {

	public static void main(String[] args) {
		Timer timer = new Timer();   //Timer:計時器
		timer.schedule(new Task(), 3000, 1000);  
		//	schedule(TimerTask task, long delay, long period),3秒印一次後,每1秒印一次,一直印
		System.out.println("main");
	}
}
class Task extends TimerTask{
	@Override
	public void run() {   //時間要做的事定義在run裡面
		System.out.println("OK");
	}
}

