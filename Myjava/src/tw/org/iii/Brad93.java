package tw.org.iii;
//sleep�ɶ���ǫפ���,���౱��P������,�i�H��class Timer��TimerTask
import java.util.Timer;
import java.util.TimerTask;

public class Brad93 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new MyTask("A"), 1000 , 500);  //	schedule(TimerTask task, long delay, long period)
		timer.schedule(new MyTask("B"), 1800 , 300);
		timer.schedule(new StopJava(timer), 10*1000);
		System.out.println("main");
	}
}
class MyTask extends TimerTask{
	private String name;
	private int i;
	
	MyTask(String name){this.name = name;}
	@Override
	public void run() {   //�ɶ��n�����Ʃw�q�brun�̭�
		System.out.println(name + ":" + i++);
	}
}
class StopJava extends TimerTask{  //����Ҧ�����
	private Timer timer;
	StopJava(Timer timer){this.timer = timer;}
	@Override
	public void run() {
		timer.cancel();
	}
}
