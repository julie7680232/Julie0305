package tw.org.iii;
//Exception 例外    有時是故意建立的
public class Brad47 {

	public static void main(String[] args) {
		int a = 10 ,b = 3;
		int[] c ={1,2,3,4};
		try{
			System.out.println(a/b);  //若程式中斷(例如b改0),不會印出第8列  
			try{
				System.out.println(c[4]);
			}catch(Exception ee){	
			}
			System.out.println("OK");
		}catch(ArithmeticException ae){
			System.out.println("87");               //若try沒有執行a/b,則執行此列
	//	}catch(ArrayIndexOutOfBoundsException ee){
	//		System.out.println("XX");               //catch{}誰先誰後沒有影響	
		}catch(RuntimeException re){//廣域方式去註解 ,要注意捕捉catch的順序,有繼承關係,順序由細到大捕捉之內容是否在廣域之註解裡,沒有直系血緣的話不用注意順序性
			System.out.println("OK");
		}
		System.out.println("Hello,World");
	}
}
