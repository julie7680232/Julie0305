package tw.org.iii;

public class Brad39 {//

	public static void main(String[] args) {
		Brad271 b1 = new Brad272();
		Brad271 b2 = new Brad273();
		b1.m2();
		b2.m2();
	}
}
abstract class Brad271{          //����H���O,�N���@�������
	Brad271(){System.out.println("Brad271()");}            //�������O�����غc��
	void m1(){System.out.println("Brad271:m1()");}
	abstract void m2();   //����H��k�����O,�����ŧi����H
}
class Brad272 extends Brad271{
	void m2(){System.out.println("Brad272:m2()");}
}
class Brad273 extends Brad271{
	void m2(){System.out.println("Brad273:m2()");}
}
abstract class Brad274 extends Brad271{
	void m3(){}
	abstract void m4();
}

abstract class Brad275{
	void m1{};       //�i�H���@�ө�H���O,���@�w�n����H��k
}
