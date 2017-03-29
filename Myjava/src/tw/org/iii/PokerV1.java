package tw.org.iii;
//洗牌
public class PokerV1 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();   //執行此次程式系統時間
		int[] poker = new int[52]; //0-51 = >0
		for (int i=0; i<52; i++){
			int temp = (int)(Math.random()*52);
			//檢查機制
			boolean isRepeat = false;  //設定重複為false
			for(int j=0; j<i; j++){
				if (poker[j]==temp){
					isRepeat = true;   //假如有重複,重複為true
					break;
				}
			}
			if(!isRepeat){         //假如沒重複,執行以下指令
				poker[i] = temp;
				System.out.println("poker[" + i + "]=" + poker[i]);
			}else{
				i--;               //此次執行結果不算,重新再執行此次結果
			}
		}
		System.out.println(System.currentTimeMillis() - start);   //此次程式執行之時間,單位數字是千分之一秒
	}
}
