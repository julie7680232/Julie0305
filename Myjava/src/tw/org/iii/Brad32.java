package tw.org.iii;

public class Brad32 {

	public static void main(String[] args) {
	//System.out.println(TWId5.isCheckOK("A323"));
	
	TWId6 id1 = new TWId6();
	TWId6 id2 = new TWId6(1);  //���w�x����
	TWId6 id3 = new TWId6(false);  //���w�k��
	TWId6 id4 = new TWId6(true,12);  //���ƿ�

		System.out.println(id1.getId());    //�L�Xid1
		System.out.println(id2.getId());    //�L�Xid2
		System.out.println(id3.getId());    //�L�Xid3
		System.out.println(id4.getId());   //�L�Xid4
		//System.out.println(TWIDteacher.isCheckOK("A123456789"));

//		TWId5 id1 = new TWId5("A123456789");
//		System.out.println(id1.getId());
//		if(id1.isFemale()){
//			System.out.println("�k��");
//		}else{
//			System.out.println("�k��");
//		}

	}

}
