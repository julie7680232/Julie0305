package tw.org.iii;
import java.io.OutputStream;
//���ں���TCP�o�e
import java.net.InetAddress;
import java.net.Socket;

public class Brad72 {
	public static void main(String[] args) {
		for(int i=130; i<140; i++){
		try{
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),i);  //�ձ����O�_�M������
			System.out.println("post:"+ i); //i�d�򪺤H�@�N������ܪ�,���|��ܥX��=>�]�wfor�j��
			OutputStream out = socket.getOutputStream();
			out.flush();
			out.close();
			socket.close();
		}catch(Exception e){                  //������N���O�H��code,�O�H�k��
			System.out.println(e.toString());
		}
		}
	}

}
