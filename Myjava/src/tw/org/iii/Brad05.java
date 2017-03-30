package tw.org.iii;

import java.util.Collections;
import java.util.LinkedList;

public class Brad05 {

	public static void main(String[] args) {
			LinkedList<Integer> poker = new LinkedList<>(); //資料結構的東西,之後會說明此段,先使用,此指訂定poker,但裡面沒資料
			for (int i=1; i<52; i++) poker.add(i);         //poker放入資料
			Collections.shuffle(poker);                    //查詢API,得知洗牌函數
			for (Integer card : poker){
				System.out.println(card);
			}
			
//			for (int i=0; i<6; i++){                      //將i<52改成i<=49 =>大樂透
//				System.out.println(poker.get(i));         //取出6個數字
//			}
	}
}
