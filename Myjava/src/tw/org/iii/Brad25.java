package tw.org.iii;
import javax.swing.JOptionPane;
public class Brad25 {
	//method:create a answer
	static String createAnswer(int d){
		//�~�P
		boolean[] check = new boolean[10];  // 0-9:false
		int[] poker = new int [d];   // 0-2:0
		int temp; int counter=0;
		for(int i=0;i<10;i++){
			do{
				temp = (int)(Math.random()*10);
				counter++;
			}while(check[temp]);
			
			poker[i] = temp;
			check[temp] = true;
		}
		String ret = "";
		for(int v:poker) ret += v;
			
		return ret;  //"" + poker[0] + poker[1] + poker[2];  //����return poker[0] + poker[1] + poker[2] + "";
	}                                  //�]���r��[�Ʀr���r��,���Ʀr�[�r��N���O
	
	public static void main(String[] args) {
		//1.Create Answer
		String answer = createAnswer(3);
		System.out.println(answer);
				
				
				
		//2.Start
		//2-1. input a number string
		//2-2. compare string => result
		//2-3. WINNER -> break
		//2-4. repeat 10 times => LOSSER
		
		//3.show....../........
	}

}
