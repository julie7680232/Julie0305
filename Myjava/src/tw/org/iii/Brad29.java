package tw.org.iii;
//����ɦV(Bike)
public class Brad29 {

	public static void main(String[] args) {
		Bike1 b1 = new Bike1();    
		//Brada b2 = new Brada();     //�S���ŧi��class
		Bike1 b2 = new Bike1();
		System.out.println(b1);    //�|�L�Xtw.org.iii.Bike@15db9742,�Y����IP��}
		System.out.println(b2);    //�|�L�Xtw.org.iii.Bike@6d06d69c,�Y����IP��}
		                           //b1��b2���|�ۦP,IP��}���P
		//double julie;
		//System.out.println(julie);  
		//������]:�S�����,���󫬧O�nnew�X�Ӥ~�i�H,���{�l���٦���L����,���p�G��new�N��w�g����s�b,�w�g����,�M�}�C�@��,�򥻫��O�@�w�n�����
		System.out.println(b1.speed);  //����ᬰ0,0
		b1.upSpeed();   //�t�׬�1
		b1.upSpeed();   //�t�׬�1*1.2=1.2
		b1.upSpeed();   //�t�׬�1.2*1.2=1.44
		b1.upSpeed();   //�t�׬�1.44*1.2=1.728
		b1.upSpeed = 10 ;
		System.out.println(b1.speed);    
		//�Yspeed�w�q��private,��15,20,21�C�|�sĶ���~,���D�ˤ@�ӽX��getSpeed(),�ñN��15,21�C��b1.speed�令b1.getSpeed(),�R����20�C,�Y�i�sĶ���\
	

	}

}
