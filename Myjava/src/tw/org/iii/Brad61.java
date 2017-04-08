package tw.org.iii;
//了解功能及API
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Brad61 {

	public static void main(String[] args) {
		int a=1,b=2;String c = "Brad",d = "資策會" ;
		try{
			FileOutputStream fout = new FileOutputStream("./dir1/data1.dat");
			DataOutputStream dout = new DataOutputStream(fout);
			dout.writeInt(a);
			dout.writeInt(b);
			dout.writeChars(c);
			dout.writeUTF(d);
			dout.flush();
			dout.close();
		}catch(Exception e){
			System.out.println(e.toString());
		}
		
	}

}
