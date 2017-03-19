package tw.org.iii;

public class Brad39 {//

	public static void main(String[] args) {
		Brad271 b1 = new Brad272();
		Brad271 b2 = new Brad273();
		b1.m2();
		b2.m2();
	}
}
abstract class Brad271{          //有抽象類別,代表不作物件實體
	Brad271(){System.out.println("Brad271()");}            //任何類別都有建構式
	void m1(){System.out.println("Brad271:m1()");}
	abstract void m2();   //有抽象方法的類別,必須宣告為抽象
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
	void m1{};       //可以有一個抽象類別,不一定要有抽象方法
}
