package tw.org.iii;

public class Bike extends Object{//
	double speed;  //�s���׹��r,�ʸ˳t��,����ۤv�զۨ�w
	int a;           //a = 0 �A�����ݩ�
	static int b,counter;   //b = 0 
	
	Bike(){                      //�غc��
		//speed = 100;
//		System.out.println("Bike:Bike()v1");
		this (0);  //0�����,�ҥH�����10�C�h���� ,���Q�\�h�غc�����O�@�˪�sysout
	}
	Bike(int s){   
		//speed = s;
		this(s*1f);   //s*1f���B�I��,�ҥH�����15�C�h���� ,���Q�\�h�غc�����O�@�˪�sysout
		System.out.println("Bike:Bike()");
	}
	Bike(float s){   
		//speed = s;  //s*1.0��double,�ҥH�����15�C�h���� ,���Q�\�h�غc�����O�@�˪�sysout
		this(s*1.0);
//		System.out.println("Bike:Bike()v4");
	}
	Bike(double s){   
		speed = s;
		a++; b++; counter++;
//		System.out.println("Bike:Bike()v2");
	}
	void upSpeed(){          //���n�Ǧ^��,�]�m����,���O�ϥ�static
		speed = (speed<1)?1:(speed*1.2);          //�t�פp��1,�t����1,�_�h�t�׭��H1.2     //speed *= 1.2;
	}  
	void upSpeed(int gear){          
		speed = (speed<1)?1:(speed*(1.2+gear));      
	} 
	void downSpeed(){               
		speed *=0.7;
	}
	double getSpeed(){    //�Q���D�t��,�ۤv�ˤW�X��,�Y�i���D�t��
		return speed;
	} 

}
