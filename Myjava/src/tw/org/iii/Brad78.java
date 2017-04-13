package tw.org.iii;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
//網際網路TCP接收端(ServerSocket.BufferedInputStream.BufferedOutputStream)-3(傳送檔案)
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad78 {

	public static void main(String[] args) {
		try{  //port被占用會拋出例外IOException
			ServerSocket server= new ServerSocket(9999);   //指定你想聽哪個port,本機端的
			Socket socket = server.accept();   //一旦傳遞成功,Socket會被傳遞回來,即return socket(回傳socket物件實體),此時兩邊(Brad72)的溝通機制會變成socket對socket
			
			System.out.println(socket.getInetAddress().getHostAddress());  //印出發送過來之IP位址
			//可以讀取中文,不只一個字元一個字元讀取,直接讀取一整列
			
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("./dir2/iii.jpg"));  //3.將接送到的檔案串接到想要的資料夾
			//因為不知道傳送檔案之檔名,所以打iii,傳檔案內容
			BufferedInputStream bin = new BufferedInputStream(socket.getInputStream());  //1.去源頭把檔案串接出來
			byte[] buf = new byte[4096]; int len;  //宣告byte陣列存取資料
			while ((len = bin.read(buf))!= -1){   //讀了4096後,把它交給bout寫出去
				bout.write(buf, 0, len);  //	write(byte[] b, int off(此為初始值), int len(此為讀取到多少檔案大小))
			}
			bin.close();   //2.
			bout.flush(); //4.
			bout.close(); //5.
			
			server.close();
			System.out.println("Receive OK");
		}catch(Exception e){                  
			System.out.println(e.toString());
		}
	}
}
