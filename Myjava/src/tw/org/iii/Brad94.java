package tw.org.iii;
//sleep時間精準度不高,不能控制周期任務,可以用class Timer及TimerTask
import java.util.Timer;
import java.util.TimerTask;

public class Brad94 {
	private static Timer timer;
	public static void main(String[] args) {   
		//static不能呼叫物件的東西,於private Timer timer;及private static class Mystop extends TimerTask 增加static
		timer = new Timer();
		timer.schedule(new MyTask1("A"), 1000 , 500);  //	schedule(TimerTask task, long delay, long period)
		timer.schedule(new MyTask1("B"), 1800 , 300);
		timer.schedule(new MyStop(), 10*1000);
		System.out.println("main");
	}
	
	private static class MyStop extends TimerTask{
		@Override
		public void run() {
			timer.cancel();
		}
	}
	
}

class MyTask1 extends TimerTask{
	private String name;
	private int i;
	
	MyTask1(String name){this.name = name;}
	@Override
	public void run() {   //時間要做的事定義在run裡面
		System.out.println(name + ":" + i++);
	}
}
class StopJava1 extends TimerTask{  //停止所有任務
	private Timer timer;
	StopJava1(Timer timer){this.timer = timer;}
	@Override
	public void run() {
		timer.cancel();
	}
}
