package tw.org.iii;

public class Brad22 {

	public static void main(String[] args) {
		int a = 1; int sum = 0;
		while (a<10){
			System.out.println(a++);   //印出1-9
		}                              //如果只有a會形成無窮迴圈,只會印出a=1,a++不會形成無窮迴圈
	}
}
