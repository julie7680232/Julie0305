package tw.org.iii;

public class TWid {   
	private String id;  //�ݤ��ݭn�Q�ʸ�,�O�_�i�Q���//
	static String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
	TWid(String id){
		this.id = id;        //�e��this�Oprivate String ��id       //��TWID(String myid){id = myid;}
	}
	//true => female;flase => male
	boolean isFemale(){
		char gender = id.charAt(1); //A123456789 =>1
		return  gender == '2';
	}
			static boolean isCheckOk(String id){
				if(!preCheck(id)) false;
				
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
