package tw.org.iii;

public class HW2 {//

	public static void main(String[] args) {
		
		int i,j,k,g;
		
		for(i=2;i<=100;i++){ 
			Julie:
			for(j=2;j<i;j++){
				
				k = i % j;

				if(k == 0){
				//System.out.println("i = "+ i + " , j = " + j + " ; " + i + "非質數");
				break Julie;
				}
				else{
					continue Julie;	
					
					g=i-j;
					
					if(g == 1){
						if(k == 0){
							System.out.println("i = "+ i + " , j = " + j + " ; " + i + "非質數");
						}else{
							System.out.println("i = "+ i + " , j = " + j + " ; " + i + "質數");
						}
							
					}
				}
			}
		}

	
		
		
		
		

	}

}
