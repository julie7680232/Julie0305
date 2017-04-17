package tw.org.iii;
//set
import java.util.HashSet;
import java.util.Iterator;
//import javax.swing.text.html.HTMLDocument.Iterator;

//實作collection
public class Brad83 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
//		Brad711 obj = new Brad712();       //釐清觀念1
//		obj.m1();  //因為Brad711有m1  
//		//obj.m2();  //因為Brad711沒有m2
		
		
//		Object obj2 = new Object();                    //釐清觀念2
//		System.out.println(obj2);  //會印出記憶體位址
//		System.out.println((int)obj2);  //編譯會過,但Run會轉型失敗=>RunTimeException
		
		
		int i1 = 12;
		//Object obj1 = (Object) i1;  //=>i1會被auto-boxing           
		//Object obj1 = i1;   //=>auto-boxing
		
		Integer i2 = new Integer(34); 
		set.add(i2);
		set.add(i1); //i1 =>auto-boxing => new Integer(i) ;因為Integer有Override toString
		System.out.println(set.size());   //印出2
		System.out.println(set);
		System.out.println("--------------------------------");
//      //方法1:(早期作法)		
//		Iterator it = set.iterator();  //準備取出set之東西   //擁有迭代物件實體,不是new
//		while (it.hasNext()){  //有沒有下一個,回傳true或false
//			Object obj = it.next();   //拿出下一個元素給我
//			Integer i = (Integer)obj;  //物件強制轉型給我,obj是物件的元素,打回原型整數
//			System.out.println(i.floatValue());  //證明i是物件,會印出34及12
//		}
		//方法2:(現在作法)
		//is a Collection => for-each
		for(Object obj :set){                  //與while的迴圈作的內容是一樣的,有兩種方法
			System.out.println((Integer)obj);   // obj強制轉型為整數,但仍為物件
			//System.out.println(obj);    //不強制轉型也可以是因為有toString ,實作是Integer(整數),否則會印出記憶體位址
			//System.out.println((int)obj);   //第18.19列不行,但這裡可以,因為已經auto-boxing,不是toString,印出數字,不是toString,拆箱出來
			//System.out.println((float)obj); //obj =>Integer =>int =>float沒有做到float,只做到int,只做一次性轉換
			//上列如果int放Boolean及float會轉型失敗,float因為Integer不是父子關係,是兄弟 
			//obj是整數物件被auto-boxing
		}
		
	}
}
class Brad711{
	void m1(){System.out.println("Brad711:m1()");}
}
class Brad712 extends Brad711{
	void m2(){System.out.println("Brad712:m2()");}
}