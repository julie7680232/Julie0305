package tw.org.iii;
//sleep時間精準度不高,不能控制周期任務,可以用class Timer及TimerTask(停止任務在內部類別)-2
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
	
	private static class MyStop extends TimerTask{  //JavaStop1 =>外部類別,設立MyStop為內部類別,功能是相同的
		@Override
		public void run() {
			timer.cancel();  
			/*timer需要是屬性,但原本Brad93的timer是宣告為Timer timer,此時timer為區域變數不是屬性,故不能呼叫timer.cancel方法
		                 須將timer宣告為private Timer timer在public static void main(String[] args)外,但因為public static void main(String[] args)是static,
		                 不能呼叫物件timer,所以private Timer timer要宣告為static*/
	      //但寫程式timer.schedule(new MyStop(), 10*1000)又編譯錯誤,因為MyStop是內部類別,內部類別可以用外部類別物件的屬性與方法,但沒有,所以MyStop要宣告為static才可以
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
		timer.cancel();     //取消任務
	}
}
