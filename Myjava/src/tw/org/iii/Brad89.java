package tw.org.iii;
//Thread-2
import java.util.ArrayList;
import java.util.Collection;

public class Brad89 {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread("A");   //3.�w�q��"A"
		MyThread mt2 = new MyThread("B");   //3.�w�q��"B"
		//mt1.run();//���F��{�X�S�x,��start,�_�h��L����u�O�@�몫��,�S���ͩR
		mt1.start();
		mt2.start();
		//mt1.start();   //�ͩR�u���@��,���o�����,�|�ߥX�ҥ~IllegalThreadStateException,�u��I�s�@��start,�Y�]run�h�ͩR�w����,���j���٦s�b
		
		try {  //��Hello,World���I�L�X,�Q��sleep,�i�b�D����������d
		Thread.sleep(1);  
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();    //���򱡪p�U�����������_?Ans:����,�ҥH���C�{�����ΰ�,�i�R��
		}
		
		System.out.println("Hello,World");  //�g�b�̫᭱.���O���L�X�ӤF(�bSystem.out.println("MyThread:" + i)�e)
		//�]��start���O���W�}�l,�O�i�J�{�����浥�԰�,��CPU�h�ƶ�����,��mt1.start()�令mt1.run�h�̵{�����ǰ���
		//�Q��Hello,World�j���b���ɭԦL�X,�Q��sleep,�i�b�D����������d
		
		//Collection a =new ArrayList<>();  //��@ArrayList�̪��F��,���h������{
		
		try {  
			Thread.sleep(20*1000);  //��20��԰���mt1.run,�A���F�Ѥ��{�����椧����
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();    //���򱡪p�U�����������_?Ans:����,�ҥH���C�{�����ΰ�,�i�R��
			}
		mt1.run();
	}
}

class MyThread extends Thread{  //�w�q�@�Ӱ���� //MyThread���@�ӥͩR�g������{,�]��extends Thread
	//�H�U���ͩR����{
	private String name;  //1.�w�qMyThread������@��,�i��X���椧�ɶ�����
	MyThread(String name){this.name= name;}   //2.�w�qMyThread()�W��
	@Override
	public void run() {  //���s�w�qMyThread�ͩR�w�q�F����
		for(int i=0; i<10; i++){
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(100);  //�]���H�W�{����,��ı0.1��,1000�N��1����,����k�|�ߥX�ҥ~,����X�ӷPı�P�ɰ���A��B,�Y�אּrun�h�S����k��{�X��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();    //���򱡪p�U�����������_?Ans:����,�ҥH���C�{�����ΰ�,�i�R��
			}  
		}
	}
}
