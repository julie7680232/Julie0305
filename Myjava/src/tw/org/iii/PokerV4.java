package tw.org.iii;

public class PokerV4 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		boolean[] check = new boolean[52];  // 0-51:false
		int[] poker = new int [52];   // 0-51:0
		int temp; int counter=0;
		for(int i=0;i<52;i++){
			
			do{
				temp = (int)(Math.random()*52);
				counter++;
			}while(check[temp] = true);
			
			poker[i] = temp;
			check[temp] = true;
			System.out.println(temp);
			
		}
	
			
		System.out.println("號時:"+(System.currentTimeMillis() - start));  //字串沒有減的運算
		System.out.println("次數:"+counter);
		

	}

	

}
