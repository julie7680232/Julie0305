package tw.org.iii;

public class Scooter extends Bike{  //Bike��Scooter������
       //�S���w�q�غc��,�sĶ�ɴ�,�t�Ϊ�����������O,���������غc�����L��غc��         //Bike��������extends Object,�S���g�ҬOObject
	Scooter(){
		//super();
		System.out.println("Scooter()");
	}
	void upSpeed(){
		super.upSpeed(); //���⪨���������A�h���j�ƥ\��,�o�~�O�~���[��
		speed = (speed<1)?1.5:(speed*3.2);   //�]��speed�ݩʥu��Bike�i�H��,�]���ʸ˰_��,���Dprivate����,�w����,�G�sĶ���\
		//System.out.println("Sooter:upSpeed");
		//�w���NBike��void upSpeed(){          speed = (speed<1)?1:(speed*1.2);},�ҥH��2�ۥ[�t��
		
		
		
		
	}
	
	
}
