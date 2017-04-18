package tw.org.iii;
//Thread-2(start.run.sleep)
//�����������:�H���Ȭ��ɦV,�������D�n��h�[�ɶ�,�����|�q���A,���}�|������
import java.util.ArrayList;
import java.util.Collection;

public class Brad90 {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread("A");   //3.�w�q��"A"
		MyThread mt2 = new MyThread("B");   //3.�w�q��"B"
	
		mt1.start();   //�Y�令mt1.run(),��sleep,�N�S���Pı�F,�u�O�@�몺�����k,�u�|���Ӷ��ǦL�X
		mt2.start();   //�Y�令mt2.run(),��sleep,�N�S���Pı�F,�u�O�@�몺�����k,�u�|���Ӷ��ǦL�X
		//mt1.start();   //�ͩR�u���@��,���o�����,�|�ߥX�ҥ~IllegalThreadStateException,�u��I�s�@��start,�Y�]run�h�ͩR�w����,���j���٦s�b
		
		try {  //��Hello,World���I�L�X,�Q��sleep,�i�b�D����������d
			Thread.sleep(400);   //��ı����ä��O���W����,�u�O�h�ƶ����԰���,�ο��A�h�ƶ�
		} catch (InterruptedException e) {
			e.printStackTrace();    //���򱡪p�U�����������_?Ans:����,�ҥH���C�{�����ΰ�,�i�R��
		}
		
		System.out.println("Hello,World");  //�g�b�̫᭱.���O���L�X�ӤF(�bSystem.out.println("MyThread:" + i)�e)
		//�]��start���O���W�}�l,�O�i�J�{�����浥�԰�,��CPU�h�ƶ�����,��mt1.start()�令mt1.run�h�̵{�����ǰ���
		//�Q��Hello,World�j���b���ɭԦL�X,�Q��sleep,�i�b�D����������d
		
		try {  
			Thread.sleep(20*1000);  //��20��԰���mt1.run,�A���F�Ѥ��{�����椧����
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();    //���򱡪p�U�����������_?Ans:����,�ҥH���C�{�����ΰ�,�i�R��
			}
		mt1.run();  //�����k���M�s�b
	}
}

class MyThread extends Thread{  //�w�q�@�Ӱ���� ,MyThread���@�ӥͩR�g������{,�]��extends Thread
	//�H�U���ͩR����{
	private String name;  //1.�w�qMyThread������@��,�i��X���椧�ɶ�����
	MyThread(String name){this.name= name;}   //2.�w�qMyThread()�W��
	@Override
	public void run() {  //���s�w�qMyThread�ͩR��{�F����
		for(int i=0; i<10; i++){
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(100);  
				//�]���H�W�{����,��ı0.1��,1000�N��1����,����k�|�ߥX�ҥ~,����X�ӷPı�P�ɰ���A��B,A��B�ɶ����j�q�`�j��ε���0.1��,���|�p��0.1��,�Y�אּrun�h�S����k��{�X��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();    //���򱡪p�U�����������_?Ans:����,�ҥH���C�{�����ΰ�,�i�R��
			}  
		}  
		//this = null;  //�ͩR����̫� ,�[���O�o��,��ڤW���O�g�b�o,��mt1����null,�h�ͩR����̫�
	}   //�ͩR��{��o�Ӧa��,�Ϊ�return��,��إs���زץ���,�bjava���ɶq�קK���D�زץ���,���������y
}
