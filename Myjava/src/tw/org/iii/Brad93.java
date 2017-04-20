package tw.org.iii;
//sleep時間精準度不高,不能控制周期任務,可以用class Timer及TimerTask(停止任務在外部類別)-1
import java.util.Timer;
import java.util.TimerTask;

public class Brad93 {

	public static void main(String[] args) {
		Timer timer = new Timer();   //Timer:計時器
		timer.schedule(new MyTask("A"), 1000 , 500);  //	schedule(TimerTask task, long delay, long period)
		timer.schedule(new MyTask("B"), 1800 , 300);
		timer.schedule(new StopJava(timer), 10*1000); //建立一個任務來消除任務
		System.out.println("main");
	}
}
class MyTask extends TimerTask{
	private String name;
	private int i;
	
	MyTask(String name){this.name = name;}
	@Override
	public void run() {   //時間要做的事定義在run裡面
		System.out.println(name + ":" + i++);
	}
}
class StopJava extends TimerTask{  //停止所有任務
	private Timer timer;
	StopJava(Timer timer){this.timer = timer;}
	@Override
	public void run() {
		timer.cancel();  //取消任務
	}
}
