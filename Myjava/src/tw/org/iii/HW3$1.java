package tw.org.iii;

public class HW3$1 {
	
	public static void main(String[] args) {
		
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
		int[] a ={0,1,2,3,4,5};
		boolean[] check = new boolean[6];
		int temp1;
		int[] b= new int[6];
		for(int i=0;i<6;i++){
			temp1 = (int)(Math.random()*6);
				if(check[temp1]){
				   i--;            //代表重複了
				}else{
					b[i] = temp1;
					check[temp1] = true;
					System.out.println(b[i]);
					}
				
		}
		/*
		int temp2 = b[i];
		System.out.println("temp2=" + temp2); 
			for(int j=5; j>=0 ; j--){
				a[b[i]] = a[j];
				a[j] = temp2;
		}
		*/
		
	}
}
