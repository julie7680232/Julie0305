package tw.org.iii;

public class Bike1 {
	private double speed; //定義為private(私有的),意指只有在這邊才能存取它
	void upSpeed(){    //任何方法都有傳回值,不想有傳回值用 void
		speed = (speed<1)?1:(speed*1.2);          //速度小於1,速度變1,否則速度乘以1.2
	} 
	void downSpeed(){ //動詞或介係詞小寫,改變速度屬性首字大寫,這不是規定,是慣例
		speed *=0.7;
	}
	double getSpeed(){   //裝設一個碼表,讓你知道速度,可是你沒辦法修改速度之內容
		return speed;
	}
	
}
