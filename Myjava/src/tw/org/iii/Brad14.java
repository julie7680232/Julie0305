package tw.org.iii;

public class Brad14 {

	public static void main(String[] args) {
		
		
	//	for(int i=1; i<=10; i++){
	//		int dice = (int)(Math.random()*6+1);
			System.out.println(dice);
	//	}
		
	//	System.out.println("--------------------------------------------------------");
		
		int p1,p2,p3,p4,p5,p6;
		p1=p2=p3=p4=p5=p5=p6=0;
		for(int i=0; i<10; i++){
			int dice = (int)(Math.random()*6+1);  //1-6
			switch(dice){
			case 1:p1++;break;
			case 2:p2++;break;
			case 3:p3++;break;
			case 4:p4++;break;
			case 5:p5++;break;
			case 6:p6++;break;
			default:System.out.println("XXX"); break;
			}
			
			System.out.println("1�I�X�{"+p1+"��");
			System.out.println("2�I�X�{"+p2+"��");
			System.out.println("3�I�X�{"+p3+"��");
			System.out.println("4�I�X�{"+p4+"��");
			System.out.println("5�I�X�{"+p5+"��");
			System.out.println("6�I�X�{"+p6+"��");
			
		}
		
		
	}

}
