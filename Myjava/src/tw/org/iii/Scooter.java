package tw.org.iii;

public class Scooter extends Bike{  //Bike為Scooter之爸爸
       //沒有定義建構式,編譯時期,系統直接拿其副類別,拿爸爸的建構式為無船建構式         //Bike之爸爸為extends Object,沒有寫皆是Object
	Scooter(){
		//super();
		System.out.println("Scooter()");
	}
	void upSpeed(){
		super.upSpeed(); //先把爸爸的做完再去做強化功能,這才是繼承觀念
		speed = (speed<1)?1.5:(speed*3.2);   //因為speed屬性只有Bike可以用,因為封裝起來,除非private拿掉,已拿掉,故編譯成功
		//System.out.println("Sooter:upSpeed");
		//已取代Bike之void upSpeed(){          speed = (speed<1)?1:(speed*1.2);},所以有2招加速度
		
		
		
		
	}
	
	
}
