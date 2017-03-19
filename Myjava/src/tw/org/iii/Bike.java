package tw.org.iii;

public class Bike extends Object{//
	double speed;  //存取修飾字,封裝速度,不能自己擅自制定
	int a;           //a = 0 ，物件屬性
	static int b,counter;   //b = 0 
	
	Bike(){                      //建構式
		//speed = 100;
//		System.out.println("Bike:Bike()v1");
		this (0);  //0為整數,所以跳到第10列去執行 ,不想許多建構式都是一樣的sysout
	}
	Bike(int s){   
		//speed = s;
		this(s*1f);   //s*1f為浮點數,所以跳到第15列去執行 ,不想許多建構式都是一樣的sysout
		System.out.println("Bike:Bike()");
	}
	Bike(float s){   
		//speed = s;  //s*1.0為double,所以跳到第15列去執行 ,不想許多建構式都是一樣的sysout
		this(s*1.0);
//		System.out.println("Bike:Bike()v4");
	}
	Bike(double s){   
		speed = s;
		a++; b++; counter++;
//		System.out.println("Bike:Bike()v2");
	}
	void upSpeed(){          //不要傳回值,設置物件,不是使用static
		speed = (speed<1)?1:(speed*1.2);          //速度小於1,速度變1,否則速度乘以1.2     //speed *= 1.2;
	}  
	void upSpeed(int gear){          
		speed = (speed<1)?1:(speed*(1.2+gear));      
	} 
	void downSpeed(){               
		speed *=0.7;
	}
	double getSpeed(){    //想知道速度,自己裝上碼表,即可知道速度
		return speed;
	} 

}
