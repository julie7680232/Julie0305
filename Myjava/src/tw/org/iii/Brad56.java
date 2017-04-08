package tw.org.iii;
//P48解釋-1
public class Brad56 {

	public static void main(String[] args) {
		m1(1);  //印出1;改成m1(1,2)印出1及2,會換列

	}
	static void m1(int a){
		System.out.println(a);
	}
	static void m1(int a,int b){
		System.out.println(a);
		System.out.println(b);
	}

}
