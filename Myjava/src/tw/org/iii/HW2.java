package tw.org.iii;

public class HW2 {
	public static void main(String[] args) {
		int i,j;
		System.out.println( "1~100��ƳW�h:�Y����ƼаO#,�D��Ƥ��аO");
		for(i=1;i<=100;i++){ 
			int k=0;
			for(j=1;j<=i;j++){
				if( i % j == 0){
					k++;
					}
			}
			if(k==2){
				System.out.print( i+"#\t");
				}
			else{
				System.out.print( i+"\t");
				}
			if(i%10==0){
				System.out.println();
				}
		
		}
	}
}
