package tw.org.iii;
//���ں���TCP������(ServerSocket.InputStream)-2-1:�PBrad74����,���D����@�N�M�����ܨåB�����L�o�e�L�Ӥ����(�B�J1~2�Y�i�������,�B�J3~4���e�쪺��ƶi��Ū���æL�X��)
//�����OSocket��Socket
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad75 {

	public static void main(String[] args) {
		try{  //port�Q�e�η|�ߥX�ҥ~IOException
			ServerSocket server= new ServerSocket(8888);   //���w�A�Qť����port,�����ݪ�
			Socket socket = server.accept();   //�@���ǻ����\,Socket�|�Q�ǻ��^��,�Yreturn socket(�^��socket�������),���ɨ���(Brad72)�����q����|�ܦ�socket��socket
			
			System.out.println(socket.getInetAddress().getHostAddress());  //�L�X�o�e�L�Ӥ�IP��}
			InputStream in = socket.getInputStream();  //1 //InputStream����H,�S���غc�������
			int i;                                   //3
			while ((i = in.read()) != -1){  //read(byte[] b)��int���O,Ūbyte�}�C,�@��Ū�@�Ӧr��,�Y�O����,�n��@�U�{��    //4
				System.out.print((char)i);
			}
			in.close();                     //2
			
			server.close();
		}catch(Exception e){                  
			System.out.println(e.toString());
		}
	}
}