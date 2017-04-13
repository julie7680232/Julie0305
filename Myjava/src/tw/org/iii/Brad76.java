package tw.org.iii;
import java.io.BufferedReader;
/*���ں���TCP������(ServerSocket.InputStream�令InputStreamReader��BufferedReader)-2-2(�PBrad75���P���O,�L�X�Ӫ��r,�OŪ���@��C,�i�HŪ������):
�PBrad74����,���D����@�N�M�����ܨåB�����L�o�e�L�Ӥ����(�B�J1~2�Y�i�������,�B�J3~4���e�쪺��ƶi��Ū���æL�X��)
*/
//�����OSocket��Socket
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad76 {

	public static void main(String[] args) {
		try{  //port�Q�e�η|�ߥX�ҥ~IOException
			ServerSocket server= new ServerSocket(8888);   //���w�A�Qť����port,�����ݪ�
			Socket socket = server.accept();   //�@���ǻ����\,Socket�|�Q�ǻ��^��,�Yreturn socket(�^��socket�������),���ɨ���(Brad72)�����q����|�ܦ�socket��socket
			
			System.out.println(socket.getInetAddress().getHostAddress());  //�L�X�o�e�L�Ӥ�IP��}
			//�i�HŪ������,���u�@�Ӧr���@�Ӧr��Ū��,����Ū���@��C
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));  //BufferedReader�ȾA�Φb��r���
			int i ; String line;
			while ( (line = reader.readLine()) != null){
				System.out.println(line);
			}
			reader.close();

//			InputStream in = socket.getInputStream();  //1 //InputStream����H,�S���غc�������
//			int i;                                   //3
//			while ((i = in.read()) != -1){  //read(byte[] b)��int���O,Ūbyte�}�C,�@��Ū�@�Ӧr��,�Y�O����,�n��@�U�{��    //4
//				System.out.print((char)i);
//			}
//			in.close();                     //2
			
			server.close();
		}catch(Exception e){                  
			System.out.println(e.toString());
		}
	}
}
