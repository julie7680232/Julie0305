package tw.org.iii;
//P48解釋-2
public class Brad57 {

	public static void main(String[] args) {
		sayYa("Brad","Peter","Andy","Mary");

	}
	static void sayYa(String name){
		System.out.println("Ya,"+ name);
	}
	static void sayYa(String name1,String name2){
		System.out.println("Ya,"+ name1);
		System.out.println("Ya,"+ name2);
	}
	static void sayYa(String...names){  //不定個數,當呼叫之sayYa方法為2個時,會印出Ya,Brad及Ya,Peter;但為3個時,會印出OK
		//names => String[] => {"Brad","Peter"}
		for(String name :names){
			System.out.println("Ya, "+ name);
		}
		//System.out.println("OK");
	}

}
