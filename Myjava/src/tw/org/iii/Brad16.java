package tw.org.iii;

public class Brad16 {//

	public static void main(String[] args) {

	//	int[] p = new int [9]; //0-8 => 0
	//	for (int i=0; i<20; i++){
	//		int dice = (int)(Math.random()*6); //0-6
	//		p[dice]++;
	//	}
	//	for (int i=0; i<p.length; i++){
	//		System.out.println((i+1) + "點出現" + p[i] + "次");
	//	}
		
		
		int[] p = new int [6]; //0-5 => 0
		for (int i=0; i<100000; i++){
			int dice = (int)(Math.random()*9); //0-8 = > 6,7,8
			//p[(dice>=6)?dice-3:dice]++;   //三元判斷式或使用以下之if else
			if(dice>=6){
				p[dice-3]++;
			}else{
				p[dice]++;
			}
			
		}
		for (int i=0; i<p.length; i++){
			System.out.println((i+1) + "點出現" + p[i] + "次");
		}
		
		
		
	}

}
