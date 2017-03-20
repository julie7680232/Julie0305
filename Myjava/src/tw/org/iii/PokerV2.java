package tw.org.iii;

public class PokerV2 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int[] poker = new int[52]; //0-51 = >0
		boolean isRepeat; int temp;
		for (int i=0; i<52; i++){
			do{
				temp = (int)(Math.random()*52);
				//檢查機制
				isRepeat = false;
				for(int j=0; j<i; j++){
					if (poker[j]==temp){
						isRepeat = true;
						break;
					}
				}
			}while (isRepeat);
			poker[i] = temp;
			System.out.println(poker[i]);
			}
			
				
			
		System.out.println("號時"+(System.currentTimeMillis() - start));  //字串沒有減的運算
		
		

	}

	

}
