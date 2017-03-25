package tw.org.iii; 
import java.io.*;  //package下所有,不包含其他package,可刪除其他import java.io....
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
public class Brad53 {
	public static void main(String[] args) {
		File file = new File("./dir1/file1.txt");
		try{
			FileInputStream fin = new FileInputStream(file); 
		byte[] buf = new byte[(int)file.length()];     //缺點:占記憶體,如何預估多大
		                                          //陣列沒有long,只好強制轉型,只能讀2G內的檔案,若想再多,寫迴圈
		int len= fin.read(buf);                        
		System.out.println(new String(buf,0,len));
		fin.close();
	
		}catch(Exception ee){       
			System.out.println(ee.toString());
		}
	
	}

}
