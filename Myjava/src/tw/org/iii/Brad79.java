package tw.org.iii;
///���ں���TCP�s�������W���ɮ�(URL.URLConnection.InputStream.BufferedInputStream.BufferedOutputStream)
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;


public class Brad79 {

	public static void main(String[] args) {
		
		try{
			URL url = new URL("https://s1.yimg.com/uu/api/res/1.2/.ddGu5Klto7_z5pMIkzNSw--/Zmk9dWxjcm9wO2N3PTUxMDtkeD0wO2NoPTM2MDtkeT0zNTt3PTM5MjtoPTMwODtjcj0xO2FwcGlkPXl0YWNoeW9u/http://media.zenfs.com/zh-Hant-TW/homerun/setn.com.tw/0a97e8fa3d7f646d41014ad708defd8c");
			URLConnection conn = url.openConnection();  //���ͤF�@��conn����:�����s������,url.openConnection():�}�ҳs�u
			//URLConnection�bURL���O
			conn.connect();  //�I�sconnect(),�Х��h���ڳs��
			InputStream in = conn.getInputStream();
			
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("./dir2/kkk.jpg"));  //�N���e�쪺�ɮצ걵��Q�n����Ƨ�
			//�]�������D�ǰe�ɮפ��ɦW,�ҥH��kkk,���ɮפ��e
			BufferedInputStream bin = new BufferedInputStream(in);  //�h���Y���ɮצ걵�X��
			byte[] buf = new byte[4096]; int len;  //�ŧibyte�}�C�s�����
			while ((len = bin.read(buf))!= -1){   //Ū�F4096��,�⥦�浹bout�g�X�h
				bout.write(buf, 0, len);  //	write(byte[] b, int off(������l��), int len(����Ū����h���ɮפj�p))
			}
			bin.close();   
			bout.flush(); 
			bout.close(); 
			System.out.println("OK");
			
		}catch(Exception ee){                  
			System.out.println(ee.toString());
		}
	}

}
