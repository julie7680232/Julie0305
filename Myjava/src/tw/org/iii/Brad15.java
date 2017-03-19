package tw.org.iii;

public class Brad15 {//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p = new int [6]; //0-5 => 0
		for (int i=0;i<100;i++){
			int dice = (int)(Math.random()*6); //0-5
			p[dice]++;
		}
		for (int i=0; i<p.length; i++){
			System.out.println((i+1) + "點出現" + p[i] + "次");
		}

	}

}
