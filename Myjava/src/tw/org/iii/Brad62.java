package tw.org.iii;
//了解功能及API
import java.io.DataInputStream;
import java.io.FileInputStream;

public class Brad62 {

	public static void main(String[] args) {
		try{
			DataInputStream din = new DataInputStream(new FileInputStream("./dir1/data1.dat"));
			int a = din.readInt();
			int b = din.readInt();
			char c = din.readChar();
			din.close();
			System.out.println("=>" + a +":" + b +":"+ c);
		}catch(Exception e){
			System.out.println(e.toString());
		}

	}

}
