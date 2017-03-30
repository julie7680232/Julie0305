package tw.org.iii;

//while與for迴圈之使用比較
public class Brad23 {

	public static void main(String[] args) {
		int a = 1; int sum = 0;
		//用while迴圈
		while (a<=100){
			sum += a++;   //累加a得出sum
		}
			System.out.println("1+2+...+100="+sum);
			System.out.println("-----------------------------------");
		//用for迴圈
		a=1;sum = 0;                              //a=1;sum=0 for( ;a<=100;){sum+=a++}
		for( ;a<=100; ){   
			sum += a++;
		}
		System.out.println("1+2+...+100="+sum);
	}

}
