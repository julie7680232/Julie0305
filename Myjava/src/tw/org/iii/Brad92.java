package tw.org.iii;
//������\��(setDaemon):Daemon�N�䬰�c�],������ݤ���,�I�����B�@���{��(�I���������),�Y��D�Ǧb��,�D�ǵ���,���]��۵���
public class Brad92 {

	public static void main(String[] args) {
		Brad771 obj1 = new Brad771();
		obj1.setDaemon(true);     //�Q�n�L�XOK�N����,���g���C�i�H
		//Daemon�N�䬰�c�],������ݤ���,�I�����B�@���{��(�I���������),�Y��D������b��,�D���������,���]��۵���
		obj1.start();
		try {
			Thread.sleep(400);      //sleep�ɶ���ǫפ���,���౱��P������,�i�H��class Timer
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("OK");   
		//return;   //�Q�n�L�XOK�N����,���g���C�S��k,�ҥH�i�H�R��

	}

}
class Brad771 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10;i++){
			System.out.println(i);
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				
			}
		}
	}
}
