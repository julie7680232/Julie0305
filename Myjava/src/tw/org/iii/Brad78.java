package tw.org.iii;
//���ں���TCP�o�e-�i��2
import java.io.OutputStream;
//���ں���TCP�o�e
import java.net.InetAddress;
import java.net.Socket;

public class Brad78 {
	public static void main(String[] args) {
		
		try{
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9999);  //�ձ����O�_�M������
			OutputStream out = socket.getOutputStream();
			out.write("Hello, World".getBytes());
			out.flush();
			out.close();
			socket.close();
		}catch(Exception e){                  //������N���O�H��code,�O�H�k��
			System.out.println(e.toString());
		}
		
	}

}
