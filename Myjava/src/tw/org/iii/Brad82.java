package tw.org.iii;

import java.util.HashSet;

//��@collection
public class Brad82 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
//3		toBike b1 = new toBike();
//2		String s1 = "Brad";
//1		Integer i1 = new Integer(12);     //�Ĥ@�۫غc��
//1		Integer i2 = new Integer("34");  //�i��ߥX�ҥ~,API�W���g;i2�O����  ;�令Integer i2 = new Integer("Brad")�|�ߥX�ҥ~
//4		int ii3 = 56;        //�򥻫��O
//4		Integer i3 = ii3;   //���󫬧O ;56�]������=>�˽c
//3		System.out.println(b1);   //�L�X�O�����m,���p�Gclass toBike override �h�|�L�X�r��,�Y�����27~32�C
//2		System.out.println(s1);    //�]���r�꦳toString,�����w��override,�G���|�L�X�O�����}
//1		System.out.println(i1); //�]����Ʀ�toString,�����w��override,�G���|�L�X�O�����}
//1		System.out.println(i2);   //�L�X34
//4 	System.out.println(ii3);  //�Lii3����
//4		System.out.println(i3.floatValue());  //�٬O�L�X56���O�Nii3���ȫغc������,�ҥH�i�H�o�˥�,ii3�O�򥻫��O,���|�O����,���|��floatValue
		
		//set.add(arg0);  //add�u��᪫��
	}
}
class toBike{
	@Override
	public String toString() {
		return "Brad";
	}
}
