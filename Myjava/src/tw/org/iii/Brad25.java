package tw.org.iii;
/*
 * Program: Guess Number game
 */
import javax.swing.JOptionPane;
public class Brad25 {
	           

	public static void main(String[] args) {
		//1.Create Answer
		String answer = createAnswer(3);   //�إ�static����,�éI�s��k  d=3
		System.out.println(answer);
				
				
		//2.Start
		for(int i=0;i<10;i++){
		//2-1. input a number string
			String guess = JOptionPane.showInputDialog("�q�@�ӼƦr");  //���ݭn�ܾ��,�]���O���r��,�����|�~�n�ܴ������
		//2-2. compare string => result
			String result = checkAB(answer,guess);
			JOptionPane.showMessageDialog(null, result);  //�S��parentComponent,�ҥH��null
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
