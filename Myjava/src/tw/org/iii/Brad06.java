package tw.org.iii;

public class Brad06 {//

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		final int b = 10;
		switch(a){
		
		  case 1:
			  System.out.println("A");
			  break;
		  case b-2:
			  System.out.println("B"); //case �������ܼƥu��O�`��;���wfinal int b=0�~�i�H;����case b�令b-2�]�i�H
			  break; //�Y�S��break;�h�|����XB��C;��case100�~break
		  case 100:
			  System.out.println("C");
			  break;
		  default:
			  System.out.println("D");
			  break;
			
		}
		
		
		
	}

}
