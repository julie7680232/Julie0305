package tw.org.iii;
//網際網路TCP接收端(ServerSocket)-1:與Brad72對應,知道對方是否願意和我對話(3方交握),還沒傳送任何資料
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import org.omg.CORBA_2_3.portable.InputStream;

public class Brad73 {

	public static void main(String[] args) {
		try{  //port被占用會拋出例外IOException
			ServerSocket server= new ServerSocket(7777);   //指定你想聽哪個port,本機端的
			System.out.println("before");
			server.accept();  //我願意接收
			System.out.println("after");
			server.close();
			System.out.println("OK");
		}catch(Exception e){                  
			System.out.println(e.toString());
		}

	}

}
