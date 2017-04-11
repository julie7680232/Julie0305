package tw.org.iii;
//複製檔案(圖片)的範例
//1.read  2.write
//有兩種方法:方法1:一個讀一個寫(Brad64)    方法2:全部讀完再一起寫(Brad65)
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad64 {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();    
		File readFile = new File("./dir1/Brad.jpg");
		File saveFile = new File("./dir2/Brad.jpg");
		
		try{
			FileOutputStream fout = new FileOutputStream(saveFile);
			FileInputStream fin = new FileInputStream(readFile);
			int b;
			while ((b = fin.read()) !=-1){   //當讀檔不等於-1時(即還有資料時),將讀之資料寫入到dir2之資料夾(該檔有多大你就做幾次)
				fout.write(b);              
			}
			fin.close();   
			fout.flush();  //因為有output
			fout.close();
			System.out.println("Finish");  //執行到Finish即代表沒有拋出例外
		}catch(Exception e){
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis()-start);  //得知程式執行多久
	}
}
