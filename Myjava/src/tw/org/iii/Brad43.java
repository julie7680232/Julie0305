package tw.org.iii;

public class Brad43 {//

	public static void main(String[] args) {
		String s1 = "Brad";
		String s2 = s1;
		System.out.println(s1 == s2);
		s1 = "Mary";                //��},�r��i�ܧ�O�]����}
		System.out.println(s1 == s2);
		System.out.println("--------------------------------");
		String s3 = "Brad";
		System.out.println(s3.concat("1234567"));  //�b��r���W�[�r��,���O�O���ͷs������r��,���O������r�괫��,�O���ͷs����}
		System.out.println(s3);                    //����r�ꤣ��
		System.out.println(s3.replace('a', 'A'));   //�m���r�ꤺ�e,���O�O���ͷs������r��,���O������r�������,�O���ͷs����}
		System.out.println(s3);                   //����r�ꤣ��
//
	}

}
