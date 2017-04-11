package tw.org.iii;
////DataInputStream與其read:將file中之文字讀出來,但不同型別之文字如何讀出(轉UTF8)-2
import java.io.DataInputStream;
import java.io.FileInputStream;

public class Brad63 {

	public static void main(String[] args) {
		try{
			DataInputStream din = new DataInputStream(new FileInputStream("./dir1/data1.dat"));
			int a = din.readInt();
			int b = din.readInt();
//			char c1 = din.readChar();  //一個一個字元去處理
//			char c2 = din.readChar();
//			char c3 = din.readChar();
//			char c4 = din.readChar();
//			char c5 = din.readChar(); //不管有沒有c5,執行出來的結果都是Brad,四個字元而已
			String c = din.readUTF();  //執行後會出現EOFException,因為當初Brad61寫入時用writeChars,若Brad61改成writeUTF,再次執行後即可讀出
			String s1 = din.readUTF(); 
			//若int a = din.readInt();int b = din.readInt();String c = din.readUTF();String s1 = din.readUTF();順序對調,無法執行出我們要的結果
			din.close();
			//System.out.println("=>" + a +":" + b +":"+ c1 + c2 + c3 + c4 + c5);
			//System.out.println("=>" + a +":" + b +":"+ c1 + c2 + c3 + c4 + ":" + s1);
			System.out.println("=>" + a +":" + b +":"+ c + ":" + s1);
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
}
