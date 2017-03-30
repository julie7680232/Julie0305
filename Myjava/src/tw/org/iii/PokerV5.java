package tw.org.iii;
//已完成洗牌,現在說明發牌及攤牌(為標示成撲克牌之樣式:有花色及其數字)
public class PokerV5 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();   //執行此次程式系統時間
		boolean[] check = new boolean[52];  // 0-51:false
		int[] poker = new int [52];   // 0-51:0
		int temp ; int counter=0;  //宣告次數變數
		for(int i=0;i<52;i++){
			do{
				temp = (int)(Math.random()*52);
				counter++;   //得出總共執行幾次
			}while(check[temp]);   //check[temp]是true,代表重複了,繼續執行do之內容,直到check[temp]是false跳脫迴圈
			
			poker[i] = temp;
			check[temp] = true;   //記得下次不要再拿temp的值,一開始temp為false,所以要寫check[temp] = true
			System.out.println("poker[" + i + "]=" + poker[i]);  //此列印出每次執行的i值,算出poker[i]
			//System.out.println("次數:"+counter);  //印出每得出一個poker[i],到目前為止執行了多少次
		}
		System.out.println("耗時"+(System.currentTimeMillis() - start)); 
		//字串沒有減的運算,所以先括號執行完運算後,再與字串相加;字串加數字=字串
		System.out.println("次數:"+counter);  //印出整段程式執行了多少次
		
		
		//發牌 = >四個玩家 => 每家有13張
		int[][] player = new int[4][13];
		for(int i=0; i<poker.length; i++){ 
			player[i%4][i/4] = poker[i];     //i%4指輪流發給四個玩家,i/4指每人第幾輪發的牌
		}
		System.out.println("---------------------------");
		//驗算第一家發的牌
		for (int v :player[0]){            
			System.out.println(v);   
		}
		System.out.println("---------------------------");
		//驗算第二家發的牌
		for (int v :player[1]){
			System.out.println(v);	
		}
		//攤牌,將4個玩家發到的牌分別依序印出來
		for(int[] cards:player){   //尋訪玩家,玩家為一維陣列,每個玩家都有很多張牌(13張牌),因此card加上s
			for(int card : cards){       //每一張牌會從很多張牌抽出來
				System.out.print(card + "  ");  //印完第一位玩家後,換行印第二位玩家,其他玩家依序印出
			}
			System.out.println();
		}
	}
}
