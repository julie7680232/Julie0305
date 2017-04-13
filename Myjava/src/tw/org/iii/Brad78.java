package tw.org.iii;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
//���ں���TCP������(ServerSocket.BufferedInputStream.BufferedOutputStream)-3(�ǰe�ɮ�)
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad78 {

	public static void main(String[] args) {
		try{  //port�Q�e�η|�ߥX�ҥ~IOException
			ServerSocket server= new ServerSocket(9999);   //���w�A�Qť����port,�����ݪ�
			Socket socket = server.accept();   //�@���ǻ����\,Socket�|�Q�ǻ��^��,�Yreturn socket(�^��socket�������),���ɨ���(Brad72)�����q����|�ܦ�socket��socket
			
			System.out.println(socket.getInetAddress().getHostAddress());  //�L�X�o�e�L�Ӥ�IP��}
			//�i�HŪ������,���u�@�Ӧr���@�Ӧr��Ū��,����Ū���@��C
			
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("./dir2/iii.jpg"));  //3.�N���e�쪺�ɮצ걵��Q�n����Ƨ�
			//�]�������D�ǰe�ɮפ��ɦW,�ҥH��iii,���ɮפ��e
			BufferedInputStream bin = new BufferedInputStream(socket.getInputStream());  //1.�h���Y���ɮצ걵�X��
			byte[] buf = new byte[4096]; int len;  //�ŧibyte�}�C�s�����
			while ((len = bin.read(buf))!= -1){   //Ū�F4096��,�⥦�浹bout�g�X�h
				bout.write(buf, 0, len);  //	write(byte[] b, int off(������l��), int len(����Ū����h���ɮפj�p))
			}
			bin.close();   //2.
			bout.flush(); //4.
			bout.close(); //5.
			
			server.close();
			System.out.println("Receive OK");
		}catch(Exception e){                  
			System.out.println(e.toString());
		}
	}
}
