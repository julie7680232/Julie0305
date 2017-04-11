package tw.org.iii;
//DataInputStream與其read:將file中之文字讀出來,但不同型別之文字如何讀出-1
import java.io.DataInputStream;
import java.io.FileInputStream;

public class Brad62 {

	public static void main(String[] args) {
		try{
			DataInputStream din = new DataInputStream(new FileInputStream("./dir1/data1.dat")); 
			//data1.dat為Brad61寫入之程式
			int a = din.readInt();    //讀入整數
			int b = din.readInt();    //讀入整數
			char c = din.readChar();  //讀入c的第一個字元
			din.close();  //Input不需要flush
			System.out.println("=>" + a +":" + b +":"+ c);
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
}
