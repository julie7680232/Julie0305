package tw.org.iii;

public class Bike {
	private double speed;  //封裝速度,不能自己擅自制定
	void upSpeed(){          //不要傳回值,設置物件,不是使用static
		speed = (speed<1)?1:(speed*1.2);          //速度小於1,速度變1,否則速度乘以1.2     //speed *= 1.2;
	}  
	void downSpeed(){               
		speed *=0.7;
	}
	double getSpeed(){    //想知道速度,自己裝上碼表,即可知道速度
		return speed;
	} 

}
