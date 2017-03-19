package tw.org.iii;

public class Brad33 {//

	public static void main(String[] args) {
		String id = "B123456789"; 
		id.equals("D123456789");                                         //match只傳回true或false
		System.out.println(id.matches("^[A-Zxyz][12][0-9]{8}$"));  //正規標示法:^$空字串,只有開頭^及結尾$,   []字元集合取1
                            //或"^[A-Zxyz][12][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]$"
		                   //"^[^A-Zxyz][12][0-9]{8}$" 裡的[^A-Zxyz]之^為反字元,
	}

}
