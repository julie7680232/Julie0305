package tw.org.iii;
///網際網路TCP連接網路上的檔案(URL.URLConnection.InputStream.BufferedInputStream.BufferedOutputStream)
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;


public class Brad79 {

	public static void main(String[] args) {
		
		try{
			URL url = new URL("https://s1.yimg.com/uu/api/res/1.2/.ddGu5Klto7_z5pMIkzNSw--/Zmk9dWxjcm9wO2N3PTUxMDtkeD0wO2NoPTM2MDtkeT0zNTt3PTM5MjtoPTMwODtjcj0xO2FwcGlkPXl0YWNoeW9u/http://media.zenfs.com/zh-Hant-TW/homerun/setn.com.tw/0a97e8fa3d7f646d41014ad708defd8c");
			URLConnection conn = url.openConnection();  //產生了一個conn物件:此為連接物件,url.openConnection():開啟連線
			//URLConnection在URL類別
			conn.connect();  //呼叫connect(),請它去幫我連結
			InputStream in = conn.getInputStream();
			
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("./dir2/kkk.jpg"));  //將接送到的檔案串接到想要的資料夾
			//因為不知道傳送檔案之檔名,所以打kkk,傳檔案內容
			BufferedInputStream bin = new BufferedInputStream(in);  //去源頭把檔案串接出來
			byte[] buf = new byte[4096]; int len;  //宣告byte陣列存取資料
			while ((len = bin.read(buf))!= -1){   //讀了4096後,把它交給bout寫出去
				bout.write(buf, 0, len);  //	write(byte[] b, int off(此為初始值), int len(此為讀取到多少檔案大小))
			}
			bin.close();   
			bout.flush(); 
			bout.close(); 
			System.out.println("OK");
			
		}catch(Exception ee){                  
			System.out.println(ee.toString());
		}
	}

}
