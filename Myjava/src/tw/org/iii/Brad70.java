package tw.org.iii;
//���ں���UDP�o�e��
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

//���ں����s��IP�����:UDP��TCP
//UDP:�D�s���ɦV:�ʥ]���A,���ަ��S���n�o�e(��C.���C) ; TCP:�s���ɦV:�ʥ]���A,�T�w��覬��(�į�|����t,�e�s�u�e�q)
public class Brad70 {
	public static void main(String[] args) {
		
		String data = "Hello,Julie,ok";
		byte[] sendData = data.getBytes();
		try{  //�i��|��XSocketException��UnknownHostException(���{�ѥD�����ҥ~)
			DatagramSocket socket = new DatagramSocket();  //DatagramSocket�ƾڴ��y
			DatagramPacket packet = new DatagramPacket(sendData, sendData.length,
					InetAddress.getByName("127.0.0.1"),8888);  //�o�e�ݻP������port�n�ۦP
			//DatagramPacket�ƾګʥ] ;DatagramPacket(byte[] buf, int length, InetAddress address, int port)
			//port = 0-65535,�ɶq����0-1024
			socket.send(packet);   //�Ѵ��y�q�ϥΪ̨��رH�e�ʥ],127.0.0.1:�ۤv�o�e�ۤv����
			socket.close();  //�Mio�[���@��,���}����
			System.out.println("OK");  //���榹�C�Y�i���D���o�e�X�h
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}

}
