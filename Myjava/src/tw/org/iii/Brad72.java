package tw.org.iii;
//網際網路TCP發送端(Socket)-1:與Brad73對應,知道網際網路上有誰願意和我對話,還沒傳送任何資料
import java.io.OutputStream;
//網際網路TCP發送
import java.net.InetAddress;
import java.net.Socket;

public class Brad72 {
	public static void main(String[] args) {
		//for(int i=0; i<65536; i++){  //1.檢查所有的port,看誰願意和我講話  
		//for(int i=130; i<140; i++){  //1.檢查130到139的port,看誰願意和我講話  
			try{ //別人不願意講話會拋出例外
				Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),7777);
				//Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),i);  //2.試探對方是否和我講話,TCP:一旦對方和你講話稱3方交握;建構式Socket(InetAddress address, int port)
				//System.out.println("port:"+ i); //3.i範圍的人願意跟我講話的,都會顯示出來=>設定for迴圈
				socket.close();
			}catch(Exception e){                  //不能任意掃別人的code,是違法的
				System.out.println(e.toString());
				}
		//}   //4.
	}

}
