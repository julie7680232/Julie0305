package tw.org.iii;
//FileOutputStream�P��write,flush,�N��r(��@���O���ܼ�)�g�Jfile��
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Brad60 {

	public static void main(String[] args) {
		String data = "OK";                  //���F�o�����PFileOutputStream���غc�������򵲪G,�s�W���r��
		//String data = "Hello,Brad\nLine1\nLine2";
		File outFile = new File("./dir1/brad.txt");  
		//"./dir1/brad.txt"���@�w�n�s�b,�u�n��dir1,�۰ʶi�߷s��(�u��FileOutputStream,�p�G�OFileInputStream�h�|�X�{�ҥ~)

//		try{
//			FileInputStream fin = new FileInputStream(outFile);   
//			fin.close();
//		}catch(Exception e){
//			System.out.println(e.toString());
//		}

	try{
		//FileOutputStream fout = new FileOutputStream(outFile);  
		//��1�۫غc��:�C�����s����{����,���e���檺�{�����G�|�q��rtxt�ɤ��Q�R��,�u�X�{�����s�g�i��r��txt�����
		FileOutputStream fout = new FileOutputStream(outFile,true);  
		//��2�۫غc��:�C���g�i��rtxt�ɪ��F�賣�O�s��,�|�ɦb���e���檺���G�᭱;true��ƦA�������,��Ƹɦb�᭱,�A�X�Φblogo,�b�غc���N�n�M�w�F,�S��k����M�w
		fout.write(data.getBytes());  //�r���নbyte�}�C,�I�s�r���নgetBytes(),�Ҹձ`��
			
		fout.flush();//�u����X�~��,flush�R������,�@�~�t�Τ��O����,�Y�@�~�t�ήį�S���ܦn,�h�ɮ׸�Ʒ|���d�b�@�~�t��
		fout.close();
		}catch(Exception e){
			System.out.println(e.toString());
		}
		
	}

}
