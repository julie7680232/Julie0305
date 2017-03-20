package tw.org.iii;

public class Brad10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int result;
		for(int j=1;j<=9;j++){
			for(int i = 2 ; i<=5; i++){
			    result=i*j;
				System.out.print(i+" X " + j + " = "+result+"\t");	
				}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------------------------");
		
		for(int j=1;j<=9;j++){
			for(int i = 6 ; i<=9; i++){
			    result=i*j;
				System.out.print(i+" X " + j + " = "+result+"\t");	
				}
			System.out.println();
		}
		
		
		
	}

}
