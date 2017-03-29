package tw.org.iii;
//洗牌
public class PokerV2 {   //執行PokerV1之Code Review(改善程式)
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();   //執行此次程式系統時間
		int[] poker = new int[52]; //0-51 = >0
		boolean isRepeat; int temp;      //isRepeat及temp在迴圈內宣告,否則do while之布林值及for迴圈無法知道其定義
		for (int i=0; i<52; i++){
			do{       //先作do內容一次後,測試布林值是否正確,若正確再重新執行do的內容
				temp = (int)(Math.random()*52);   
				//檢查機制
				isRepeat = false;  //迴圈外宣告後,仍然要給個初始值(設定重複為false)
				for(int j=0; j<i; j++){
					if (poker[j]==temp){
						isRepeat = true;  //假如有重複,重複為true
						break;
					}
				}
			}while (isRepeat);  //isRepeat需要再迴圈外宣告(假如沒重複,執行以下指令)
			poker[i] = temp;    //temp需要再迴圈外宣告
			System.out.println("poker[" + i + "]=" + poker[i]);
			}
		System.out.println("耗時:"+(System.currentTimeMillis() - start));  
		//字串沒有減的運算,所以先括號執行完運算後,再與字串相加;字串加數字=字串
	}
}
