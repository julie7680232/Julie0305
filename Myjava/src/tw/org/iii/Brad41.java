package tw.org.iii;

public class Brad41 {//

	public static void main(String[] args) {
	}
}
interface Brad291{
	void m1();      //���Opublic void m1(),�u�O�ٲ�
	abstract void m2();  
	  //���������|����@,�w�q����k�û����O��H��k,�S�gabstract;void m3(){}�sĶ���|�L
}
class Brad292 implements Brad291{    //��@Brad291����
	public void m1(){}               //�n��public void m1(),�sĶ�~�|�L
	public void m2(){}
}
abstract class Brad293 implements Brad291{   
	public void m1(){}              
}