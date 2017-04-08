package tw.org.iii;
//網際網路TCP接收-進階1-fix
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import org.omg.CORBA_2_3.portable.InputStream;


public class Brad75 {

	public static void main(String[] args) {
		try{
			ServerSocket server= new ServerSocket(7777);  
			Socket socket = server.accept();  
			System.out.println(socket.getInetAddress().getHostAddress());
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			int i ; String line;
			while ( (line = reader.readLine()) != null){
				System.out.println(line);
			}
			reader.close();
//			while((i=in.read()) != -1){  //一次讀一個字元
//				System.out.println((char)i);
//			}
//			in.close();                     
		
			server.close();
		
		}catch(Exception e){                  
			System.out.println(e.toString());
		}

	}

}
