package tw.org.iii;
//網際網路TCP發送-進階1-fix
import java.io.OutputStream;
//網際網路TCP發送
import java.net.InetAddress;
import java.net.Socket;

public class Brad74 {
	public static void main(String[] args) {
		for(int i=130; i<140; i++){
		try{
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),i);  //試探對方是否和我講話
			System.out.println("post:"+ i); //i範圍的人願意跟我講話的,都會顯示出來=>設定for迴圈
			OutputStream out = socket.getOutputStream();
			out.flush();
			out.close();
			socket.close();
		}catch(Exception e){                  //不能任意掃別人的code,是違法的
			System.out.println(e.toString());
		}
		}
	}

}
