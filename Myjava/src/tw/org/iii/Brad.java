package tw.org.iii;

public class Brad {//
	int a;
	static int b;                      //為物件
	{                      
		a = 100;
		System.out.println("{}:a=" + a);         //設計在類別裡.稱城市區塊  
	}                                            //a的值本來就有了,在建構式之前
	static{
		System.out.println("static{}");       //static 為物件,只執行一次
	}
	
	
	Brad(){                               //一開始之狀態,一旦new早就有物件
		System.out.println("Brad()");
	}

}
