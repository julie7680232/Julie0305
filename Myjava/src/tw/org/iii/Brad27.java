package tw.org.iii;

public class Brad27 {

	public static void main(String[] args) {
		System.out.println(TWId3.isCheckOK("A123456789"));		
		TWid id1 = new TWid("A123456789");
		System.out.println(id1.getId());
		if(id1.isFemale()){
			System.out.println("女生");
		}else{
			System.out.println("男生");
		}

	}

}
