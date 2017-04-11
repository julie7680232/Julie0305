package tw.org.iii;
//�ƻs�ɮ�(�Ϥ�)���d��
//1.read  2.write
//����ؤ�k:��k1:�@��Ū�@�Ӽg(Brad64)    
//��k2:����Ū���A�@�_�g(Brad65),�PBrad64�t�b�į�,�]���Φh�@�I�O����Ŷ��ΰ���ʧ@,Brad65�u����@��,��Brad64�]����while�j��(���ɮצ��h�j�N����X��),�ɭP�į���t

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad65 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		File readFile = new File("./dir1/Brad.jpg");
		File saveFile = new File("./dir2/Brad.jpg");
		
		try{
			byte[] b = new byte[(int)readFile.length()];  //���@��byte�}�C,�o���Q�nŪ���ɮפ����e�j�p
			FileInputStream fin = new FileInputStream(readFile);
			fin.read(b);   //Ū�Xb�Ҧ����
			fin.close();
			
			FileOutputStream fout = new FileOutputStream(saveFile);
			fout.write(b);  //b�Ҧ���Ƽg�Jdir2
			fout.flush();   //Output�~�ݭn
			fout.close();
			System.out.println("Finish");
		}catch(Exception e){
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis()-start);  //�o���{������h�[
	}
}
