package tw.org.iii;
public class Brad36 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brad253 b1 = new Brad253();  //���椧����1.=>2.=>3.=>4.=>5.
}
class Brad251{
	//Brad251(){System.out.println("Brad251()");}
	Brad251(int a){System.out.println("Brad251(int)");}    //3.   //�]�����ۤv���غc��,���O�~��Object���غc��super���]�����ۤv���غc��
}
class Brad252 extends Brad251{    //�]���S���L�ǰѼƫغc��,Brad251�i�H���@�Ӱ����O��Brad252�W�[�s���غc��,���C�sĶ�~�|�L
	//�]���S���L�ǰѼƫغc��,Brad251�i�H���@�Ӱ����O��Brad252�W�[�s���غc���üW�[super��this,�_�h���C�sĶ���|�L
	Brad252(String a){   //���@�w���Ѽ�int a
		//super();
		super(2);             //�l���O�s�b,�D���O�@�w�s�b     //2.
		System.out.println("Brad252(String)");    //4.
	}
}
class Brad253 extends Brad252{
	Brad253(){
		super("brad");                   //1.
	System.out.println("Brad253()");    //5.
	}
}