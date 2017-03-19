package tw.org.iii;
public class Brad38 {//
	public static void main(String[] args) {
		Brad261 b1 = new Brad261();
		Brad261 b2 = new Brad262();   //b2仍為Brad261
		Brad262 b3 = new Brad262();
		Brad263 b4 = new Brad263();
		b2.m1();
		//b2.m2(); //沒有m2方法
		System.out.println(b2.a);  //不能呼叫b2.b
	//	myf1(b3);
	}
	//static void myf1(Brad261 b){    //b為多型,繼承方式上產生多型
	//	b.m1();       //不能呼叫b.m2
		
	//}
}
class Brad261{
	int a ;
	Brad261(){a++;System.out.println("Brad261()");}
	void m1(){System.out.println("Brad261:m1()");}
	
}
class Brad262 extends Brad261{
	int b;
	Brad262(){a++;System.out.println("Brad262()");}
	void m1(){System.out.println("Brad262:m1();b=" + b);}
	void m2(){System.out.println("Brad262:m2()");}
}
class Brad263 extends Brad261{
	
}