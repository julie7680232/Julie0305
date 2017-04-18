package tw.org.iii;
//Thread-2(start.run.sleep)
//執行緒的應用:以任務為導向,但不知道要花多久時間,完成會通知你,分開會做的事
import java.util.ArrayList;
import java.util.Collection;

public class Brad90 {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread("A");   //3.定義為"A"
		MyThread mt2 = new MyThread("B");   //3.定義為"B"
	
		mt1.start();   //若改成mt1.run(),用sleep,就沒有感覺了,只是一般的物件方法,只會按照順序印出
		mt2.start();   //若改成mt2.run(),用sleep,就沒有感覺了,只是一般的物件方法,只會按照順序印出
		//mt1.start();   //生命只有一條,但這有兩條,會拋出例外IllegalThreadStateException,只能呼叫一次start,若跑run則生命已結束,但大體還存在
		
		try {  //讓Hello,World晚點印出,利用sleep,可在主執行緒之停留
			Thread.sleep(400);   //睡覺完後並不是馬上執行,只是去排隊等候執行,睡醒再去排隊
		} catch (InterruptedException e) {
			e.printStackTrace();    //什麼情況下能讓提早中斷?Ans:關機,所以此列程式不用做,可刪除
		}
		
		System.out.println("Hello,World");  //寫在最後面.但是先印出來了(在System.out.println("MyThread:" + i)前)
		//因為start不是馬上開始,是進入程式執行等候區,由CPU去排隊執行,但mt1.start()改成mt1.run則依程式順序執行
		//想讓Hello,World大約在哪時候印出,利用sleep,可在主執行緒之停留
		
		try {  
			Thread.sleep(20*1000);  //休息20秒候執行mt1.run,再次了解之程式執行之順序
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();    //什麼情況下能讓提早中斷?Ans:關機,所以此列程式不用做,可刪除
			}
		mt1.run();  //物件方法仍然存在
	}
}

class MyThread extends Thread{  //定義一個執行緒 ,MyThread指一個生命週期的表現,因為extends Thread
	//以下為生命的表現
	private String name;  //1.定義MyThread執行哪一個,可找出執行之時間順序
	MyThread(String name){this.name= name;}   //2.定義MyThread()名稱
	@Override
	public void run() {  //重新定義MyThread生命表現了什麼
		for(int i=0; i<10; i++){
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(100);  
				//跑完以上程式後,睡覺0.1秒,1000代表1秒鐘,此方法會拋出例外,執行出來感覺同時執行A及B,A及B時間間隔通常大於或等於0.1秒,不會小於0.1秒,若改為run則沒有辦法表現出來
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();    //什麼情況下能讓提早中斷?Ans:關機,所以此列程式不用做,可刪除
			}  
		}  
		//this = null;  //生命走到最後 ,觀念是這樣,實際上不是寫在這,或mt1給它null,則生命走到最後
	}   //生命表現到這個地方,或者return掉,兩種叫做壽終正寢,在java中盡量避免掉非壽終正寢,完全不鼓勵
}
