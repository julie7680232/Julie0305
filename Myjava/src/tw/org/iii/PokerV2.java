package tw.org.iii;
//�~�P
public class PokerV2 {   //����PokerV1��Code Review(�ﵽ�{��)
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();   //���榹���{���t�ήɶ�
		int[] poker = new int[52]; //0-51 = >0
		boolean isRepeat; int temp;      //isRepeat��temp�b�j�餺�ŧi,�_�hdo while�����L�Ȥ�for�j��L�k���D��w�q
		for (int i=0; i<52; i++){
			do{       //���@do���e�@����,���ե��L�ȬO�_���T,�Y���T�A���s����do�����e
				temp = (int)(Math.random()*52);   
				//�ˬd����
				isRepeat = false;  //�j��~�ŧi��,���M�n���Ӫ�l��(�]�w���Ƭ�false)
				for(int j=0; j<i; j++){
					if (poker[j]==temp){
						isRepeat = true;  //���p������,���Ƭ�true
						break;
					}
				}
			}while (isRepeat);  //isRepeat�ݭn�A�j��~�ŧi(���p�S����,����H�U���O)
			poker[i] = temp;    //temp�ݭn�A�j��~�ŧi
			System.out.println("poker[" + i + "]=" + poker[i]);
			}
		System.out.println("�Ӯ�:"+(System.currentTimeMillis() - start));  
		//�r��S����B��,�ҥH���A�����槹�B���,�A�P�r��ۥ[;�r��[�Ʀr=�r��
	}
}
