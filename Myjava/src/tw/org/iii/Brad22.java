package tw.org.iii;

public class Brad22 {

	public static void main(String[] args) {
		int a = 1; int sum = 0;
		while (a<=100){
			sum += a++;
		}
			System.out.println(a++);                              //如果只有a會形成無窮迴圈，a++不會形成無窮迴圈
	}

}
