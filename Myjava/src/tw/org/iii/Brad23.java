package tw.org.iii;

//while�Pfor�j�餧�ϥΤ��
public class Brad23 {

	public static void main(String[] args) {
		int a = 1; int sum = 0;
		//��while�j��
		while (a<=100){
			sum += a++;   //�֥[a�o�Xsum
		}
			System.out.println("1+2+...+100="+sum);
			System.out.println("-----------------------------------");
		//��for�j��
		a=1;sum = 0;                              //a=1;sum=0 for( ;a<=100;){sum+=a++}
		for( ;a<=100; ){   
			sum += a++;
		}
		System.out.println("1+2+...+100="+sum);
	}

}
