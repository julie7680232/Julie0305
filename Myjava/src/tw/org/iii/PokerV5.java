package tw.org.iii;

import java.util.Arrays;

public class PokerV5 {

	public static void main(String[] args) {
		// �~�P
				boolean[] check = new boolean[52];	// 0 - 51: false
				int[] poker = new int[52]; // 0- 51: 0
				int temp; int counter=0;
				for (int i=0; i<52; i++){
					do{
						temp = (int)(Math.random()*52);
						counter++;
					}while (check[temp]);
					
					poker[i] = temp;
					check[temp] = true;
					System.out.println(temp);
				}
				// �o�P => �|�Ӫ��a => �C�a��13�i
				int[][] player = new int[4][13];
				for (int i=0; i<poker.length; i++){
					player[i%4][i/4] = poker[i];
				}
				System.out.println("--");
				// �u�P
				String[] suits = {"�®�","����","���","����"}; // suits[0]=�®�
				String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"}; // values[0]=A
				
				for (int[] cards : player){
					//�z�P
					Arrays.sort(cards);
					for (int card : cards){
						System.out.print(suits[card/13] + values[card%13] + "  ");
						
					}
					System.out.println();
				}
				
				

	}

}