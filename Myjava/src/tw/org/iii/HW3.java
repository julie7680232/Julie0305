package tw.org.iii;

public class HW3 {
	
	public static void main(String[] args) {
		int[] a ={0,1,2,3,4,5};
	/*	a[0]=0;
		a[1]=1;
		a[2]=2;
		a[3]=3;
		a[4]=4;
		a[5]=5;
		
		int temp = a[2];
		a[2] = a[5];
		a[5] = temp;
		
		int temp1 = a[3];
		a[3] = a[4];
		a[4] = temp1;
		
		int temp2 = a[0];
		a[0] = a[3];
		a[3] = temp2;
		
		int temp3 = a[1];
		a[1] = a[2];
		a[2] = temp3;
		
		int temp4 = a[5];
		a[5] = a[1];
		a[1] = temp4;
		
		int temp5= a[4];
		a[4] = a[0];
		a[0] = temp5;
	*/	
		boolean[] check = new boolean[6];  //0-5:false
		for(int i=0;i<6;i++){
			for(int j=5; j>=0 ; j--){
			a[i] = i;
			int temp1,b;
			do{
				temp1 = (int)(Math.random()*6);
				System.out.println("temp1=" + temp1);
			}while(check[temp1] == false); 
			b = temp1;
			check[temp1] = true;
			
			int temp2 = b;
			a[b] = a[j];
			a[j] =temp2;
			}
		}
		//for (int v: a){
		//	System.out.println(v);  
		//}
	}
}
