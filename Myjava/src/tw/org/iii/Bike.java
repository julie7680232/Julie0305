package tw.org.iii;

public class Bike {
	private double speed;  //�ʸ˳t��,����ۤv�զۨ�w
	void upSpeed(){          //���n�Ǧ^��,�]�m����,���O�ϥ�static
		speed = (speed<1)?1:(speed*1.2);          //�t�פp��1,�t����1,�_�h�t�׭��H1.2     //speed *= 1.2;
	}  
	void downSpeed(){               
		speed *=0.7;
	}
	double getSpeed(){    //�Q���D�t��,�ۤv�ˤW�X��,�Y�i���D�t��
		return speed;
	} 

}
