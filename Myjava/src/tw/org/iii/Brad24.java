package tw.org.iii;
/*
 * Program: String
 */
public class Brad24 {

	public static void main(String[] args) {
		String s1 = new String();
		byte[] b1 = {97,98,99,100,101,102,103,104}; 
		String s2 = new String(b1);                 //abcdefgh
		String s3 = new String(b1,2,4);       //abcdefgh,2�������q,4�O�`����
		                                     //012�ҥHc=2,cdef�|��(�첾)
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		String s4 = "abcdefg";           //"abcdefg"�w�g�O����,�������޸��е������e�Ҭ��������,�sĶ���̪������D�O����
		                                 //static���O����;��new���O����;�O����~�వAPI����k
		//�|�@�Ӫ������API����k:charAt()
		char c1 = s2.charAt(3);   //�|�o�Xs2���r���3��(0,1,2,3)
		String.charAt(3);  
		//����o�˥�,�]��charAt���Ostatic,�ݭn������~��ϥ�(ex:Math.random()��Arrays.sort()�]���Ostatic,�G�i�H�o�˥�),�G�sĶ���~
		System.out.println(c1);
		System.out.println("abcdefgh".charAt(3));
	}

}
