package tw.org.iii;
/*
 * Program: String
 */
public class Brad24 {

	public static void main(String[] args) {
		String s1 = new String();
		byte[] b1 = {97,98,99,100,101,102,103,104}; 
		String s2 = new String(b1);                 //abcdefgh
		String s3 = new String(b1,2,4);       //abcdefgh,2指偏移量,4是總長度
		                                     //012所以c=2,cdef四個(位移)
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		String s4 = "abcdefg";           //"abcdefg"已經是物件,任何雙引號標註之內容皆為物件實體,編譯器裡直接知道是物件
		                                 //static不是物件;有new的是物件;是物件才能做API的方法
		//舉一個物件執行API的方法:charAt()
		char c1 = s2.charAt(3);   //會得出s2之字串第3個(0,1,2,3)
		String.charAt(3);  
		//不能這樣用,因為charAt不是static,需要有物件才能使用(ex:Math.random()或Arrays.sort()因為是static,故可以這樣用),故編譯錯誤
		System.out.println(c1);
		System.out.println("abcdefgh".charAt(3));
	}

}
