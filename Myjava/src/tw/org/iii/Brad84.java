package tw.org.iii;
//set��J���P���O-1
import java.util.HashSet;
import java.util.TreeSet;

public class Brad84 {

	public static void main(String[] args) {
		//HashSet set = new HashSet();
		//TreeSet set = new TreeSet();   //�|�o�Xset�̶��ǱƦC
		TreeSet<Integer> set = new TreeSet<>();   //�|�o�Xset�̶��ǱƦC
		
//1.		
//		int i=0;
//		while(set.size()<6){   //�~�P
//			set.add((int)(Math.random()*52+1));
//			i++;
//		}
//		System.out.println(set);  //�Ĳv�����o����~�P�{�O�n,�t�פ����o�����
//		System.out.println(i);  //���Dwhile�j��]�F�X��

//2.
//		set.add(1200000);
//		set.add(1200000);
//		set.add(1200000);
//		set.add(12.3);
//		set.add(56);
//		set.add(12.3);
//		set.add("Brad");
//		set.add(12.3);   //���ަh��12.3,����X���٬O�u���@��12.3
//		System.out.println(set);  //set�S����ӵ{�������ǩ�,�������,���ۤv�����ǩ�
//		//�N�C�@�Ӥ������X��:�q�q��������,toString,����X�Ӥ��|����

		set.add(12); //=>auto-boxing  
		set.add(56);
		byte a = 13;  
		set.add(a);  //byte => int => Integer ,�૬�L�k�@����,���D�令set.add((int)a)�~�i�H
		//set.add("78");  //�]��TreeSet�w�ŧi�̭��u�����,�G�L�k�sĶ
		System.out.println(set);   //�r��"78"�L�k�Ƨ�,�ҥH�|�ߥX�ҥ~ClassCastException
	}
}
