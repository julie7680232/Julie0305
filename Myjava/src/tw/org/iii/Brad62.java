package tw.org.iii;
//DataInputStream�P��read:�Nfile������rŪ�X��,�����P���O����r�p��Ū�X-1
import java.io.DataInputStream;
import java.io.FileInputStream;

public class Brad62 {

	public static void main(String[] args) {
		try{
			DataInputStream din = new DataInputStream(new FileInputStream("./dir1/data1.dat")); 
			//data1.dat��Brad61�g�J���{��
			int a = din.readInt();    //Ū�J���
			int b = din.readInt();    //Ū�J���
			char c = din.readChar();  //Ū�Jc���Ĥ@�Ӧr��
			din.close();  //Input���ݭnflush
			System.out.println("=>" + a +":" + b +":"+ c);
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
}
