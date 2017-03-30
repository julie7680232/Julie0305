package tw.org.iii;
//已完成洗牌及發牌,現在說明攤牌花色及數字,理牌
import java.util.Arrays;

public class PokerV6 {

	public static void main(String[] args) {
		        // 洗牌
				boolean[] check = new boolean[52];	// 0 - 51: false
				int[] poker = new int[52]; // 0- 51: 0
				int temp; int counter=0;   //宣告次數變數
				for (int i=0; i<52; i++){
					do{
						temp = (int)(Math.random()*52);
						counter++;   //得出總共執行幾次
					}while (check[temp]);  ////check[temp]是true,代表重複了,繼續執行do之內容,直到check[temp]是false跳脫迴圈
					
					poker[i] = temp;  
					check[temp] = true;  //記得下次不要再拿temp的值,一開始temp為false,所以要寫check[temp] = true
					System.out.println(temp);
				}
				// 發牌 => 四個玩家 => 每家有13張
				int[][] player = new int[4][13];
				for (int i=0; i<poker.length; i++){
					player[i%4][i/4] = poker[i];     //i%4指輪流發給四個玩家,i/4指每人第幾輪發的牌
				}
				System.out.println("-----------------------------");
				// 攤牌
				String[] suits = {"黑桃","紅心","方塊","梅花"}; // suits[0]=黑桃
				String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"}; // values[0]=A
				
				for (int[] cards : player){
					//理牌
					Arrays.sort(cards);     //每位玩家的牌進行排序(理牌),API查詢,人家已寫完程式,直接呼叫使用
					for (int card : cards){
						System.out.print(suits[card/13] + values[card%13] + "  ");  
						// card/13可得知四種花色,card%13可得知數字或A,J,Q,K(card為0-51)
					}
					System.out.println();
				}
	}
}
