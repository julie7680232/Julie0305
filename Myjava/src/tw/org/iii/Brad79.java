package tw.org.iii;
//TCP接送端-進階3(圖片)
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
//網際網路TCP接收-進階2
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import org.omg.CORBA_2_3.portable.InputStream;


public class Brad79 {

	public static void main(String[] args) {
		try{
			ServerSocket server= new ServerSocket(9999);  
			Socket socket = server.accept();  
			
			System.out.println(socket.getInetAddress().getHostAddress());
			
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("./dir2/iii.jpg"));
			//因為不知道傳送檔案之檔名,所以打iii,傳檔案內容
			BufferedInputStream bin = new BufferedInputStream(socket.getInputStream());
			byte[] buf = new byte[4096]; int len;
			while ((len = bin.read(buf))!= -1){
				bout.write(buf, 0, len);
			}
			bin.close();
			bout.flush();
			bout.close();
			server.close();
			System.out.println("Receive OK");
		
		}catch(Exception e){                  
			System.out.println(e.toString());
		}

	}

}
