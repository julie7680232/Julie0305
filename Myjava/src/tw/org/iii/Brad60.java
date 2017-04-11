package tw.org.iii;
//FileOutputStream與其write,flush,將文字(單一型別之變數)寫入file中
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Brad60 {

	public static void main(String[] args) {
		String data = "OK";                  //為了得知不同FileOutputStream的建構式有什麼結果,新增之字串
		//String data = "Hello,Brad\nLine1\nLine2";
		File outFile = new File("./dir1/brad.txt");  
		//"./dir1/brad.txt"不一定要存在,只要有dir1,自動進立新檔(只有FileOutputStream,如果是FileInputStream則會出現例外)

//		try{
//			FileInputStream fin = new FileInputStream(outFile);   
//			fin.close();
//		}catch(Exception e){
//			System.out.println(e.toString());
//		}

	try{
		//FileOutputStream fout = new FileOutputStream(outFile);  
		//第1招建構式:每次重新執行程式時,之前執行的程式結果會從文字txt檔中被刪除,只出現此次新寫進文字檔txt的資料
		FileOutputStream fout = new FileOutputStream(outFile,true);  
		//第2招建構式:每次寫進文字txt檔的東西都是新的,會補在之前執行的結果後面;true資料再次執行時,資料補在後面,適合用在logo,在建構式就要決定了,沒辦法之後決定
		fout.write(data.getBytes());  //字串轉成byte陣列,呼叫字串轉成getBytes(),考試常考
			
		fout.flush();//只有輸出才有,flush沖水馬桶,作業系統之記憶體,若作業系統效能沒有很好,則檔案資料會滯留在作業系統
		fout.close();
		}catch(Exception e){
			System.out.println(e.toString());
		}
		
	}

}
