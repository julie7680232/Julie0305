package tw.org.iii;
//set
import java.util.HashSet;
import java.util.Iterator;
//import javax.swing.text.html.HTMLDocument.Iterator;

//��@collection
public class Brad83 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
//		Brad711 obj = new Brad712();       //��M�[��1
//		obj.m1();  //�]��Brad711��m1  
//		//obj.m2();  //�]��Brad711�S��m2
		
		
//		Object obj2 = new Object();                    //��M�[��2
//		System.out.println(obj2);  //�|�L�X�O�����}
//		System.out.println((int)obj2);  //�sĶ�|�L,��Run�|�૬����=>RunTimeException
		
		
		int i1 = 12;
		//Object obj1 = (Object) i1;  //=>i1�|�Qauto-boxing           
		//Object obj1 = i1;   //=>auto-boxing
		
		Integer i2 = new Integer(34); 
		set.add(i2);
		set.add(i1); //i1 =>auto-boxing => new Integer(i) ;�]��Integer��Override toString
		System.out.println(set.size());   //�L�X2
		System.out.println(set);
		System.out.println("--------------------------------");
//      //��k1:(�����@�k)		
//		Iterator it = set.iterator();  //�ǳƨ��Xset���F��   //�֦����N�������,���Onew
//		while (it.hasNext()){  //���S���U�@��,�^��true��false
//			Object obj = it.next();   //���X�U�@�Ӥ�������
//			Integer i = (Integer)obj;  //����j���૬����,obj�O���󪺤���,���^�쫬���
//			System.out.println(i.floatValue());  //�ҩ�i�O����,�|�L�X34��12
//		}
		//��k2:(�{�b�@�k)
		//is a Collection => for-each
		for(Object obj :set){                  //�Pwhile���j��@�����e�O�@�˪�,����ؤ�k
			System.out.println((Integer)obj);   // obj�j���૬�����,����������
			//System.out.println(obj);    //���j���૬�]�i�H�O�]����toString ,��@�OInteger(���),�_�h�|�L�X�O�����}
			//System.out.println((int)obj);   //��18.19�C����,���o�̥i�H,�]���w�gauto-boxing,���OtoString,�L�X�Ʀr,���OtoString,��c�X��
			//System.out.println((float)obj); //obj =>Integer =>int =>float�S������float,�u����int,�u���@�����ഫ
			//�W�C�p�Gint��Boolean��float�|�૬����,float�]��Integer���O���l���Y,�O�S�� 
			//obj�O��ƪ���Qauto-boxing
		}
		
	}
}
class Brad711{
	void m1(){System.out.println("Brad711:m1()");}
}
class Brad712 extends Brad711{
	void m2(){System.out.println("Brad712:m2()");}
}