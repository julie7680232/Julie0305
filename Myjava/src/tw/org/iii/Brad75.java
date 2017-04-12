package tw.org.iii;
//網際網路TCP接收端(ServerSocket)-2:與Brad74對應,知道對方願意和我講話並且接收他發送過來之資料
//玩的是Socket對Socket
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad75 {

	public static void main(String[] args) {
		try{  //port被占用會拋出例外IOException
			ServerSocket server= new ServerSocket(8888);   //指定你想聽哪個port,本機端的
			
			Socket socket = server.accept();  //1 //一旦傳遞成功,Socket會被傳遞回來,即return socket,此時兩邊(Brad72)的溝通機制會變成socket對socket
			InputStream in = socket.getInputStream();  //2 //InputStream為抽象,沒有建構物件實體
			int i;  
			while ((i = in.read()) != -1){  //read(byte[] b)為int型別,讀byte陣列
				System.out.print((char)i);
			}
			in.close();                     //3
			
			server.close();
		}catch(Exception e){                  
			System.out.println(e.toString());
		}
	}
}

//package tw.org.iii;
////網際網路TCP接收-進階1-fix
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.InetAddress;
//import java.net.ServerSocket;
//import java.net.Socket;
//
//import org.omg.CORBA_2_3.portable.InputStream;
//
//
//public class Brad75 {
//
//	public static void main(String[] args) {
//		try{
//			ServerSocket server= new ServerSocket(7777);  
//			Socket socket = server.accept();  
//			System.out.println(socket.getInetAddress().getHostAddress());
//			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			int i ; String line;
//			while ( (line = reader.readLine()) != null){
//				System.out.println(line);
//			}
//			reader.close();
////			while((i=in.read()) != -1){  //一次讀一個字元
////				System.out.println((char)i);
////			}
////			in.close();                     
//		
//			server.close();
//		
//		}catch(Exception e){                  
//			System.out.println(e.toString());
//		}
//
//	}
//
//}
