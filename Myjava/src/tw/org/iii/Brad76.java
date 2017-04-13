package tw.org.iii;
import java.io.BufferedReader;
/*網際網路TCP接收端(ServerSocket.InputStream改成InputStreamReader及BufferedReader)-2-2(與Brad75不同的是,印出來的字,是讀取一整列,可以讀取中文):
與Brad74對應,知道對方願意和我講話並且接收他發送過來之資料(步驟1~2即可接收資料,步驟3~4接送到的資料進行讀取並印出來)
*/
//玩的是Socket對Socket
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad76 {

	public static void main(String[] args) {
		try{  //port被占用會拋出例外IOException
			ServerSocket server= new ServerSocket(8888);   //指定你想聽哪個port,本機端的
			Socket socket = server.accept();   //一旦傳遞成功,Socket會被傳遞回來,即return socket(回傳socket物件實體),此時兩邊(Brad72)的溝通機制會變成socket對socket
			
			System.out.println(socket.getInetAddress().getHostAddress());  //印出發送過來之IP位址
			//可以讀取中文,不只一個字元一個字元讀取,直接讀取一整列
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));  //BufferedReader僅適用在文字資料
			int i ; String line;
			while ( (line = reader.readLine()) != null){
				System.out.println(line);
			}
			reader.close();

//			InputStream in = socket.getInputStream();  //1 //InputStream為抽象,沒有建構物件實體
//			int i;                                   //3
//			while ((i = in.read()) != -1){  //read(byte[] b)為int型別,讀byte陣列,一次讀一個字元,若是中文,要改一下程式    //4
//				System.out.print((char)i);
//			}
//			in.close();                     //2
			
			server.close();
		}catch(Exception e){                  
			System.out.println(e.toString());
		}
	}
}
