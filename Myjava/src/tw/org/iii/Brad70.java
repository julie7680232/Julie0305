package tw.org.iii;
//網際網路UDP發送
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

//網際網路連接IP
public class Brad70 {
	public static void main(String[] args) {
		//UDP:非連接導向:封包給你,不管有沒有要發送(手遊.網遊)  /TCP:連接導向:封包給你,確定對方收到(效能會比較差,占連線容量)
		String data = "Hello,Julie";
		byte[] sendData = data.getBytes();
		try{
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(sendData, sendData.length,InetAddress.getByName("127.0.0.1"),8888);
			socket.send(packet);   //127.0.0.1:自己發送自己接收
			socket.close();
			System.out.println("OK");
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}

}
