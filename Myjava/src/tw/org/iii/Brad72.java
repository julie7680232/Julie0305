package tw.org.iii;
//���ں���TCP�o�e��(Socket)-1:�PBrad73����,���D���ں����W�����@�N�M�ڹ��,�٨S�ǰe������
import java.io.OutputStream;
//���ں���TCP�o�e
import java.net.InetAddress;
import java.net.Socket;

public class Brad72 {
	public static void main(String[] args) {
		//for(int i=0; i<65536; i++){  //1.�ˬd�Ҧ���port,�ݽ��@�N�M������  
		//for(int i=130; i<140; i++){  //1.�ˬd130��139��port,�ݽ��@�N�M������  
			try{ //�O�H���@�N���ܷ|�ߥX�ҥ~
				Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),7777);
				//Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),i);  //2.�ձ����O�_�M������,TCP:�@�����M�A���ܺ�3��洤;�غc��Socket(InetAddress address, int port)
				//System.out.println("port:"+ i); //3.i�d�򪺤H�@�N������ܪ�,���|��ܥX��=>�]�wfor�j��
				socket.close();
			}catch(Exception e){                  //������N���O�H��code,�O�H�k��
				System.out.println(e.toString());
				}
		//}   //4.
	}

}
