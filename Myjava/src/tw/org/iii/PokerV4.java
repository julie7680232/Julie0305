package tw.org.iii;

public class PokerV4 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		//洗牌
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
		
		
		//發牌 = >四個玩家 => 每家有13張
		int[][] player = new int[4][13];
		for(int i=0; i<poker.length; i++){
			player[i%4][i/4] = poker[i];
		}
		System.out.println("---------------------------");
		//驗算第一家
		for (int v :player[0]){
			System.out.println(v);
		}
		System.out.println("---------------------------");
		//驗算第二家
		for (int v :player[1]){
			System.out.println(v);
		//攤牌
		for(int[] cards:player){
			for(int card : cards){
				System.out.print(card + "  ");
			}
			System.out.println();
		}
		}
	

	}

	

}
