package tw.org.iii;
//���ں���TCP������(ServerSocket)-1:�PBrad72����,���D���O�_�@�N�M�ڹ��(3��洤),�٨S�ǰe������
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import org.omg.CORBA_2_3.portable.InputStream;

public class Brad73 {

	public static void main(String[] args) {
		try{  //port�Q�e�η|�ߥX�ҥ~IOException
			ServerSocket server= new ServerSocket(7777);   //���w�A�Qť����port,�����ݪ�
			System.out.println("before");
			server.accept();  //���@�N����
			System.out.println("after");
			server.close();
			System.out.println("OK");
		}catch(Exception e){                  
			System.out.println(e.toString());
		}

	}

}
