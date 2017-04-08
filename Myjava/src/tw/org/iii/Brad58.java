package tw.org.iii;
//P48解釋-3
public class Brad58 {

	public static void main(String[] args) {
		sayYa1("Brad","Peter","Andy","Mary");
		//sayYa2("Brad","Peter","Andy","Mary");  //會編譯錯誤,應改成第8列,因為say1及say2呼叫方式不同
		sayYa2(new String[]{"Brad","Peter","Andy","Mary"});

	}

	static void sayYa1(String...names){  //不定個數,當呼叫之sayYa方法為2個時,會印出Ya,Brad及Ya,Peter;但為3個時,會印出OK
		//names => String[] => {"Brad","Peter"}
		for(String name :names){
			System.out.println("Ya, "+ name);
		}
		//System.out.println("OK");
	}
	static void sayYa2(String[] names){  //不定個數,當呼叫之sayYa方法為2個時,會印出Ya,Brad及Ya,Peter;但為3個時,會印出OK
		//names => String[] => {"Brad","Peter"}
		for(String name :names){                  //若將sayYa2改成sayYa1會編譯錯誤,是兩種相同方法
			System.out.println("Ya, "+ name);
		}
	}
}
