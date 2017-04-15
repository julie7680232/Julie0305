package tw.org.iii;
//第2種表現出生命特徵,但不是執行緒(Thread),運用implements Runnable(表現生命特徵)
//只有extends Thread才是執行緒,在java中沒有第2招了
public class Brad91 {

	public static void main(String[] args) {
		Thread2 t2 = new Thread2("A");  //t2不是執行緒
		Thread tt2 = new Thread(t2);
		
		Thread2 t3 = new Thread2("B");  //t3不是執行緒
		Thread tt3 = new Thread(t3);
		tt2.start();
		tt3.start();
	}
//class Thread1 extends Thread{  //只有extends Thread才是執行緒,在java中沒有第2招了
//	@Override
//	public void run() {
//		for(int i=0; i<10;i++){
//			System.out.println(i);
//		}
//	}
//}
class Thread2 implements Runnable{   //此彈性比Brad89還大,因為繼承只能繼承一個,Thread2只有實作,還沒有繼承
	String name;
	Thread2(String name){this.name = name;}
	@Override
	public void run() {
		for(int i=0; i<10;i++){
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(100);  //跑完以上程式後,睡覺0.1秒,1000代表1秒鐘,此方法會拋出例外,執行出來感覺同時執行A及B,若改為run則沒有辦法表現出來
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();    //什麼情況下能讓提早中斷?Ans:關機,所以此列程式不用做,可刪除
			}  
		}
	}
}
}
