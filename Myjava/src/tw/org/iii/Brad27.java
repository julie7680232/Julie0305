package tw.org.iii;

public class Brad27 {

	public static void main(String[] args) {
		System.out.println(TWId5.isCheckOK("A323456789"));	
		//�W�[�����Ҧr���ˬd����:1.length == 10  2.charAt(1) => 1, 2  ����21�C���٬O�|�L�X
		TWId5 id1 = new TWId5("A123456789");
		System.out.println(id1.getId());
		if(id1.isFemale()){
			System.out.println("�k��");
		}else{
			System.out.println("�k��");
		}

	}

}
