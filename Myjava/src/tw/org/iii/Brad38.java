package tw.org.iii;
public class Brad38 {
	public static void main(String[] args) {
		//Brad261 b1 = new Brad261();
		Brad261 b2 = new Brad262();   //b2����Brad261
		//Brad262 b3 = new Brad262();
		//Brad263 b4 = new Brad263();
		b2.m1();
		//b2.m2(); //�S��m2��k,�]��b2���ŧi��Brad261,Brad261�S��m2��k,�G�L�k����Brad262��m2
		System.out.println(b2.a);  //����I�sb2.b,�]��b�ŧi��Brad262,Brad261�S��b��k,�G�L�k����
	//	myf1(b3);
	}
	//static void myf1(Brad261 b){    //b���h��,�~�Ӥ覡�W���ͦh��
	//	b.m1();       //����I�sb.m2
		
	//}
}
class Brad261{
	int a ;
	Brad261(){a++;System.out.println("Brad261()");}
	void m1(){System.out.println("Brad261:m1()");}
	
}
class Brad262 extends Brad261{
	int b;
	Brad262(){a++;System.out.println("Brad262()");}    //�O�o�e������super,�|�L�XBrad261()
	void m1(){System.out.println("Brad262:m1();a=" + a);}  //�L�Xa=2,�]���~�����Y,�bBrad262,��a++,a��1,�����Brad261,�Sa++,a��2
	void m2(){System.out.println("Brad262:m2()");}
}
class Brad263 extends Brad261{
	
}