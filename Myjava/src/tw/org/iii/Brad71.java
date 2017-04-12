package tw.org.iii;
//網際網路UDP接收端:此程式執行時,要等候一下
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Brad71 {

	public static void main(String[] args) {
	while (true){  //無窮迴圈,指可以一直收到封包,不會只收到一次
		byte[] buf = new byte[1024];  //自己決定傳送之大小
		try{
			DatagramSocket socket = new DatagramSocket(8888);  //DatagramSocket數據插座;發送端與接收端port要相同
			DatagramPacket packet = new DatagramPacket(buf, buf.length);  //DatagramPacket數據封包 ;接收封包不會指定IP位址;DatagramPacket(byte[] buf, int length)
			socket.receive(packet);  //由插座從使用者那裏收到封包
			socket.close();  //和io觀念一樣,有開有關
			//System.out.println("Receive OK:"+ packet.getAddress().getHostAddress());  //有收到會印出並得知誰封包寄給我
			
			//知道收到什麼封包
			int len = packet.getLength();      //知道封包大小
			byte[] rdata = packet.getData();   //建立byte陣列放入封包中之資料
			String urip = packet.getAddress().getHostAddress();   //得到封包來源之IP位址
			System.out.println(urip + "=>" + new String(rdata,0,len));  
			// new String(rdata,0,len)為字串建構式,String(byte[] bytes, int offset, int length)=String(資料,字串起始長度(及初始值),字串長度)
			
		}catch(Exception e){
			System.out.println(e.toString());
		}
		}
	}
}
