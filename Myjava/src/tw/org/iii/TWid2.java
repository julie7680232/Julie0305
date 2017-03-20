package tw.org.iii;

public class TWid2 {   
	private String id;  //需不需要被封裝,是否可被更改
	static String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
	TWid(){
		this ((int)(math.random()*2==0);  //不能再加入super,因為建構句第一道敘述句super與this只能選一個
	}
	TWid(boolean isFemale){
		this (isFemale,(int)(Math.random()*26));
	}
	TWid(int area){
		this ((int)(math.random()*2==0,area);
		}
	TWid(boolean isFemale,int area){
		//super();
		char f0 = letters.charAt(area);
		char f1 = isFemale?'2':'1';
		String temp = "" + f0 + f1;
		for(int i=0;i<7;i++){
			temp +=(int)(Math.random()*10);
		}
		for(int i=0;i<10;i++){
			if(isCheck)(temp+i){
				id=temp+i;
				break;
			}
		}
	
}
	
	TWid2(String id){
		this.id = id;        //前面this是private String 之id       //或TWID(String myid){id = myid;}
	}
	//true => female;flase => male
	boolean isFemale(){
		char gender = id.charAt(1); //A123456789 =>1
		return  gender == '2';
	}
			static boolean isCheckOk(String id){
				if(!id.matches("^[A-Zxyz][12][0-9]{8}$")) return false;
				
				char f0 = id.charAt(0);
				int n12 = letters.indexOf(f0) + 10;   //'Y'=>21+10=31
				int n1 = n12 / 10;
				int n2 = n12 % 10;
				int n3 = Integer.parseInt(id.substring(1,2));
				int n4 = Integer.parseInt(id.substring(2,3));
				int n5 = Integer.parseInt(id.substring(3,4));
				int n6 = Integer.parseInt(id.substring(4,5));
				int n7 = Integer.parseInt(id.substring(5,6));
				int n8 = Integer.parseInt(id.substring(6,7));
				int n9 = Integer.parseInt(id.substring(7,8));
				int n10 = Integer.parseInt(id.substring(8,9));
				int n11 = Integer.parseInt(id.substring(9,10));
				int sum = n1*1+n2*9+n3*8+n4*7+n5*6+n6*5+n7*4+n8*3+n9*2+n10*1+n11*1;
				return sum % 10 == 0;
				//System.out.println(n3);
				
			}
			
	static boolean preCheck(String id){
		//length ==10;
		//charAt(0)=>A-Z
		//charAt(1)=>1,2
		//other = >0-9
		boolean result = true; 
		if(id.length()!=10){ 
			result false;
		}else{
			if(letters.indexOf(id.charAt(0)) == -1) return flase;
			else{
				                                           //Fixed
			}
		}
		
		return result;
	}		
			
	
	String getID(){
		return id;
	}
	

}
