package tw.org.iii;

import java.util.Collections;
import java.util.LinkedList;

public class Brad05 {

	public static void main(String[] args) {
			LinkedList<Integer> poker = new LinkedList<>(); //��Ƶ��c���F��,����|�������q,���ϥ�,�����q�wpoker,���̭��S���
			for (int i=1; i<52; i++) poker.add(i);         //poker��J���
			Collections.shuffle(poker);                    //�d��API,�o���~�P���
			for (Integer card : poker){
				System.out.println(card);
			}
			
//			for (int i=0; i<6; i++){                      //�Ni<52�令i<=49 =>�j�ֳz
//				System.out.println(poker.get(i));         //���X6�ӼƦr
//			}
	}
}
