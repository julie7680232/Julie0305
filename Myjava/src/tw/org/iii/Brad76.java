package tw.org.iii;
//TCP�o�e��-�i��3(�Ϥ�)
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
//���ں���TCP�o�e-�i��3(�o�e����)
import java.io.OutputStream;

import java.net.InetAddress;
import java.net.Socket;

public class Brad76 {
	public static void main(String[] args) {
		
		try{
			File sendFile = new File("./dir1/julie.jpg");
			byte[] buf = new byte[(int)sendFile.length()];
			BufferedInputStream bin = new BufferedInputStream(new FileInputStream(sendFile));
			bin.read(buf);
			bin.close();
			
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9999);  //�ձ����O�_�M������
			
			OutputStream out = socket.getOutputStream();
			out.write(buf);
			out.flush();
			out.close();
			socket.close();
		}catch(Exception e){                  //������N���O�H��code,�O�H�k��
			System.out.println(e.toString());
		}
		
	}

}
