package tw.org.iii;
//���ں���TCP�o�e��(Socket.OutputStream)-2:�PBrad75����,���D����@�N�M�����ܨåB�o�e���(�B�J1~3�Y�i�ǰe���,���٨S�ǰe������,�B�J4�Y�ǰe�����)
//�����OSocket��Socket
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Brad74 {
	public static void main(String[] args) {
			try{ //�O�H���@�N���ܷ|�ߥX�ҥ~
				Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),8888);
				OutputStream out = socket.getOutputStream();  //1. //�o�e�ݬ�OutputStream,OutputStream���غc����public
				out.write("Hello, ���".getBytes());  //4. //write(byte[] b)
				out.flush();  //�]��output      //2.
				out.close();                  //3.
				socket.close();
			}catch(Exception e){                  //������N���O�H��code,�O�H�k��
				System.out.println(e.toString());
				}
	}
}
