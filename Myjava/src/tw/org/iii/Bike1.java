package tw.org.iii;

public class Bike1 {
	private double speed; //�w�q��private(�p����),�N���u���b�o��~��s����
	void upSpeed(){    //�����k�����Ǧ^��,���Q���Ǧ^�ȥ� void
		speed = (speed<1)?1:(speed*1.2);          //�t�פp��1,�t����1,�_�h�t�׭��H1.2
	} 
	void downSpeed(){ //�ʵ��Τ��Y���p�g,���ܳt���ݩʭ��r�j�g,�o���O�W�w,�O�D��
		speed *=0.7;
	}
	double getSpeed(){   //�˳]�@�ӽX��,���A���D�t��,�i�O�A�S��k�ק�t�פ����e
		return speed;
	}
	
}
