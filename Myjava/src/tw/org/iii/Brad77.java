package tw.org.iii;
//���ں���TCP�o�e��(Socket.OutputStream.BufferedInputStream)-3(�ǰe�ɮ�):�Y�B�J1~6
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
//���ں���TCP�o�e��-3(�ǰe�ɮ�)
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Brad77 {
	public static void main(String[] args) {
			try{ //�O�H���@�N���ܷ|�ߥX�ҥ~
				
				File sendFile = new File("./dir1/julie.jpg");  //1.�إ߶ǰe���ɮת���
				byte[] buf = new byte[(int)sendFile.length()];  //2.�ŧi�@��byte�}�C�����hŪ�����,�ð����ǰe���ɮצ��h�j;(int)sendFile.length() =>�ɮ׭���b2G����
				BufferedInputStream bin = new BufferedInputStream(new FileInputStream(sendFile));  //3.��Ū���ɮ�,�ҥH�OInput;��BufferedInputStream�hŪ���|������Z
				bin.read(buf);  //4.Ū���ɮפ����
				bin.close();    //5.��y����
				
				Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9999);
				
				OutputStream out = socket.getOutputStream();   //�o�e�ݬ�OutputStream,OutputStream���غc����public
				out.write(buf);  //6.
				out.flush();  //�]��output      
				out.close();                  
				
				socket.close();
			}catch(Exception e){                  //������N���O�H��code,�O�H�k��
				System.out.println(e.toString());
				}
	}
}
