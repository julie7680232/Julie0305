package tw.org.iii;
/*
 * P
 */
public class Brad24 {

	public static void main(String[] args) {
		String s1 = new String();
		byte[] b1 = {97,98,99,100,101,102,103,104};  //abcdefgh
		String s2 = new String(b1);
		String s3 = new String(b1,2,4);       //abcdefgh
		                                     //012�ҥHc=2,cdef�|��(�첾)
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		String s4 = "abcdefg";           //"abcdefg"�w�g�O����,�������޸��е������e�Ҭ��������
		char c1 = s2.charAt(3);
		System.out.println(c1);
		System.out.println("abcdefgh".charAt(3));
	}

}