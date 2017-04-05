package tw.org.iii;
//物件導向(Bike)
public class Brad29 {

	public static void main(String[] args) {
		Bike1 b1 = new Bike1();    
		//Brada b2 = new Brada();     //沒有宣告此class
		Bike1 b2 = new Bike1();
		System.out.println(b1);    //會印出tw.org.iii.Bike@15db9742,即它的IP位址
		System.out.println(b2);    //會印出tw.org.iii.Bike@6d06d69c,即它的IP位址
		                           //b1及b2不會相同,IP位址不同
		//double julie;
		//System.out.println(julie);  
		//報錯原因:沒有初值,物件型別要new出來才可以,指肚子裡還有其他物件,但如果有new代表已經具體存在,已經有值,和陣列一樣,基本型別一定要有初值
		System.out.println(b1.speed);  //執行後為0,0
		b1.upSpeed();   //速度為1
		b1.upSpeed();   //速度為1*1.2=1.2
		b1.upSpeed();   //速度為1.2*1.2=1.44
		b1.upSpeed();   //速度為1.44*1.2=1.728
		b1.upSpeed = 10 ;
		System.out.println(b1.speed);    
		//若speed定義為private,第15,20,21列會編譯錯誤,除非裝一個碼表getSpeed(),並將第15,21列的b1.speed改成b1.getSpeed(),刪除第20列,即可編譯成功
	

	}

}
