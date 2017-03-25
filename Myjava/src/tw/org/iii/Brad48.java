package tw.org.iii;

public class Brad48 {
	public static void main(String[] args) {	
		Bird b1 = new Bird();
		int n = 2;
		try {
			b1.setLeg(n);
	//	}catch(MyException ee){
	//		System.out.println(ee.toString());
	//	}catch(MyException2 ee){
	//		System.out.println(ee.toString());
		}catch(Exception ee){    //一定要宣告,因為你丟Exception
			
		}
		System.out.println("End");
	}
}
class Bird{
	private int leg;
	//void setLeg(int n) throws MyException,MyException2{
		
	void setLeg(int n) throws Exception{  //可能丟多個throws//須於執行框內處理,使用try{} catch(){}
		if(n>2){
			//leg = 2;  //東西做死,直接訂腳為2,此為預設值
			throw new Exception2();  //拋出新的例外,拋一個例外,故沒以加上s   
			System.out.println("");//此列不會執行到,考試會考
		}else if(n<0){
			throw new Exception();
		}
		leg = n;
	}
}

class MyException extends Exception{
	
	@Override
	public String toString() {
		return 變種鳥嗎??;
		
	}
}
class MyException2 extends Exception{
	@Override
	public String toString() {
		return 不是鳥嗎??;
	}
}
