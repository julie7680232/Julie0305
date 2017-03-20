package tw.org.iii;

public class Friend1 {
	
	
	public static void main(String[] args) {
		int j=0;
		for(int i =1;i<=100;i++){
			for (int k=1;k<=i;k++){
				if(i%k==0){
					j++;}
		     }
				if(j==2){System.out.print(i+"*\t");
				}else
					System.out.print(i+"\t");
					j=0;			
					if(i%10==0){
				      System.out.println();
		             }

	}
		

}

}
