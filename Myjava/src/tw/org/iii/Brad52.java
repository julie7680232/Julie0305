package tw.org.iii; 
import java.io.*;  //package�U�Ҧ�,���]�t��Lpackage,�i�R����Limport java.io....
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
public class Brad52 {
	public static void main(String[] args) {
		//File file = new File("c:/test/brad.txt");   //"\"������r��,�bJVM��/���ؿ��Ÿ�
		File file = new File("./dir1/file1.txt");   //"."
		try{
		FileInputStream fin = new FileInputStream(file);  //API�g�|�ߥX�ҥ~,�ҥH�ϥ�try{}catch(){}
		//int data = fin.read();   //�uŪ�X�ɮפ��Ĥ@��ra
		byte[] buf = new byte[3];     //�]��UTF8��3,�Y����r�e��a,���D�٬O�s�b
		// �b UTF-8 ���s�X�A�@�Ӥ��� 3 bytes;big5 �@�Ӥ���� 2 byte, ���P���s�X�A���媺���פ��P

		int len;                        
		while ((len = fin.read(buf)) != -1 ){     
			System.out.print(new String(buf,0,len));   //�r��i�HŪchar��byte
		}
		fin.close();
	
		}catch(Exception ee){       
			System.out.println(ee.toString());
		}
	
	}

}
