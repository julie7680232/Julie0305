package tw.org.iii;
//��2�ت�{�X�ͩR�S�x,�����O�����(Thread),�B��implements Runnable(��{�ͩR�S�x)
//�u��extends Thread�~�O�����,�bjava���S����2�ۤF
public class Brad91 {

	public static void main(String[] args) {
		Thread2 t2 = new Thread2("A");  //t2���O�����
		Thread tt2 = new Thread(t2);
		
		Thread2 t3 = new Thread2("B");  //t3���O�����
		Thread tt3 = new Thread(t3);
		tt2.start();
		tt3.start();
	}
//class Thread1 extends Thread{  //�u��extends Thread�~�O�����,�bjava���S����2�ۤF
//	@Override
//	public void run() {
//		for(int i=0; i<10;i++){
//			System.out.println(i);
//		}
//	}
//}
class Thread2 implements Runnable{   //���u�ʤ�Brad89�٤j,�]���~�ӥu���~�Ӥ@��,Thread2�u����@,�٨S���~��
	String name;
	Thread2(String name){this.name = name;}
	@Override
	public void run() {
		for(int i=0; i<10;i++){
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
}
