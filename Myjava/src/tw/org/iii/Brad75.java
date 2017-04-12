package tw.org.iii;
//���ں���TCP������(ServerSocket)-2:�PBrad74����,���D����@�N�M�����ܨåB�����L�o�e�L�Ӥ����
//�����OSocket��Socket
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad75 {

	public static void main(String[] args) {
		try{  //port�Q�e�η|�ߥX�ҥ~IOException
			ServerSocket server= new ServerSocket(8888);   //���w�A�Qť����port,�����ݪ�
			
			Socket socket = server.accept();  //1 //�@���ǻ����\,Socket�|�Q�ǻ��^��,�Yreturn socket,���ɨ���(Brad72)�����q����|�ܦ�socket��socket
			InputStream in = socket.getInputStream();  //2 //InputStream����H,�S���غc�������
			int i;  
			while ((i = in.read()) != -1){  //read(byte[] b)��int���O,Ūbyte�}�C
				System.out.print((char)i);
			}
			in.close();                     //3
			
			server.close();
		}catch(Exception e){                  
			System.out.println(e.toString());
		}
	}
}

//package tw.org.iii;
////���ں���TCP����-�i��1-fix
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.InetAddress;
//import java.net.ServerSocket;
//import java.net.Socket;
//
//import org.omg.CORBA_2_3.portable.InputStream;
//
//
//public class Brad75 {
//
//	public static void main(String[] args) {
//		try{
//			ServerSocket server= new ServerSocket(7777);  
//			Socket socket = server.accept();  
//			System.out.println(socket.getInetAddress().getHostAddress());
//			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			int i ; String line;
//			while ( (line = reader.readLine()) != null){
//				System.out.println(line);
//			}
//			reader.close();
////			while((i=in.read()) != -1){  //�@��Ū�@�Ӧr��
////				System.out.println((char)i);
////			}
////			in.close();                     
//		
//			server.close();
//		
//		}catch(Exception e){                  
//			System.out.println(e.toString());
//		}
//
//	}
//
//}
