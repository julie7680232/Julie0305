package tw.org.iii;
//�ƻs�ɮ�(�Ϥ�)���d��
//1.read  2.write
//����ؤ�k:��k1:�@��Ū�@�Ӽg(Brad64)    ��k2:����Ū���A�@�_�g(Brad65)
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad64 {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();    
		File readFile = new File("./dir1/Brad.jpg");
		File saveFile = new File("./dir2/Brad.jpg");
		
		try{
			FileOutputStream fout = new FileOutputStream(saveFile);
			FileInputStream fin = new FileInputStream(readFile);
			int b;
			while ((b = fin.read()) !=-1){   //��Ū�ɤ�����-1��(�Y�٦���Ʈ�),�NŪ����Ƽg�J��dir2����Ƨ�(���ɦ��h�j�A�N���X��)
				fout.write(b);              
			}
			fin.close();   
			fout.flush();  //�]����output
			fout.close();
			System.out.println("Finish");  //�����Finish�Y�N��S���ߥX�ҥ~
		}catch(Exception e){
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis()-start);  //�o���{������h�[
	}
}
