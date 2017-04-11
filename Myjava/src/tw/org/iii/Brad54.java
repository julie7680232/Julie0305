package tw.org.iii; 
import java.io.*; 
public class Brad54 {
	public static void main(String[] args) {
		File file = new File("./dir1/file1.txt");
		try {
			FileReader reader = new FileReader(file);    //Reader讀的是字元
			int temp;
			while((temp = reader.read()) !=-1){  //此read()由API之Method Summary 之InputStreamReader得知,找他的爸爸,即InputStreamReader
				System.out.print((char)temp);   //API上血型別為int,因為我們要讀取字元,所以強制轉型為字元
			}
			reader.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}

//FileInputStream之read() => 讀一個byte
//Read及InputStreamReader之read() => 讀一個字元