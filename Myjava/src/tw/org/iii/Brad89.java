package tw.org.iii;
//Thread-1(start.run)
import java.util.ArrayList;
import java.util.Collection;

public class Brad89 {
	public static void main(String[] args) {
		MyThreadone mt1 = new MyThreadone();
		MyThreadone mt2 = new MyThreadone();
//		mt1.run();
//		mt1.start(); //mt1.start(); �ͩR�u���@��,������|�ߥX�ҥ~IllegalThreadStateException,�u��I�s�@��start
//		mt1.run();  //start�����w�����ͩR�S�x,����ٷ|��run(),�]�����M�ͩR�w����,���٦��j��,�����k���i�H�I�s,�٬O�s�b

		mt1.start();
		mt2.start();//���F��{�X�S�x,��start,�_�h��run�Ψ�L����u�O�@�몫���k,�S���ͩR
	
		System.out.println("Hello,World");  //�g�b�̫᭱.���O���L�X�ӤF(�bSystem.out.println("MyThread:" + i)�e)
		//�]��start���O���W�}�l,�O�i�J�{�����浥�԰�,��CPU�h�ƶ�����,��mt1.start()�令mt1.run�h�̵{�����ǰ���,����run()�u�O�@�몫���k,�S���ͩR
		
		//Collection a =new ArrayList<>();  //��@ArrayList�̪��F��,���h������{
		//����Collection�ݾa��@�����OArrayList����a,�Ҧpjava�{�Ҥu�{�v��collection,�֦ҹLjava�{�Ҥu�{�v,�N�O�H,�H�N�O�o�̪�ArrayList
	}
}

class MyThreadone extends Thread{  //�w�q�@�Ӱ���� //MyThread���@�ӥͩR�g������{,�]��extends Thread
	//�H�U���ͩR����{
	@Override
	public void run() {  //���s�w�qMyThread�ͩR��{�F����
		for(int i=0; i<10; i++){
			System.out.println("MyThread:" + i);
		}
	}  //�ͩR��{��o�Ӧa��,�Ϊ�return��,��إs���زץ���,�bjava���ɶq�קK���D�زץ���,���������y
}
