package tw.org.iii;
//網際網路TCP發送端(Socket.OutputStream.BufferedInputStream)-3(傳送檔案):即步驟1~6
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
//網際網路TCP發送端-3(傳送檔案)
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Brad77 {
	public static void main(String[] args) {
			try{ //別人不願意講話會拋出例外
				
				File sendFile = new File("./dir1/julie.jpg");  //1.建立傳送之檔案物件
				byte[] buf = new byte[(int)sendFile.length()];  //2.宣告一個byte陣列讓它去讀取資料,並偵測傳送的檔案有多大;(int)sendFile.length() =>檔案限制在2G之內
				BufferedInputStream bin = new BufferedInputStream(new FileInputStream(sendFile));  //3.先讀取檔案,所以是Input;用BufferedInputStream去讀取會比較順暢
				bin.read(buf);  //4.讀取檔案之資料
				bin.close();    //5.串流關閉
				
				Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9999);
				
				OutputStream out = socket.getOutputStream();   //發送端為OutputStream,OutputStream之建構式為public
				out.write(buf);  //6.
				out.flush();  //因為output      
				out.close();                  
				
				socket.close();
			}catch(Exception e){                  //不能任意掃別人的code,是違法的
				System.out.println(e.toString());
				}
	}
}
