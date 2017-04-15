package tw.org.iii;
//Thread-1
import java.util.ArrayList;
import java.util.Collection;

public class Brad90 {
	public static void main(String[] args) {
		MyThreadone mt1 = new MyThreadone();
		MyThreadone mt2 = new MyThreadone();
		mt1.start();//mt1.start();   //生命只有一條,但這有兩條,會拋出例外IllegalThreadStateException,只能呼叫一次start
		mt2.start();//為了表現出特徵,用start,否則其他物件只是一般物件,沒有生命
	
		System.out.println("Hello,World");  //寫在最後面.但是先印出來了(在System.out.println("MyThread:" + i)前)
		//因為start不是馬上開始,是進入程式執行等候區,由CPU去排隊執行,但mt1.start()改成mt1.run則依程式順序執行
		
		//Collection a =new ArrayList<>();  //實作ArrayList裡的東西,為多型的表現
	}
}

class MyThreadone extends Thread{  //定義一個執行緒 //MyThread指一個生命週期的表現,因為extends Thread
	//以下為生命的表現
	@Override
	public void run() {  //重新定義MyThread生命定義了什麼
		for(int i=0; i<10; i++){
			System.out.println("MyThread:" + i);
		}
	}
}
