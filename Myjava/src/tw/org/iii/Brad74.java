package tw.org.iii;
//網際網路TCP發送端(Socket.OutputStream)-2:與Brad75對應,知道對方願意和我講話並且發送資料
//玩的是Socket對Socket
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Brad74 {
	public static void main(String[] args) {
			try{ //別人不願意講話會拋出例外
				Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),8888);
				OutputStream out = socket.getOutputStream();   //發送端為OutputStream,OutputStream之建構式為public
				out.write("Hello, World".getBytes());  //write(byte[] b)
				out.flush();  //因為output
				out.close();  
				socket.close();
			}catch(Exception e){                  //不能任意掃別人的code,是違法的
				System.out.println(e.toString());
				}
	}
}
