package tw.org.iii;
//�~�P
public class PokerV4 {   //�NPokerV3��if else �אּ��do while���椧

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
	}
}
