package tw.org.iii;

public class Brad30 {

	public static void main(String[] args) {
		Bike b1 = new Bike();  //因為有Bike 之class
		Bike b2 = new Bike();
		//Brad b2 = new Brad();  會編譯錯誤
		//System.out.println(b1);
		//System.out.println(b2);
		//double brad;
		//System.out.println(brad);   //編譯錯誤,因為沒有初始值
		System.out.println(b1.getSpeed());   //和陣列相同,因為在類別中宣告,已經具體存在
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		System.out.println(b1.getSpeed());  //因為初始值為0,所以speed乘以1.2還是為0
		
	}

}
