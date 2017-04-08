package tw.org.iii;

public class P48 {

	public static void main(String[] args) {
		int[]x = {1,2,3};
		int y[] = {4,5,6};
		new P48().go(x,y);
	}
	void go(int[]...z){  //...不定參數
		//z => int[]     [] =>{{1,2,3},{4,5,6}}
		for(int[]a:z){
			System.out.println(a[0]);
		}
	}
}
