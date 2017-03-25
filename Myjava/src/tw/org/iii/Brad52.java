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
		int len;                        
		while ((len = fin.read(buf)) != -1 ){   
			System.out.print(new String(buf));
		}
		fin.close();
	
		}catch(Exception ee){       
			System.out.println(ee.toString());
		}
	
	}

}
