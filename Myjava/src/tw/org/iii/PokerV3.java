package tw.org.iii;
//�~�P
public class PokerV3 {    
	//�B��if else ����,������X�Ӫ����G�ä��@�w�@��52�i�P,�����|������,�]��for�j�����52��,����X�����ƪ��P�@�w�p��52�i,���D�bif���[�Ji--

	public static void main(String[] args) { 
		long start = System.currentTimeMillis();    //���榹���{���t�ήɶ�
		boolean[] check = new boolean[52];  // 0-51:false
		int[] poker = new int [52];   // 0-51:0
		for(int i=0;i<52;i++){
			int temp = (int)(Math.random()*52);
			if(check[temp]){  //check[temp]�Otrue,�N���ƤF
				//���ƤF
				i--;
			}else{     //check[temp]�Ofalse,�N��S������,�N�ȶi�JPoker[i]
				poker[i] = temp;
				check[temp] = true;  //�O�o�U�����n�A��temp����,�ҥH�n�gcheck[temp] = true
				System.out.println("poker[" + i + "]=" + poker[i]);  //���C�L�X���椧i�ȱo�X��poker[i]�S������
			}
			//System.out.println("poker[" + i + "]=" + poker[i]);  //���C�L�X�C�����檺i��,��Xpoker[i]
		}
		System.out.println("�Ӯ�"+(System.currentTimeMillis() - start));  
		//�r��S����B��,�ҥH���A�����槹�B���,�A�P�r��ۥ[;�r��[�Ʀr=�r��
	}
}
