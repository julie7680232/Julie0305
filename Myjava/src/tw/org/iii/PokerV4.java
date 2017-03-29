package tw.org.iii;
//洗牌
public class PokerV4 {   //將PokerV3的if else 改為用do while執行之

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
	}
}
