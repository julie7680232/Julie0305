package tw.org.iii;
//物件導向:增加新建構式(建構的參數列.個數及型別都不同),剛剛TWId3~5是user指定的字串當作身分證字號,現在使用身分證字號產生器
//身分證字號產生器:1.完全隨機 2.指定男生.女生 3.指定地區  4.指定男生.女生及地區
public class TWId6 {
	private String id; //屬性慣例用小寫,//需不需要被封裝,是否可被更改
	static String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
	TWId6(){        //身分證字號產生器: 1.完全隨機
		this((int)(Math.random()*2)==0);  //如果this(3);則會出現區域D//不能再加入super,因為建構句第一道敘述句super與this只能選一個
//如果不寫this((int)(Math.random()*2)==0),可以改成第10~22列,但需要改第10~11列
//		char f0 = letters.charAt(area);  //抽出字元,得出地區
//		char f1 = isFemale?'2':'1';  //若為女生等於2,否則為1
//		String temp = "" + f0 + f1;  //字串加其他型別為字串
//		for(int i=0;i<7;i++){
//			temp+=(int)(Math.random()*10);  //身分證字號:第0-8碼
//			//物件裡面可以呼叫static,static不能呼叫物件
//		}
//		for(int i=0; i<10; i++){  //將i當作身分證字號第9碼
//			if(isCheckOK(temp +i)){    //i須符合身分證字號檢查機制
//				id = temp + i;
//				break;
//			}
//		}
	}
	TWId6(boolean isFemale){    //身分證字號產生器: 2.指定男生.女生
		this(isFemale,(int)(Math.random()*26));  //指定女生,區域有26個英文字母
	}
	TWId6(int area){      //身分證字號產生器: 3.指定地區 
		this((int)(Math.random()*2)==0,area);    //男女生不指定,指定地區
		//this(true,area); =>true則表示為女生,不同區域,若改成random則男生.女生隨機選取
	}
	TWId6(boolean isFemale, int area){  // 身分證字號產生器: 4.指定男生.女生及地區
		char f0 = letters.charAt(area);  //抽出字元,得出地區
		char f1 = isFemale?'2':'1';  //若為女生等於2,否則為1
		String temp = "" + f0 + f1;  //字串加其他型別為字串
		for(int i=0;i<7;i++){
			temp+=(int)(Math.random()*10);  //身分證字號:第0-8碼
			//物件裡面可以呼叫static,static不能呼叫物件
		}
		for(int i=0; i<10; i++){  //將i當作身分證字號第9碼
			if(isCheckOK(temp +i)){    //i須符合身分證字號檢查機制
				id = temp + i;
				break;
			}
		}
	}
	
	TWId6(String id){  //建構式名稱與class相同 
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
		if (!id.matches("^[A-Z][12][0-9]{8}$")) return false;  
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
//	static boolean preCheck(String id){
//	// length == 10
//	// charAt(0) => A- Z
//	// charAt(1) => 1, 2
//	// other => 0 -9
//	boolean result = true;
//	if (id.length() != 10){     // length == 10
//		result= false; 
//	}else {
//		if (letters.indexOf(id.charAt(0)) == -1) return false;   // charAt(1) => 1, 2
//	}
//	
//	return result;
//}
		
	String getId(){  //因為id被封裝,直接叫出id
		return id;
	}
}
