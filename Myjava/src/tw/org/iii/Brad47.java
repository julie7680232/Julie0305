package tw.org.iii;
//Exception �ҥ~    ���ɬO�G�N�إߪ�
public class Brad47 {

	public static void main(String[] args) {
		int a = 10 ,b = 3;
		int[] c ={1,2,3,4};
		try{
			System.out.println(a/b);  //�Y�{�����_(�Ҧpb��0),���|�L�X��8�C  
			try{
				System.out.println(c[4]);
			}catch(Exception ee){	
			}
			System.out.println("OK");
		}catch(ArithmeticException ae){
			System.out.println("87");               //�Ytry�S������a/b,�h���榹�C
	//	}catch(ArrayIndexOutOfBoundsException ee){
	//		System.out.println("XX");               //catch{}�֥��֫�S���v�T	
		}catch(RuntimeException re){//�s��覡�h���� ,�n�`�N����catch������,���~�����Y,���ǥѲӨ�j���������e�O�_�b�s�줧���Ѹ�,�S�����t��t���ܤ��Ϊ`�N���ǩ�
			System.out.println("OK");
		}
		System.out.println("Hello,World");
	}
}
