package tw.org.iii;
//網際網路TCP發送-進階2
import java.io.OutputStream;
//網際網路TCP發送
import java.net.InetAddress;
import java.net.Socket;

public class Brad78 {
	public static void main(String[] args) {
		
		try{
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9999);  //試探對方是否和我講話
			OutputStream out = socket.getOutputStream();
			out.write("Hello, World".getBytes());
			out.flush();
			out.close();
			socket.close();
		}catch(Exception e){                  //不能任意掃別人的code,是違法的
			System.out.println(e.toString());
		}
		
	}

}
