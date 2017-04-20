package tw.org.iii;
//�إ߮���
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class MyClock extends JLabel{  //JPanel:��ܭ��O
	private Timer timer;
	private int i;
	
	public MyClock(){
		timer = new Timer();
		timer.schedule(new MyClockTask(), 0, 1000);   //���@����ܮ���������,�{�b�߰�����,���j�@��������@��
		//setText("15:01:32");  //1.�����b�������O�W��ܥX15:01:32
	}
	
	private class MyClockTask extends TimerTask{   
		@Override
		public void run() {  //�ɶ���F�|��ܲ{�b�ɶ�
			Calendar now = Calendar.getInstance();   //3.��ܥ��T�ɶ�   
			/*�]��Calendar�غc����protected:�Ω��~�Ӥl���O,�ۦPpackage,���ઽ���I�s,�ӥBCalendar�S�O��H���O,
			�ҥH�q�`�o�ӷ|��static�����k�i�H�^�ǥ��T�ɶ�,�N�OgetInstance(),�S�����w�]�ȴN�O�{�b�ɶ�*/
			int hh = now.get(Calendar.HOUR_OF_DAY);  //HOUR_OF_DAY:24�p�ɨ� //API:get(int field),�����O���W��,��API:Calendar��Field Summary
			int mm = now.get(Calendar.MINUTE);
			int ss = now.get(Calendar.SECOND);
			setText(hh + ":" + mm + ":" + ss);
			//setText("now:" + i++);  //2.�b�������O�W�i�H�ݨ�Ʀr�b�]
		}	
	}
}
