package tw.org.iii;

public class Brad50 {

	public static void main(String[] args) {
		new Brad471().m1();
	}
}
class Brad471{
	void m1(){
		try{
			System.out.println("do something");
			//throw new Exception();  //��k�ߥX�n��~�ŧi,�p�G�S��try{}catch(){}
			//return;   //End���|����
		}catch(Exception ee){         //�]���w��try{}catch(){}�B�z
			System.out.println("catch");
			return;  ////End���|����
		}finally{
			System.out.println("OK");   //����n��finally? �Yreturn��,End���|����
		}
		System.out.println("end");
	}
}
