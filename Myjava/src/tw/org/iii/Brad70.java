package tw.org.iii;
//網際網路UDP發送端
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

//網際網路連接IP有兩種:UDP及TCP
//UDP:非連接導向:封包給你,不管有沒有要發送(手遊.網遊) ; TCP:連接導向:封包給你,確定對方收到(效能會比較差,占連線容量)
public class Brad70 {
	public static void main(String[] args) {
		
		String data = "Hello,Julie,ok";
		byte[] sendData = data.getBytes();
		try{  //可能會丟出SocketException及UnknownHostException(不認識主機之例外)
			DatagramSocket socket = new DatagramSocket();  //DatagramSocket數據插座
			DatagramPacket packet = new DatagramPacket(sendData, sendData.length,
					InetAddress.getByName("127.0.0.1"),8888);  //發送端與接收端port要相同
			//DatagramPacket數據封包 ;DatagramPacket(byte[] buf, int length, InetAddress address, int port)
			//port = 0-65535,盡量不用0-1024
			socket.send(packet);   //由插座從使用者那裏寄送封包,127.0.0.1:自己發送自己接收
			socket.close();  //和io觀念一樣,有開有關
			System.out.println("OK");  //執行此列即可知道有發送出去
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}

}
