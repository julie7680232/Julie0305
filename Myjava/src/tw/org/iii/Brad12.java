package tw.org.iii;

public class Brad12 {

	public static void main(String[] args) {
		for(int i=1,j=10; i<10; i++,j--){
			System.out.println(i + ":" +j);
			if(j==7){
				break;
			}
		}
		
		System.out.println("--------------------------------");
		
		for (int i=0; i<10; i++){
			if (i%2==0) continue; //i=2�h���|�L�Xi,��������i=3(i++)
			System.out.println(i);
		}
		
		
		System.out.println("--------------------------------");
		
		Julie:   //�аO���j��
		for (int i=0; i<10;i++){
			for(int j=9; j>0; j--){
				System.out.println(i+":"+j);
				if (j%5==0)  break Julie;   //���_�ܭ��Ӧa��(Julie���j��)     �Ybreak��continue
				continue;                  //�]��System.out.println("OK");�û����椣��,�G����s���|���~
				System.out.println("OK");
			}
		}
		
		
		
	}

}
