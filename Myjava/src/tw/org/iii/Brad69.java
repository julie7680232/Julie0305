package tw.org.iii;
//���ں���InetAddress:�{��IP��}
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.URL;

public class Brad69 {

	public static void main(String[] args) {
		//URL url = new URL("http://nnnnn");  //URL���}�D�D���W��
		try{
			//1.�o����@�D���W�٪�IP��}
			InetAddress ip1 = InetAddress.getByName("www.microsoft.com");  //"www.iii.org.tw"���D���W��,���굦�|IP
			System.out.println(ip1.getHostAddress());  //�L�XIP��},�����i��P��L�H�L�X��IP��}���P,�]����DNS�����y(�y�q���})
			System.out.println("---------------------------------");
			
			//2.�o���D���W�٩Ҧ���IP��}
			InetAddress ips[] = InetAddress.getAllByName("www.hinet.net"); 
			//****�]��InetAddness�S���غc��,�ҥH�S��new,�ҥH�ϥ�static��k���쪫�����*** 
			
			for(InetAddress ip : ips){  //InetAddress ip  ����@IP��}
				System.out.println(ip.getHostAddress());   //�|��{www.iii.org.tw��IP��}
			}
			//��getByName(www.microsoft.com)��IP��}���P�O�]��IP��}�����y,��getAllByName�i�o���Ҧ�IP��}
		}catch(UnknownHostException e){  //�i��ߥX���{�ѥD�����ҥ~
			System.out.println(e.toString());
		}
	}

}
