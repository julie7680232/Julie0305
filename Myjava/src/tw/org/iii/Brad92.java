package tw.org.iii;
//執行緒功能(setDaemon):Daemon意思為惡魔,執行緒看不到,背景中運作的程序(背景的執行緒),即跟主序在走,主序結束,它也跟著結束
public class Brad92 {

	public static void main(String[] args) {
		Brad771 obj1 = new Brad771();
		obj1.setDaemon(true);     //想要印出OK就結束,但寫此列可以
		//Daemon意思為惡魔,執行緒看不到,背景中運作的程序(背景的執行緒),即跟主執行緒在走,主執行緒結束,它也跟著結束
		obj1.start();
		try {
			Thread.sleep(400);      //sleep時間精準度不高,不能控制周期任務,可以用class Timer
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("OK");   
		//return;   //想要印出OK就結束,但寫此列沒辦法,所以可以刪除

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
