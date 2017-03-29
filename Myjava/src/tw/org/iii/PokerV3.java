package tw.org.iii;
//洗牌
public class PokerV3 {    
	//運用if else 執行,但執行出來的結果並不一定共有52張牌,部分會有重複,因此for迴圈執行52次,執行出不重複的牌一定小於52張,除非在if中加入i--

	public static void main(String[] args) { 
		long start = System.currentTimeMillis();    //執行此次程式系統時間
		boolean[] check = new boolean[52];  // 0-51:false
		int[] poker = new int [52];   // 0-51:0
		for(int i=0;i<52;i++){
			int temp = (int)(Math.random()*52);
			if(check[temp]){  //check[temp]是true,代表重複了
				//重複了
				i--;
			}else{     //check[temp]是false,代表沒有重複,代值進入Poker[i]
				poker[i] = temp;
				check[temp] = true;  //記得下次不要再拿temp的值,所以要寫check[temp] = true
				System.out.println("poker[" + i + "]=" + poker[i]);  //次列印出執行之i值得出的poker[i]沒有重複
			}
			//System.out.println("poker[" + i + "]=" + poker[i]);  //此列印出每次執行的i值,算出poker[i]
		}
		System.out.println("耗時"+(System.currentTimeMillis() - start));  
		//字串沒有減的運算,所以先括號執行完運算後,再與字串相加;字串加數字=字串
	}
}
