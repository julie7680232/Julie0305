package tw.org.iii;
public class Brad37 {
	public static void main(String[] args) {
		Brad253.m1();
		//Brad253 b1 = new Brad253();  //���椧����1.=>2.=>3.=>4.
		//Brad253 b2 = new Brad253();
	}
}
class Brad251{
	static {System.out.println("s1");}               //1.
	Brad251(){System.out.println("Brad251()");}
	Brad251(int a){System.out.println("Brad251(int)");}   
}
class Brad252 extends Brad251{    
	static {System.out.println("s2");}                 //2.
	Brad252(String a){   
		System.out.println("Brad252(String)");
	}
}
class Brad253 extends Brad252{
	static {System.out.println("s3");}                //3.
	Brad253(){
		super("brad");                   
		System.out.println("Brad253()");    
	}
	static void m1(){System.out.println("m1()");}     //4.
}