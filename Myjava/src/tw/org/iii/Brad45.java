package tw.org.iii;

public class Brad45 {//

	public static void main(String[] args) {
		Brad421 b1 = new Brad422(); 
		//b2.m2   ,�S���~��,�sĶ���~ 
		Brad422 b2 = (Brad422)b1;      
		Brad421 b3 = new Brad423();  //���_�ǥ�
		Brad422 b4 = (Brad422)b3;    //���_�ǥ��ܪk�ԧQ,�sĶ�|�L��,������|�X�{ ClassCastException,��]�O�૬����,�����૬
		Bike b5 = new Bike();
		Brad422 b6 = =(Brad422)b5;  //�}�񨮨S���~�����Y,�ҥH�૬���|�L,�sĶ���~
		b2.m2();//���^���L,�j���૬
	}

}

class Brad421{
	void m1(){System.out.println("Brad421:m1()");}
	}
class Brad422 extends Brad421{
	void m1(){System.out.println("Brad422:m1()");}
	void m2(){System.out.println("Brad422:m2()");}
}
class Brad423 extends Brad421{
	void m1(){System.out.println("Brad423:m1()");}
	void m2(){System.out.println("Brad423:m2()");}
}