package tw.org.iii; 
import java.io.*;  //package下所有,不包含其他package,可刪除其他import java.io....
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
public class Brad51 {
	public static void main(String[] args) {
		//File file = new File("c:/test/brad.txt");   //"\"為跳脫字元,在JVM中/為目錄符號
		File file = new File("./dir1/file1.txt");   //"."
		try{
		FileInputStream fin = new FileInputStream(file);  //API寫會拋出例外,所以使用try{}catch(){}
		//int data = fin.read();   //只讀出檔案之第一文字a
		int temp;                              
		while ((temp = fin.read()) != -1 ){   //使用while執行以下四列         //因為read一次只能讀出1個byte,無法讀出中文,超出1個byte
			System.out.print((char)temp);
		}
    //  System.out.print((char)fin.read());
	//	System.out.print((char)fin.read());
	//	System.out.print((char)fin.read());
	//	System.out.print((char)fin.read());
		
		
	//	while ( (fin.read()) != -1 ){   //  讀出的值為a,非-1,故執行以下動作    
	//		System.out.print((char)fin.read());   //可是在這印出b
		
		
		fin.close();
	//	}catch(FileNotFoundException ee){
	//		System.out.println(ee.toString());
		}catch(Exception ee){       //用Exception全捕捉
			System.out.println(ee.toString());
		}
	//	if(file.exists()){
	//		//System.out.println("OK:" + file.getAbsolutePath());  //得出"."的位址
	//		System.out.println("OK");
	//	}else{
	//		System.out.println("XX");   //API 上寫會拋出,因為是RuntimeException所以可做可不做
	//	}
	}

}
