package tw.org.iii;
//fixed(13~18)
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Brad60 {

	public static void main(String[] args) {
		String data = "OK";
		File outFile = new File("./dir1/brad.txt");  //"./dir1/brad.txt"���@�w�n�s�b,�u�n��dir1,�۰ʶi�߷s��(�u��output)
//		try{
//		FileInputStream fin = new FileInputStream(outFile);
//		fin.close();
//		}catch(Exception e){
//		System.out.println(e.toString());
//		}

	try{
			FileOutputStream fout = new FileOutputStream(outFile,true);  //true��ƦA�������,��Ƹɦb�᭱,�A�X�Φblogo,�b�غc���N�n�M�w�F,�S��k����M�w
			fout.write(data.getBytes());  //�r���নbyte�}�C,�I�s�r���নgetBytes()
			fout.flush();//�u����X�~��,flush�R������,�@�~�t�Τ��O����,�Y�@�~�t�ήį�S���ܦn,�h�ɮ׸�Ʒ|���d�b�@�~�t��
			fout.close();
		}catch(Exception e){
			System.out.println(e.toString());
		}
		
	}

}
