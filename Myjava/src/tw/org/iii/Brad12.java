package tw.org.iii;

public class Brad12 {

	public static void main(String[] args) {
		for(int i=1,j=10; i<10; i++,j--){
			System.out.println(i + ":" +j);
			if(j==7){
				break;
			}
		}
		
		System.out.println("--------------------------------");
		
		for (int i=0; i<10; i++){
			if (i%2==0) continue; //i=2則不會印出i,直接執行i=3(i++)
			System.out.println(i);
		}
		
		
		System.out.println("--------------------------------");
		
		Julie:   //標記此迴圈
		for (int i=0; i<10;i++){
			for(int j=9; j>0; j--){
				System.out.println(i+":"+j);
				if (j%5==0)  break Julie;   //中斷至哪個地方(Julie之迴圈)     若break變continue
				continue;                  //因為System.out.println("OK");永遠執行不到,故執行編藝會錯誤
				System.out.println("OK");
			}
		}
		
		
		
	}

}
