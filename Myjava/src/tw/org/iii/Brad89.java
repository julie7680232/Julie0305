package tw.org.iii;
//Thread-2
import java.util.ArrayList;
import java.util.Collection;

public class Brad89 {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread("A");   //3.定義為"A"
		MyThread mt2 = new MyThread("B");   //3.定義為"B"
		//mt1.run();//為了表現出特徵,用start,否則其他物件只是一般物件,沒有生命
		mt1.start();
		mt2.start();
		//mt1.start();   //生命只有一條,但這有兩條,會拋出例外IllegalThreadStateException,只能呼叫一次start,若跑run則生命已結束,但大體還存在
		
		try {  //讓Hello,World晚點印出,利用sleep,可在主執行緒之停留
		Thread.sleep(1);  
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();    //什麼情況下能讓提早中斷?Ans:關機,所以此列程式不用做,可刪除
		}
		
		System.out.println("Hello,World");  //寫在最後面.但是先印出來了(在System.out.println("MyThread:" + i)前)
		//因為start不是馬上開始,是進入程式執行等候區,由CPU去排隊執行,但mt1.start()改成mt1.run則依程式順序執行
		//想讓Hello,World大約在哪時候印出,利用sleep,可在主執行緒之停留
		
		//Collection a =new ArrayList<>();  //實作ArrayList裡的東西,為多型的表現
		
		try {  
			Thread.sleep(20*1000);  //休息20秒候執行mt1.run,再次了解之程式執行之順序
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();    //什麼情況下能讓提早中斷?Ans:關機,所以此列程式不用做,可刪除
			}
		mt1.run();
	}
}

class MyThread extends Thread{  //定義一個執行緒 //MyThread指一個生命週期的表現,因為extends Thread
	//以下為生命的表現
	private String name;  //1.定義MyThread執行哪一個,可找出執行之時間順序
	MyThread(String name){this.name= name;}   //2.定義MyThread()名稱
	@Override
	public void run() {  //重新定義MyThread生命定義了什麼
		for(int i=0; i<10; i++){
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
