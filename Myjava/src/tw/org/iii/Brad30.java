package tw.org.iii;

public class Brad30 {

	public static void main(String[] args) {
		Bike b1 = new Bike();  //�]����Bike ��class
		Bike b2 = new Bike();
		//Brad b2 = new Brad();  �|�sĶ���~
		//System.out.println(b1);
		//System.out.println(b2);
		//double brad;
		//System.out.println(brad);   //�sĶ���~,�]���S����l��
		System.out.println(b1.getSpeed());   //�M�}�C�ۦP,�]���b���O���ŧi,�w�g����s�b
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		System.out.println(b1.getSpeed());  //�]����l�Ȭ�0,�ҥHspeed���H1.2�٬O��0
		
	}

}
