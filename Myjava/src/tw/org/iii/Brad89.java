package tw.org.iii;
//Thread-1(start.run)
import java.util.ArrayList;
import java.util.Collection;

public class Brad89 {
	public static void main(String[] args) {
		MyThreadone mt1 = new MyThreadone();
		MyThreadone mt2 = new MyThreadone();
//		mt1.run();
//		mt1.start(); //mt1.start(); 生命只有一條,有兩條會拋出例外IllegalThreadStateException,只能呼叫一次start
//		mt1.run();  //start執行後已結束生命特徵,怎麼還會有run(),因為雖然生命已結束,但還有大體,物件方法仍可以呼叫,還是存在

		mt1.start();
		mt2.start();//為了表現出特徵,用start,否則用run或其他物件只是一般物件方法,沒有生命
	
		System.out.println("Hello,World");  //寫在最後面.但是先印出來了(在System.out.println("MyThread:" + i)前)
		//因為start不是馬上開始,是進入程式執行等候區,由CPU去排隊執行,但mt1.start()改成mt1.run則依程式順序執行,但用run()只是一般物件方法,沒有生命
		
		//Collection a =new ArrayList<>();  //實作ArrayList裡的東西,為多型的表現
		//介面Collection需靠實作的類別ArrayList完成a,例如java認證工程師為collection,誰考過java認證工程師,就是人,人就是這裡的ArrayList
	}
}

class MyThreadone extends Thread{  //定義一個執行緒 //MyThread指一個生命週期的表現,因為extends Thread
	//以下為生命的表現
	@Override
	public void run() {  //重新定義MyThread生命表現了什麼
		for(int i=0; i<10; i++){
			System.out.println("MyThread:" + i);
		}
	}  //生命表現到這個地方,或者return掉,兩種叫做壽終正寢,在java中盡量避免掉非壽終正寢,完全不鼓勵
}
