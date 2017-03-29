package tw.org.iii;

import java.util.Arrays;

public class PokerV6 {

	public static void main(String[] args) {
		// 洗牌
				boolean[] check = new boolean[52];	// 0 - 51: false
				int[] poker = new int[52]; // 0- 51: 0
				int temp; int counter=0;
				for (int i=0; i<52; i++){
					do{
						temp = (int)(Math.random()*52);
						counter++;
					}while (check[temp]);
					
					poker[i] = temp;
					check[temp] = true;
					System.out.println(temp);
				}
				// 發牌 => 四個玩家 => 每家有13張
				int[][] player = new int[4][13];
				for (int i=0; i<poker.length; i++){
					player[i%4][i/4] = poker[i];
				}
				System.out.println("--");
				// 攤牌
				String[] suits = {"黑桃","紅心","方塊","梅花"}; // suits[0]=黑桃
				String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"}; // values[0]=A
				
				for (int[] cards : player){
					//理牌
					Arrays.sort(cards);
					for (int card : cards){
						System.out.print(suits[card/13] + values[card%13] + "  ");
						
					}
					System.out.println();
				}
				
				

	}

}
