package tw.org.iii;
//�F�ѥ\���API����UTF8
import java.io.DataInputStream;
import java.io.FileInputStream;

public class Brad63 {

	public static void main(String[] args) {
		try{
			DataInputStream din = new DataInputStream(new FileInputStream("./dir1/data1.dat"));
			int a = din.readInt();
			int b = din.readInt();
//			char c1 = din.readChar();  //�@�Ӥ@�Ӧr���h�B�z
//			char c2 = din.readChar();
//			char c3 = din.readChar();
//			char c4 = din.readChar();
			String c = din.readUTF();
			String s1 = din.readUTF();
			din.close();
			System.out.println("=>" + a +":" + b +":"+ c + ":" + s1);
		}catch(Exception e){
			System.out.println(e.toString());
		}

	}

}
