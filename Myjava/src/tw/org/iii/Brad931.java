package tw.org.iii;
//sleep�ɶ���ǫפ���,���౱��P������,�i�H��class Timer��TimerTask
import java.util.Timer;
import java.util.TimerTask;

public class Brad931 {

	public static void main(String[] args) {
		Timer timer = new Timer();   //Timer:�p�ɾ�
		timer.schedule(new Task(), 3000, 1000);  
		//	schedule(TimerTask task, long delay, long period),3��L�@����,�C1��L�@��,�@���L
		System.out.println("main");
	}
}
class Task extends TimerTask{
	@Override
	public void run() {   //�ɶ��n�����Ʃw�q�brun�̭�
		System.out.println("OK");
	}
}

