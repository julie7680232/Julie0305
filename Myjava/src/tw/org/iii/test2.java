package tw.org.iii;

public class test2 {
	public static void main(String[] args) {
		try{
			test();
		}catch(Exception ex){
			System.out.println("exception");
		}
	}
	
	static void test(){
	try{
		String x = null;
		System.out.println(x.toString()+"");
	}
	finally{System.out.println("finally");}

}
}
