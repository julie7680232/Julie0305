package tw.org.iii;

public class Brad32 {

	
	public static void main(String[] args) {
	System.out.println(TWId5.isCheckOK("A323456789"));   
	//�W�[�����Ҧr���ˬd����:1.length == 10  2.charAt(1) => 1, 2  ����21�C���٬O�|�L�X

//		TWId id1 = new TWId3();
//		TWId id2 = new TWId3(1);
//		TWId id3 = new TWId3(false);
//		TWId id4 = new TWId3(true, 12);
//		
//		System.out.println(id1.getId());
//		System.out.println(id2.getId());
//		System.out.println(id3.getId());
//		System.out.println(id4.getId());
//		System.out.println(TWIDteacher.isCheckOK("A123456789"));
//		
		TWId5 id1 = new TWId5("A123456789");
		System.out.println(id1.getId());
		if(id1.isFemale()){
			System.out.println("�k��");
		}else{
			System.out.println("�k��");
		}

	}

}
