package tw.org.iii;
//�q�Ʀr�C�����M�s�\��~,�W�[��L�\��:1.�q�F�X�� (��19�C)2.�^�U�q�����e(��17,20,24�C)
/*
 * Program: Guess Number game
 */
import javax.swing.JOptionPane;
public class Brad26 {
	          
	public static void main(String[] args) {
		//1.Create Answer
		String answer = createAnswer(3);   //�إ�static����,�éI�s��k  d=3
		//System.out.println(answer); //�@�}�l��{����,�Y���X�{����,�R���Y�i

		//2.Start
		boolean isWinner = false;
		String hist = "";
		for(int i=0;i<10;i++){   //�q10��
		//2-1. input a number string
			String guess = JOptionPane.showInputDialog((i+1) + ". �q�@�ӼƦr\n" + hist);  //���ݭn�ܾ��,�]���O���r��,�����|�~�n�ܴ������
			//�W�[�q�F�X��
		//2-2. compare string => result
			String result = checkAB(answer,guess);   //�ˬdA��B
			hist += (i+1)+ "." + guess + ":" + result + "\n";  //�w�qhist,�^�U�q�����e
			JOptionPane.showMessageDialog(null, result);  //�S��parentComponent�N���S�������O�t��,�ҥH��null
		//2-3. WINNER -> break
			if(result.equals("3A0B")){    //�q�w���L��isWinner = false,�Y3A0B�hisWinner��true,�j����X
				isWinner = true;
				break;
			}
		//2-4. repeat 10 times => LOSSER
		}
		//3.show....../........
		if(isWinner){
			JOptionPane.showMessageDialog(null, "���ߦѷ�,�P�ߤҤH");   //���pĹ�F,�����|�q�X"���ߦѷ�,�P�ߤҤH"
		}else{
			JOptionPane.showMessageDialog(null,"Losser,Answer is " + answer);  //�Ϥ�,�Y��F,�����|�q�XLosser,�ô��ѵ���
		}
	}
	//method:checkAB(answer,guess) => ?A?B
	static String checkAB(String a,String g){
		int A, B; A = B = 0;
		for(int i=0; i<g.length(); i++){
			if (g.charAt(i) == a.charAt(i)){      //���pg����i�X == a������i�X
				A++;
			}else if(a.indexOf(g.charAt(i))!= -1){         //g������i�X�O�_�s�b��a�� ;g.charAt(i)>=0��g.charAt(i)!=-1
				B++;
			}
		}
		return A + "A" + B + "B";
	}

	//method:create a answer
		static String createAnswer(int d){   //�إ�static����,�éI�s��k   //d�����O�i�H�q�X��Ʀr
	  //		return "742";
	 //	}
			//�~�P:�~0-9,10�ӼƦr���h�~�P
			boolean[] check = new boolean[10];  // 0-9:false
			int[] poker = new int [d];   // 0-2:0        //����d=3
			int temp;
			for(int i=0;i<poker.length;i++){
				do{
					temp = (int)(Math.random()*10);
				}while(check[temp]);
				
				poker[i] = temp;
				check[temp] = true;
			}
			//�Ĥ@�� return poker[0] + poker[1] + poker[2];  //�|����,�]��createAnswer�ŧi���r��,���A�^�Ǿ��
			//�ĤG�� return  poker[0] + poker[1] + poker[2] + " " ;  //�Ʀr�[�r��N���O�r��,�]���ѥ��ܥk�B��,�Y�O"742",�h���G��7+4+2=13,13�|�[�W�r��""
			//�ĤT�� return " " + poker[0] + poker[1] + poker[2];  //�]���r��[��Ƭ��r��,���Ʀr�[�r��N���O,�Y�O"742",�h���G��" "+742(�r��ۥ[)
			//code review �ĤT��
			String ret = "";             //�ŧi�@��return ,�@�}�l�ŪŦp�]
			for(int v:poker) ret += v;  //��Xpoker���}�C��,�r��ۥ[
			return ret;                 //�^��ret
		}                       

}
