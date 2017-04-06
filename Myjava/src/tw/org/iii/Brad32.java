package tw.org.iii;

public class Brad32 {

	public static void main(String[] args) {
	//System.out.println(TWId5.isCheckOK("A323"));
	
	TWId6 id1 = new TWId6();
	TWId6 id2 = new TWId6(1);  //指定台中市
	TWId6 id3 = new TWId6(false);  //指定男生
	TWId6 id4 = new TWId6(true,12);  //彰化縣

		System.out.println(id1.getId());    //印出id1
		System.out.println(id2.getId());    //印出id2
		System.out.println(id3.getId());    //印出id3
		System.out.println(id4.getId());   //印出id4
		//System.out.println(TWIDteacher.isCheckOK("A123456789"));

//		TWId5 id1 = new TWId5("A123456789");
//		System.out.println(id1.getId());
//		if(id1.isFemale()){
//			System.out.println("女生");
//		}else{
//			System.out.println("男生");
//		}

	}

}
