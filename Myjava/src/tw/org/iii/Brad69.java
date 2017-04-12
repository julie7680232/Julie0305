package tw.org.iii;
//網際網路InetAddress:認識IP位址
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.URL;

public class Brad69 {

	public static void main(String[] args) {
		//URL url = new URL("http://nnnnn");  //URL網址非主機名稱
		try{
			//1.得知單一主機名稱的IP位址
			InetAddress ip1 = InetAddress.getByName("www.microsoft.com");  //"www.iii.org.tw"為主機名稱,為資策會IP
			System.out.println(ip1.getHostAddress());  //印出IP位址,但有可能與其他人印出之IP位址不同,因為有DNS的分流(流量分開)
			System.out.println("---------------------------------");
			
			//2.得知主機名稱所有之IP位址
			InetAddress ips[] = InetAddress.getAllByName("www.hinet.net"); 
			//****因為InetAddness沒有建構式,所以沒有new,所以使用static方法拿到物件實體*** 
			
			for(InetAddress ip : ips){  //InetAddress ip  指單一IP位址
				System.out.println(ip.getHostAddress());   //會顯現www.iii.org.tw之IP位址
			}
			//用getByName(www.microsoft.com)之IP位址不同是因為IP位址的分流,用getAllByName可得知所有IP位址
		}catch(UnknownHostException e){  //可能拋出不認識主機之例外
			System.out.println(e.toString());
		}
	}

}
