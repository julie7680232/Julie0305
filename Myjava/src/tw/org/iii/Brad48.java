package tw.org.iii;

public class Brad48 {
	public static void main(String[] args) {	
		Bird b1 = new Bird();
		int n = 2;
		try {
			b1.setLeg(n);
	//	}catch(MyException ee){
	//		System.out.println(ee.toString());
	//	}catch(MyException2 ee){
	//		System.out.println(ee.toString());
		}catch(Exception ee){    //�@�w�n�ŧi,�]���A��Exception
			
		}
		System.out.println("End");
	}
}
class Bird{
	private int leg;
	//void setLeg(int n) throws MyException,MyException2{
		
	void setLeg(int n) throws Exception{  //�i���h��throws//�������ؤ��B�z,�ϥ�try{} catch(){}
		if(n>2){
			//leg = 2;  //�F�谵��,�����q�}��2,�����w�]��
			throw new Exception2();  //�ߥX�s���ҥ~,�ߤ@�Өҥ~,�G�S�H�[�Ws   
			System.out.println("");//���C���|�����,�Ҹշ|��
		}else if(n<0){
			throw new Exception();
		}
		leg = n;
	}
}

class MyException extends Exception{
	
	@Override
	public String toString() {
		return �ܺس���??;
		
	}
}
class MyException2 extends Exception{
	@Override
	public String toString() {
		return ���O����??;
	}
}
