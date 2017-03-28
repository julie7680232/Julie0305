package tw.org.iii;

public class Brad46 {

	public static void main(String[] args) {
		Brad431 obj1 = new Brad431();
		//Brad431.Brad4311 obj2 = obj1.new Brad4311();  //物件級別的內部類別
		//obj2.m1();             //常利用static內部類別做出外部的物件實體
		Brad431.m3();            
		//Brad431.Brad4312 obj3 = new Brad431.Brad4312();   //不需要外部的(431)的物件,直接運用static作出類別級別的物件實體
		                                                    //內部類別做出外部類別
	}     //static有內部類別,沒有外部類別

}
class Brad431{
	Brad431(){System.out.println("Brad431()");}
	void m1(){System.out.println("Brad431:m1()");}
	void m2(){System.out.println("Brad431:m2()");}
	static void m3(){System.out.println("Brad431:m3()");}  //若需要呼叫m3,不需要物件實體,即可呼叫
	class Brad4311{
		Brad4311(){System.out.println("Brad4311()");}
		void m1(){
			System.out.println("Brad4311:m1()");
			//m2();
			Brad431.this.m1();  //若m2()改成m1()會跑第18列,一直跑步會停,須改成Brad431.this.m1();
		}
	}
	static class Brad4312{     //static中沒有物件存在,所以this須刪除
		Brad4312(){System.out.println("Brad4312()");}
		void m1(){
			System.out.println("Brad4312:m1()");
		}
	}
}

