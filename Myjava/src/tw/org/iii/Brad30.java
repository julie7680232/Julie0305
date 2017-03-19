package tw.org.iii;

public class Brad30 {//

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Bike.counter);  //此時沒有任何腳踏車,為0
		Bike b1 = new Bike();  //因為有Bike 之class
		//new Bike();
		
		System.out.println(Bike.counter);    
		//System.out.println(b1.b);    //b1.a=1 ;b1.b=2 ;b不屬於任何物件,只是屬於該static類別 等於Math.PI
		Bike b2 = new Bike();//Bike()建構式:物件初始化,知道它的特性,建構值,只會被呼叫一次,
		System.out.println(Bike.counter);
		//Brad b2 = new Brad();  會編譯錯誤
		
	//	System.out.println(b2.b);    //b2.a=1 ;b2.b=2
		System.out.println("----------------------------------------------");
		//double brad;
		//System.out.println(brad);   //編譯錯誤,因為沒有初始值
		System.out.println(b1.getSpeed());   //和陣列相同,因為在類別中宣告,已經具體存在
		System.out.println(b2.getSpeed());
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		System.out.println(b1.getSpeed());
		
		b2.upSpeed();
		System.out.println("1. " + b2.getSpeed());
		b2.upSpeed();
		System.out.println("2. " + b2.getSpeed());
		b2.upSpeed(1);                    //1.2*2.2=2.64  
		System.out.println("3. " + b2.getSpeed());
		b2.upSpeed(2);                     //2.64*3.2=8.448
		System.out.println("4. " + b2.getSpeed());
	//	System.out.println(b1.getSpeed());
	//	System.out.println(b2.getSpeed());  //因為初始值為0,所以speed乘以1.2還是為0
		
	}

}
