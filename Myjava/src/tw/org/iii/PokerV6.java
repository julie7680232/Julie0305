package tw.org.iii;
//�w�����~�P�εo�P,�{�b�����u�P���μƦr,�z�P
import java.util.Arrays;

public class PokerV6 {

	public static void main(String[] args) {
		        // �~�P
				boolean[] check = new boolean[52];	// 0 - 51: false
				int[] poker = new int[52]; // 0- 51: 0
				int temp; int counter=0;   //�ŧi�����ܼ�
				for (int i=0; i<52; i++){
					do{
						temp = (int)(Math.random()*52);
						counter++;   //�o�X�`�@����X��
					}while (check[temp]);  ////check[temp]�Otrue,�N���ƤF,�~�����do�����e,����check[temp]�Ofalse����j��
					
					poker[i] = temp;  
					check[temp] = true;  //�O�o�U�����n�A��temp����,�@�}�ltemp��false,�ҥH�n�gcheck[temp] = true
					System.out.println(temp);
				}
				// �o�P => �|�Ӫ��a => �C�a��13�i
				int[][] player = new int[4][13];
				for (int i=0; i<poker.length; i++){
					player[i%4][i/4] = poker[i];     //i%4�����y�o���|�Ӫ��a,i/4���C�H�ĴX���o���P
				}
				System.out.println("-----------------------------");
				// �u�P
				String[] suits = {"�®�","����","���","����"}; // suits[0]=�®�
				String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"}; // values[0]=A
				
				for (int[] cards : player){
					//�z�P
					Arrays.sort(cards);     //�C�쪱�a���P�i��Ƨ�(�z�P),API�d��,�H�a�w�g���{��,�����I�s�ϥ�
					for (int card : cards){
						System.out.print(suits[card/13] + values[card%13] + "  ");  
						// card/13�i�o���|�ت��,card%13�i�o���Ʀr��A,J,Q,K(card��0-51)
					}
					System.out.println();
				}
	}
}
