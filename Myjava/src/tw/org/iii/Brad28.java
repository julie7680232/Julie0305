package tw.org.iii;

public class Brad28 {//

	public static void main(String[] args) {
		String a = new String("abc");    //�]���Onew ����,�G���O�ۦP��}
		String b = new String("abc");
		String c = "abc";
		String d = "abc";
		String e = a;
		System.out.println(a == b);		//false����O�����},�]�����P����,���D�ۦP����
		System.out.println(c == d);     //true����r��C�Ӧ�},�r��C�ӬO�_�ۦP
		System.out.println(a == e);     //true
		System.out.println(a.equals(b));  //������󪺤��e�O�_�۵�
		

	}

}
