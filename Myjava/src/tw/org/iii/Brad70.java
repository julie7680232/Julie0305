package tw.org.iii;
//���ں���UDP�o�e
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

//���ں����s��IP
public class Brad70 {
	public static void main(String[] args) {
		//UDP:�D�s���ɦV:�ʥ]���A,���ަ��S���n�o�e(��C.���C)  /TCP:�s���ɦV:�ʥ]���A,�T�w��覬��(�į�|����t,�e�s�u�e�q)
		String data = "Hello,Julie";
		byte[] sendData = data.getBytes();
		try{
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(sendData, sendData.length,InetAddress.getByName("127.0.0.1"),8888);
			socket.send(packet);   //127.0.0.1:�ۤv�o�e�ۤv����
			socket.close();
			System.out.println("OK");
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}

}
