package tw.org.iii;

public class Brad45 {//

	public static void main(String[] args) {
		Brad421 b1 = new Brad422(); 
		//b2.m2   ,沒有繼承,編譯錯誤 
		Brad422 b2 = (Brad422)b1;      
		Brad421 b3 = new Brad423();  //藍寶傑尼
		Brad422 b4 = (Brad422)b3;    //藍寶傑尼變法拉利,編譯會過關,但執行會出現 ClassCastException,原因是轉型失敗,不能轉型
		Bike b5 = new Bike();
		Brad422 b6 = =(Brad422)b5;  //腳踏車沒有繼承關係,所以轉型不會過,編譯錯誤
		b2.m2();//換回本尊,強制轉型
	}

}

class Brad421{
	void m1(){System.out.println("Brad421:m1()");}
	}
class Brad422 extends Brad421{
	void m1(){System.out.println("Brad422:m1()");}
	void m2(){System.out.println("Brad422:m2()");}
}
class Brad423 extends Brad421{
	void m1(){System.out.println("Brad423:m1()");}
	void m2(){System.out.println("Brad423:m2()");}
}