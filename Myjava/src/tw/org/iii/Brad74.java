package tw.org.iii;
//���ں���TCP�o�e��(Socket.OutputStream)-2:�PBrad75����,���D����@�N�M�����ܨåB�o�e���
//�����OSocket��Socket
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Brad74 {
	public static void main(String[] args) {
			try{ //�O�H���@�N���ܷ|�ߥX�ҥ~
				Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),8888);
				OutputStream out = socket.getOutputStream();   //�o�e�ݬ�OutputStream,OutputStream���غc����public
				out.write("Hello, World".getBytes());  //write(byte[] b)
				out.flush();  //�]��output
				out.close();  
				socket.close();
			}catch(Exception e){                  //������N���O�H��code,�O�H�k��
				System.out.println(e.toString());
				}
	}
}
