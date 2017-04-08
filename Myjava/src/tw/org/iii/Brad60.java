package tw.org.iii;
//fixed(13~18)
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Brad60 {

	public static void main(String[] args) {
		String data = "OK";
		File outFile = new File("./dir1/brad.txt");  //"./dir1/brad.txt"不一定要存在,只要有dir1,自動進立新檔(只有output)
//		try{
//		FileInputStream fin = new FileInputStream(outFile);
//		fin.close();
//		}catch(Exception e){
//		System.out.println(e.toString());
//		}

	try{
			FileOutputStream fout = new FileOutputStream(outFile,true);  //true資料再次執行時,資料補在後面,適合用在logo,在建構式就要決定了,沒辦法之後決定
			fout.write(data.getBytes());  //字串轉成byte陣列,呼叫字串轉成getBytes()
			fout.flush();//只有輸出才有,flush沖水馬桶,作業系統之記憶體,若作業系統效能沒有很好,則檔案資料會滯留在作業系統
			fout.close();
		}catch(Exception e){
			System.out.println(e.toString());
		}
		
	}

}
