package tw.org.iii;

public class PokerV4 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		//�~�P
		boolean[] check = new boolean[52];  // 0-51:false
		int[] poker = new int [52];   // 0-51:0
		int temp; int counter=0;
		for(int i=0;i<52;i++){
			
			do{
				temp = (int)(Math.random()*52);
				counter++;
			}while(check[temp] = true);
			
			poker[i] = temp;
			check[temp] = true;
			System.out.println(temp);
			
		}
			
		System.out.println("����:"+(System.currentTimeMillis() - start));  //�r��S����B��
		System.out.println("����:"+counter);
		
		
		//�o�P = >�|�Ӫ��a => �C�a��13�i
		int[][] player = new int[4][13];
		for(int i=0; i<poker.length; i++){
			player[i%4][i/4] = poker[i];
		}
		System.out.println("---------------------------");
		//���Ĥ@�a
		for (int v :player[0]){
			System.out.println(v);
		}
		System.out.println("---------------------------");
		//���ĤG�a
		for (int v :player[1]){
			System.out.println(v);
		//�u�P
		for(int[] cards:player){
			for(int card : cards){
				System.out.print(card + "  ");
			}
			System.out.println();
		}
		}
	

	}

	

}
