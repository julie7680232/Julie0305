package tw.org.iii;
//身分證字號核心功能
public class TWId3 {
	private String id; //屬性慣例用小寫,//需不需要被封裝,是否可被更改
	TWId3(String id){  //建構式名稱與class相同 
		this.id = id;      
		// 如果TWId3(String myid){id = myid;},將TWId3(String myid)改成TWId3(String id),
		//id = myid會報錯,改成this.id = id,等號左邊this的id指的是  private String id, 等號右邊的id指的是TWId3(String id)
	}
	    //true => female(女生);flase => male(男生)
		boolean isFemale(){
			char gender = id.charAt(1); //gender(性別)為身分證字號之第1個字元(不是第0個字元),A123456789 =>'1'
			//此id不用this
			return  gender == '2';  //回傳是否為'2','2'為女生
		}
	static boolean isCheckOK(String id){  //檢查身分證字號,用static設計只用台灣身分證字號,只檢查一次
		String  letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";  //依維基百科之數字順序填寫英文字母順序
		char f0 = id.charAt(0);   //抽出第0個字元
		int n12 = letters.indexOf(f0) + 10; // 若是'Y' => 21+10 = 31 //第21個字元(從第0個字元開始算起)
		//indexOf(f0) => return字串為第幾字元(從第0字元開始)
		int n1 = n12 / 10;  //若是'Y',則為31,31/10=3
		int n2 = n12 % 10;  //若是'Y',則為31,31%10=1  =>第20,21列即可得字元3與1
		//int n3 = id.charAt(1);  //'1' =>ASCII  ,因為n3待會要計算,所以定義為整數,沒辦法定義成字元,故印出ASCII
		//System.out.println(n3);  //所以印出來會是49
		int n3 = Integer.parseInt(id.substring(1,2));  //Integer.parseInt:十進制之整數,substring是抽出第1到(2減1)之字元
		//substring(a,b)是抽出a到b減1之字元
		int n4 = Integer.parseInt(id.substring(2,3));
		int n5 = Integer.parseInt(id.substring(3,4));
		int n6 = Integer.parseInt(id.substring(4,5));
		int n7 = Integer.parseInt(id.substring(5,6));
		int n8 = Integer.parseInt(id.substring(6,7));
		int n9 = Integer.parseInt(id.substring(7,8));
		int n10 = Integer.parseInt(id.substring(8,9));
		int n11 = Integer.parseInt(id.substring(9,10));
		int sum = n1*1+n2*9+n3*8+n4*7+n5*6+n6*5+n7*4+n8*3+n9*2+n10*1+n11*1;  //身分證字號檢查機制,參見維基百科
		return sum % 10 == 0;                                                //身分證字號檢查機制,參見維基百科
	}
		
	String getId(){  //因為id被封裝,直接叫出id
		return id;
	}
}
