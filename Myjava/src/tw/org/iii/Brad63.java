package tw.org.iii;
////DataInputStream�P��read:�Nfile������rŪ�X��,�����P���O����r�p��Ū�X(��UTF8)-2
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
//			char c5 = din.readChar(); //���ަ��S��c5,����X�Ӫ����G���OBrad,�|�Ӧr���Ӥw
			String c = din.readUTF();  //�����|�X�{EOFException,�]�����Brad61�g�J�ɥ�writeChars,�YBrad61�令writeUTF,�A�������Y�iŪ�X
			String s1 = din.readUTF(); 
			//�Yint a = din.readInt();int b = din.readInt();String c = din.readUTF();String s1 = din.readUTF();���ǹ��,�L�k����X�ڭ̭n�����G
			din.close();
			//System.out.println("=>" + a +":" + b +":"+ c1 + c2 + c3 + c4 + c5);
			//System.out.println("=>" + a +":" + b +":"+ c1 + c2 + c3 + c4 + ":" + s1);
			System.out.println("=>" + a +":" + b +":"+ c + ":" + s1);
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
}
