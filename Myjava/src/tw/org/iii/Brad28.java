package tw.org.iii;

public class Brad28 {//

	public static void main(String[] args) {
		String a = new String("abc");    //因為是new 物件,故不是相同位址
		String b = new String("abc");
		String c = "abc";
		String d = "abc";
		String e = a;
		System.out.println(a == b);		//false比較記憶體位址,因為不同物件,除非相同物件
		System.out.println(c == d);     //true比較字串每個位址,字串每個是否相同
		System.out.println(a == e);     //true
		System.out.println(a.equals(b));  //比較物件的內容是否相等
		

	}

}
