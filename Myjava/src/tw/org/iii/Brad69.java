package tw.org.iii;
//fixed(12~13)
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.URL;
//���ں���
public class Brad69 {

	public static void main(String[] args) {
		//URL url = new URL("http://");
		try{
			InetAddress ips[] = InetAddress.getAllByName("www.hinet.net");  //�D���W��
			for(InetAddress ip : ips){
			System.out.println(ip.getHostAddress());   //�|��{www.iii.org.tw��IP��}
			}
			//��getByName(www.microsoft.com)��IP��}���P�O�]��IP��}�����y,��getAllByName
		}catch(UnknownHostException e){
			System.out.println(e.toString());
		}
	}

}
