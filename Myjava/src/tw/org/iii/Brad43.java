package tw.org.iii;

public class Brad43 {//

	public static void main(String[] args) {
		String s1 = "Brad";
		String s2 = s1;
		System.out.println(s1 == s2);
		s1 = "Mary";                //位址,字串可變更是因為位址
		System.out.println(s1 == s2);
		System.out.println("--------------------------------");
		String s3 = "Brad";
		System.out.println(s3.concat("1234567"));  //在原字串後增加字串,但是是產生新的物件字串,不是直接原字串換掉,是產生新的位址
		System.out.println(s3);                    //但原字串不變
		System.out.println(s3.replace('a', 'A'));   //置換字串內容,但是是產生新的物件字串,不是直接原字串替換掉,是產生新的位址
		System.out.println(s3);                   //但原字串不變
//
	}

}
