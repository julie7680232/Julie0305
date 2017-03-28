package tw.org.iii;
public class Brad37 {
	public static void main(String[] args) {
		Brad373.m1();
		//Brad373 b1 = new Brad373();  //°õ¦æ¤§¶¶§Ç1.=>2.=>3.=>4.
		//Brad373 b2 = new Brad373();
	}
}
class Brad371{
	static {System.out.println("s1");}               //1.
	Brad371(){System.out.println("Brad371()");}
	Brad371(int a){System.out.println("Brad371(int)");}   
}
class Brad372 extends Brad371{    
	static {System.out.println("s2");}                 //2.
	Brad372(String a){   
		System.out.println("Brad372(String)");
	}
}
class Brad373 extends Brad372{
	static {System.out.println("s3");}                //3.
	Brad373(){
		super("brad");                   
		System.out.println("Brad373()");    
	}
	static void m1(){System.out.println("m1()");}     //4.
}