package tw.org.iii;
//TCP發送端-進階3(圖片)
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
//網際網路TCP發送-進階3(發送圖檔)
import java.io.OutputStream;

import java.net.InetAddress;
import java.net.Socket;

public class Brad76 {
	public static void main(String[] args) {
		
		try{
			File sendFile = new File("./dir1/julie.jpg");
			byte[] buf = new byte[(int)sendFile.length()];
			BufferedInputStream bin = new BufferedInputStream(new FileInputStream(sendFile));
			bin.read(buf);
			bin.close();
			
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9999);  //試探對方是否和我講話
			
			OutputStream out = socket.getOutputStream();
			out.write(buf);
			out.flush();
			out.close();
			socket.close();
		}catch(Exception e){                  //不能任意掃別人的code,是違法的
			System.out.println(e.toString());
		}
		
	}

}
