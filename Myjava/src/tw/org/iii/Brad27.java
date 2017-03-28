package tw.org.iii;

import javax.swing.JOptionPane;
/*
 * Program: Guess Number game
 */
public class Brad27 {

	public static void main(String[] args) {
		// 1. Create Answer
				String answer = createAnswer(3);   
			//	System.out.println(answer);
				
		// 2. Start
				boolean isWinner = false;
				String hist = "";
				for (int i=0; i<10; i++){       //�q10��
					// 2-1. input a number string
					String guess = JOptionPane.showInputDialog((i+1)+".�q�@�ӼƦr\n" + hist);
					
					// 2-2. compare string => result
					String result = checkAB(answer, guess);        //�ˬdA��B
					hist += (i+1)+"."+ guess + ":" + result +"\n";
					JOptionPane.showMessageDialog(null, result);   //  �S�������O�t��,�G��null
					if(result.equals("3A0B")){
					// 2-3. WINNER -> break
						isWinner = true;
						break;
					}
					// 2-4. repeat 10 times > LOSSER
				}
				
				// 3. show ..... / .... 
				if (isWinner){
					JOptionPane.showMessageDialog(null, "���ߦѷ�,�P�ߤҤH");
				}else{
					JOptionPane.showMessageDialog(null, "LOSSER,Answer is" + answer);
				}
				
				
			}
			
			// method: checkAB(answer, guess) => ?A?B 
			static String checkAB(String a, String g){
				int A,B; A=B=0;
				for(int i=0;i<g.length();i++){
					if(g.charAt(i) == a.charAt(i)) {     //g������i�X == a������i�X
						A++;
					}else if(a.indexOf(g.charAt(i)!=-1)){     //g������i�X�O�_�s�b��a��  ;g.charAt(i)>=0��g.charAt(i)!=-1
						B++;
					}
				}
				return A + "A" + B + "B";
			}
			
			// method: create a answer
			static String createAnswer(int d){
				// �~�P
				boolean[] check = new boolean[10];	// 0 - 9: false
				int[] poker = new int[d]; // 0-2: 0
				int temp; int counter=0;
				for (int i=0; i<poker.length; i++){
					do{
						temp = (int)(Math.random()*10);
						counter++;
					}while (check[temp]);
					poker[i] = temp;
					check[temp] = true;
				}
				String ret = "";
				for(int v:poker) ret += v;
				
				return ret;

	}

}