package tw.org.iii;

public class Brad30 {//

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Bike.counter);  //���ɨS������}��,��0
		Bike b1 = new Bike();  //�]����Bike ��class
		//new Bike();
		
		System.out.println(Bike.counter);    
		//System.out.println(b1.b);    //b1.a=1 ;b1.b=2 ;b���ݩ���󪫥�,�u�O�ݩ��static���O ����Math.PI
		Bike b2 = new Bike();//Bike()�غc��:�����l��,���D�����S��,�غc��,�u�|�Q�I�s�@��,
		System.out.println(Bike.counter);
		//Brad b2 = new Brad();  �|�sĶ���~
		
	//	System.out.println(b2.b);    //b2.a=1 ;b2.b=2
		System.out.println("----------------------------------------------");
		//double brad;
		//System.out.println(brad);   //�sĶ���~,�]���S����l��
		System.out.println(b1.getSpeed());   //�M�}�C�ۦP,�]���b���O���ŧi,�w�g����s�b
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
	//	System.out.println(b2.getSpeed());  //�]����l�Ȭ�0,�ҥHspeed���H1.2�٬O��0
		
	}

}
