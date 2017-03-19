package tw.org.iii;

public class Brad8 {//

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month = (int)(Math.random()*12+1);  //1月~12月 ,若未加上1則會有0月會出現default,可以確認設定之變數是否OK
		
		System.out.println(month);
		switch(month){
		  case 1:  case 3:  case 5:  case 7:   case 8:  case 10:   case 12:
			  System.out.println("31");
			  break;
		  case 2:
			  System.out.println("28"); 
			  break; 
		  case 4:  case 6:  case 9:  case 11:
			  System.out.println("30");
			  break;
		  default:  //若擺在case2前面,沒有break,則月份為13,會印出default及28
			  System.out.println("default");
			  break;  //不一定要寫,因為已經最後
			  
		}
		
		
		
	}

}
