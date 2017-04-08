package tw.org.iii;
//fixed(12~13)
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.URL;
//網際網路
public class Brad69 {

	public static void main(String[] args) {
		//URL url = new URL("http://");
		try{
			InetAddress ips[] = InetAddress.getAllByName("www.hinet.net");  //主機名稱
			for(InetAddress ip : ips){
			System.out.println(ip.getHostAddress());   //會顯現www.iii.org.tw之IP位址
			}
			//用getByName(www.microsoft.com)之IP位址不同是因為IP位址的分流,用getAllByName
		}catch(UnknownHostException e){
			System.out.println(e.toString());
		}
	}

}
