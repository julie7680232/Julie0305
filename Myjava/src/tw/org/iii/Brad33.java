package tw.org.iii;

public class Brad33 {//

	public static void main(String[] args) {
		String id = "B123456789"; 
		id.equals("D123456789");                                         //match�u�Ǧ^true��false
		System.out.println(id.matches("^[A-Zxyz][12][0-9]{8}$"));  //���W�Хܪk:^$�Ŧr��,�u���}�Y^�ε���$,   []�r�����X��1
                            //��"^[A-Zxyz][12][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]$"
		                   //"^[^A-Zxyz][12][0-9]{8}$" �̪�[^A-Zxyz]��^���Ϧr��,
	}

}
