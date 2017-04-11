package tw.org.iii; 
import java.io.*;  //package下所有,不包含其他package,可刪除其他import java.io....
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
public class Brad52 {
	public static void main(String[] args) {
		//File file = new File("c:/test/brad.txt");   //"\"為跳脫字元,在JVM中/為目錄符號
		File file = new File("./dir1/file1.txt");   //"."
		try{
		FileInputStream fin = new FileInputStream(file);  //API寫會拋出例外,所以使用try{}catch(){}
		//int data = fin.read();   //只讀出檔案之第一文字a
		byte[] buf = new byte[3];     //因為UTF8用3,若中文字前放a,問題還是存在
		// 在 UTF-8 的編碼，一個中文 3 bytes;big5 一個中文算 2 byte, 不同的編碼，中文的長度不同

		int len;                        
		while ((len = fin.read(buf)) != -1 ){     
			System.out.print(new String(buf,0,len));   //字串可以讀char或byte
		}
		fin.close();
	
		}catch(Exception ee){       
			System.out.println(ee.toString());
		}
	
	}

}
