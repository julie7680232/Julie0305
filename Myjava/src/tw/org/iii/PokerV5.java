package tw.org.iii;
//�w�����~�P,�{�b�����o�P���u�P(���Хܦ����J�P���˦�:�����Ψ�Ʀr)
public class PokerV5 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();   //���榹���{���t�ήɶ�
		boolean[] check = new boolean[52];  // 0-51:false
		int[] poker = new int [52];   // 0-51:0
		int temp ; int counter=0;  //�ŧi�����ܼ�
		for(int i=0;i<52;i++){
			do{
				temp = (int)(Math.random()*52);
				counter++;   //�o�X�`�@����X��
			}while(check[temp]);   //check[temp]�Otrue,�N���ƤF,�~�����do�����e,����check[temp]�Ofalse����j��
			
			poker[i] = temp;
			check[temp] = true;   //�O�o�U�����n�A��temp����,�@�}�ltemp��false,�ҥH�n�gcheck[temp] = true
			System.out.println("poker[" + i + "]=" + poker[i]);  //���C�L�X�C�����檺i��,��Xpoker[i]
			//System.out.println("����:"+counter);  //�L�X�C�o�X�@��poker[i],��ثe�������F�h�֦�
		}
		System.out.println("�Ӯ�"+(System.currentTimeMillis() - start)); 
		//�r��S����B��,�ҥH���A�����槹�B���,�A�P�r��ۥ[;�r��[�Ʀr=�r��
		System.out.println("����:"+counter);  //�L�X��q�{������F�h�֦�
		
		
		//�o�P = >�|�Ӫ��a => �C�a��13�i
		int[][] player = new int[4][13];
		for(int i=0; i<poker.length; i++){ 
			player[i%4][i/4] = poker[i];     //i%4�����y�o���|�Ӫ��a,i/4���C�H�ĴX���o���P
		}
		System.out.println("---------------------------");
		//���Ĥ@�a�o���P
		for (int v :player[0]){            
			System.out.println(v);   
		}
		System.out.println("---------------------------");
		//���ĤG�a�o���P
		for (int v :player[1]){
			System.out.println(v);	
		}
		//�u�P,�N4�Ӫ��a�o�쪺�P���O�̧ǦL�X��
		for(int[] cards:player){   //�M�X���a,���a���@���}�C,�C�Ӫ��a�����ܦh�i�P(13�i�P),�]��card�[�Ws
			for(int card : cards){       //�C�@�i�P�|�q�ܦh�i�P��X��
				System.out.print(card + "  ");  //�L���Ĥ@�쪱�a��,����L�ĤG�쪱�a,��L���a�̧ǦL�X
			}
			System.out.println();
		}
	}
}
