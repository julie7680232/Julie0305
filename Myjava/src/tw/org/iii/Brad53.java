package tw.org.iii; 
import java.io.*;  //package�U�Ҧ�,���]�t��Lpackage,�i�R����Limport java.io....
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
public class Brad53 {
	public static void main(String[] args) {
		File file = new File("./dir1/file1.txt");
		try{
			FileInputStream fin = new FileInputStream(file); 
		byte[] buf = new byte[(int)file.length()];     //���I:�e�O����,�p��w���h�j
		                                          //�}�C�S��long,�u�n�j���૬,�u��Ū2G�����ɮ�,�Y�Q�A�h,�g�j��
		int len= fin.read(buf);                        
		System.out.println(new String(buf,0,len));
		fin.close();
	
		}catch(Exception ee){       
			System.out.println(ee.toString());
		}
	
	}

}
