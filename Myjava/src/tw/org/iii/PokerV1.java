package tw.org.iii;
//�~�P
public class PokerV1 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();   //���榹���{���t�ήɶ�
		int[] poker = new int[52]; //0-51 = >0
		for (int i=0; i<52; i++){
			int temp = (int)(Math.random()*52);
			//�ˬd����
			boolean isRepeat = false;  //�]�w���Ƭ�false
			for(int j=0; j<i; j++){
				if (poker[j]==temp){
					isRepeat = true;   //���p������,���Ƭ�true
					break;
				}
			}
			if(!isRepeat){         //���p�S����,����H�U���O
				poker[i] = temp;
				System.out.println("poker[" + i + "]=" + poker[i]);
			}else{
				i--;               //�������浲�G����,���s�A���榹�����G
			}
		}
		System.out.println(System.currentTimeMillis() - start);   //�����{�����椧�ɶ�,���Ʀr�O�d�����@��
	}
}
