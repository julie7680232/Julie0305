package tw.org.iii;
/*
 * Program: Guess Number game
 */
import javax.swing.JOptionPane;
public class Brad25 {
	           

	public static void main(String[] args) {
		//1.Create Answer
		String answer = createAnswer(3);   //建立static物件,並呼叫方法  d=3
		System.out.println(answer);
				
				
		//2.Start
		for(int i=0;i<10;i++){
		//2-1. input a number string
			String guess = JOptionPane.showInputDialog("猜一個數字");  //不需要變整數,因為是玩字串,不像閏年要變換成整數
		//2-2. compare string => result
			String result = checkAB(answer,guess);
			JOptionPane.showMessageDialog(null, result);  //沒有parentComponent,所以用null
		//2-3. WINNER -> break
		//2-4. repeat 10 times => LOSSER
		}
		//3.show....../........
	}
	//method:checkAB(answer,guess) => ?A?B
	static String checkAB(String a,String g){
		
		
		return "1A2B";
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
