package tw.org.iii;
//複製檔案(圖片)的範例
//1.read  2.write
//有兩種方法:方法1:一個讀一個寫(Brad64)    
//方法2:全部讀完再一起寫(Brad65),與Brad64差在效能,因為用多一點記憶體空間及執行動作,Brad65只執行一次,但Brad64因為有while迴圈(該檔案有多大就執行幾次),導致效能較差

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad65 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		File readFile = new File("./dir1/Brad.jpg");
		File saveFile = new File("./dir2/Brad.jpg");
		
		try{
			byte[] b = new byte[(int)readFile.length()];  //給一個byte陣列,得知想要讀的檔案之內容大小
			FileInputStream fin = new FileInputStream(readFile);
			fin.read(b);   //讀出b所有資料
			fin.close();
			
			FileOutputStream fout = new FileOutputStream(saveFile);
			fout.write(b);  //b所有資料寫入dir2
			fout.flush();   //Output才需要
			fout.close();
			System.out.println("Finish");
		}catch(Exception e){
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis()-start);  //得知程式執行多久
	}
}
