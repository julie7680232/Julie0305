package tw.org.iii;
//sleep�ɶ���ǫפ���,���౱��P������,�i�H��class Timer��TimerTask(������Ȧb�������O)-2
import java.util.Timer;
import java.util.TimerTask;

public class Brad94 {
	private static Timer timer;
	public static void main(String[] args) {   
		//static����I�s���󪺪F��,��private Timer timer;��private static class Mystop extends TimerTask �W�[static
		timer = new Timer();
		timer.schedule(new MyTask1("A"), 1000 , 500);  //	schedule(TimerTask task, long delay, long period)
		timer.schedule(new MyTask1("B"), 1800 , 300);
		timer.schedule(new MyStop(), 10*1000);
		System.out.println("main");
	}
	
	private static class MyStop extends TimerTask{  //JavaStop1 =>�~�����O,�]��MyStop���������O,�\��O�ۦP��
		@Override
		public void run() {
			timer.cancel();  
			/*timer�ݭn�O�ݩ�,���쥻Brad93��timer�O�ŧi��Timer timer,����timer���ϰ��ܼƤ��O�ݩ�,�G����I�stimer.cancel��k
		                 ���Ntimer�ŧi��private Timer timer�bpublic static void main(String[] args)�~,���]��public static void main(String[] args)�Ostatic,
		                 ����I�s����timer,�ҥHprivate Timer timer�n�ŧi��static*/
	      //���g�{��timer.schedule(new MyStop(), 10*1000)�S�sĶ���~,�]��MyStop�O�������O,�������O�i�H�Υ~�����O�����ݩʻP��k,���S��,�ҥHMyStop�n�ŧi��static�~�i�H
		}
	}
}

class MyTask1 extends TimerTask{
	private String name;
	private int i;
	
	MyTask1(String name){this.name = name;}
	@Override
	public void run() {   //�ɶ��n�����Ʃw�q�brun�̭�
		System.out.println(name + ":" + i++);
	}
}
class StopJava1 extends TimerTask{  //����Ҧ�����
	private Timer timer;
	StopJava1(Timer timer){this.timer = timer;}
	@Override
	public void run() {
		timer.cancel();     //��������
	}
}
