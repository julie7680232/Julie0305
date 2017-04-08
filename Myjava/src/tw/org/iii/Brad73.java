package tw.org.iii;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import org.omg.CORBA_2_3.portable.InputStream;

//網際網路TCP接收-fix
public class Brad73 {

	public static void main(String[] args) {
		try{
			ServerSocket server= new ServerSocket(7777);  
			System.out.println("before");
			Socket socket = server.accept();  //1
			InputStream in = socket.getInputStream();  //2
			in.close();                     //3
			//server.accept();
			System.out.println("after");
			server.close();
			System.out.println("OK");
		}catch(Exception e){                  
			System.out.println(e.toString());
		}

	}

}
