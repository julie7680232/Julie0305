package tw.org.iii;

public class test7 {

	public static void main(String[] args) {
		String message1= "a";
		String message2 = new String("a");
		if(message1 ==message2)
			System.out.println("OK");
		if(message1.equals(message2))
			System.out.println("NO");
	}

}
