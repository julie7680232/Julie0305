package tw.org.iii;

public class PokerV3 {//

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		boolean[] check = new boolean[52];  // 0-51:false
		int[] poker = new int [52];   // 0-51:0
		for(int i=0;i<52;i++){
			int temp = (int)(Math.random()*52);
			if(check[temp]){
				//重複了
			}else{
				poker[i] = temp;
				check[temp] = true;
			}
		}
	
			
		System.out.println("號時"+(System.currentTimeMillis() - start));  //字串沒有減的運算
		
		

	}

	

}
