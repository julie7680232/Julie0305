package tw.org.iii;
//Thread-1
import java.util.ArrayList;
import java.util.Collection;

public class Brad90 {
	public static void main(String[] args) {
		MyThreadone mt1 = new MyThreadone();
		MyThreadone mt2 = new MyThreadone();
		mt1.start();//mt1.start();   //�ͩR�u���@��,���o�����,�|�ߥX�ҥ~IllegalThreadStateException,�u��I�s�@��start
		mt2.start();//���F��{�X�S�x,��start,�_�h��L����u�O�@�몫��,�S���ͩR
	
		System.out.println("Hello,World");  //�g�b�̫᭱.���O���L�X�ӤF(�bSystem.out.println("MyThread:" + i)�e)
		//�]��start���O���W�}�l,�O�i�J�{�����浥�԰�,��CPU�h�ƶ�����,��mt1.start()�令mt1.run�h�̵{�����ǰ���
		
		//Collection a =new ArrayList<>();  //��@ArrayList�̪��F��,���h������{
	}
}

class MyThreadone extends Thread{  //�w�q�@�Ӱ���� //MyThread���@�ӥͩR�g������{,�]��extends Thread
	//�H�U���ͩR����{
	@Override
	public void run() {  //���s�w�qMyThread�ͩR�w�q�F����
		for(int i=0; i<10; i++){
			System.out.println("MyThread:" + i);
		}
	}
}
