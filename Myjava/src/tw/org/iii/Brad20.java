package tw.org.iii;

public class Brad20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =20;
		do{
			System.out.println(a--);	//1.先執行a=20; 2.執行a--後,a=19; 3.判斷while的布林值,若是true再重新執行do之內容	
		}while (a>10);                 
		
	}

}
