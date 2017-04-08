package tw.org.iii;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;

import org.omg.CORBA_2_3.portable.InputStream;

//網路上圖片
public class Brad80 {

	public static void main(String[] args) {
		
		try{
			URL url = new URL("https://pixabay.com/en/flowers-petals-hepatica-blue-1338211/");
			URLConnection conn = url.openConnection();
			conn.connect();
			InputStream in = conn.getInputStream();
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("./dir2/iii.png"));
			BufferedInputStream bin = new BufferedInputStream(in);
			byte[] buf = new byte[4096]; int len;
			while((len = bin.read(buf)) != -1){
				bout.write(buf,0,len);
			}
			bin.close();
			bout.flush();
			bout.close();
		}catch(Exception e){                  
			System.out.println(e.toString());
		}
	}

}
