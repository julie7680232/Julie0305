package tw.org.iii;
//猜數字遊戲除和新功能外,增加其他功能:1.猜了幾次 (第19列)2.回顧猜的內容(第17,20,24列)
/*
 * Program: Guess Number game
 */
import javax.swing.JOptionPane;
public class Brad26 {
	          
	public static void main(String[] args) {
		//1.Create Answer
		String answer = createAnswer(3);   //建立static物件,並呼叫方法  d=3
		//System.out.println(answer); //一開始顯現答案,若不出現答案,刪除即可

		//2.Start
		boolean isWinner = false;
		String hist = "";
		for(int i=0;i<10;i++){   //猜10次
		//2-1. input a number string
			String guess = JOptionPane.showInputDialog((i+1) + ". 猜一個數字\n" + hist);  //不需要變整數,因為是玩字串,不像閏年要變換成整數
			//增加猜了幾次
		//2-2. compare string => result
			String result = checkAB(answer,guess);   //檢查A及B
			hist += (i+1)+ "." + guess + ":" + result + "\n";  //定義hist,回顧猜的內容
			JOptionPane.showMessageDialog(null, result);  //沒有parentComponent意指沒有父母是孤兒,所以用null
		//2-3. WINNER -> break
			if(result.equals("3A0B")){    //訂定布林值isWinner = false,若3A0B則isWinner為true,迴圈跳出
				isWinner = true;
				break;
			}
		//2-4. repeat 10 times => LOSSER
		}
		//3.show....../........
		if(isWinner){
			JOptionPane.showMessageDialog(null, "恭喜老爺,賀喜夫人");   //假如贏了,視窗會秀出"恭喜老爺,賀喜夫人"
		}else{
			JOptionPane.showMessageDialog(null,"Losser,Answer is " + answer);  //反之,若輸了,視窗會秀出Losser,並提供答案
		}
	}
	//method:checkAB(answer,guess) => ?A?B
	static String checkAB(String a,String g){
		int A, B; A = B = 0;
		for(int i=0; i<g.length(); i++){
			if (g.charAt(i) == a.charAt(i)){      //假如g中第i碼 == a中的第i碼
				A++;
			}else if(a.indexOf(g.charAt(i))!= -1){         //g中的第i碼是否存在於a中 ;g.charAt(i)>=0或g.charAt(i)!=-1
				B++;
			}
		}
		return A + "A" + B + "B";
	}

	//method:create a answer
		static String createAnswer(int d){   //建立static物件,並呼叫方法   //d指的是可以猜幾位數字
	  //		return "742";
	 //	}
			//洗牌:洗0-9,10個數字拿去洗牌
			boolean[] check = new boolean[10];  // 0-9:false
			int[] poker = new int [d];   // 0-2:0        //此時d=3
			int temp;
			for(int i=0;i<poker.length;i++){
				do{
					temp = (int)(Math.random()*10);
				}while(check[temp]);
				
				poker[i] = temp;
				check[temp] = true;
			}
			//第一種 return poker[0] + poker[1] + poker[2];  //會報錯,因為createAnswer宣告為字串,但你回傳整數
			//第二種 return  poker[0] + poker[1] + poker[2] + " " ;  //數字加字串就不是字串,因為由左至右運算,若是"742",則結果為7+4+2=13,13會加上字串""
			//第三種 return " " + poker[0] + poker[1] + poker[2];  //因為字串加整數為字串,但數字加字串就不是,若是"742",則結果為" "+742(字串相加)
			//code review 第三種
			String ret = "";             //宣告一個return ,一開始空空如也
			for(int v:poker) ret += v;  //抽出poker之陣列後,字串相加
			return ret;                 //回傳ret
		}                       

}
