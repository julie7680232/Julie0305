package tw.org.iii;

public class Brad44 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
	    StringBuffer sb2 = sb1;
		sb1.append("12345678901234567");    //附加在原字串後方
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		System.out.println(sb1 == sb2);  //true,因此知道StringBuffer適合資料的異動,故資料有異動不要使用String

	}

}
