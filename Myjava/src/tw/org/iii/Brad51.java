package tw.org.iii; 
import java.io.*;  //package�U�Ҧ�,���]�t��Lpackage,�i�R����Limport java.io....
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
public class Brad51 {
	public static void main(String[] args) {
		//File file = new File("c:/test/brad.txt");   //"\"������r��,�bJVM��/���ؿ��Ÿ�
		File file = new File("./dir1/file1.txt");   //"."
		try{
		FileInputStream fin = new FileInputStream(file);  //API�g�|�ߥX�ҥ~,�ҥH�ϥ�try{}catch(){}
		//int data = fin.read();   //�uŪ�X�ɮפ��Ĥ@��ra
		int temp;                              
		while ((temp = fin.read()) != -1 ){   //�ϥ�while����H�U�|�C         //�]��read�@���u��Ū�X1��byte,�L�kŪ�X����,�W�X1��byte
			System.out.print((char)temp);
		}
    //  System.out.print((char)fin.read());
	//	System.out.print((char)fin.read());
	//	System.out.print((char)fin.read());
	//	System.out.print((char)fin.read());
		
		
	//	while ( (fin.read()) != -1 ){   //  Ū�X���Ȭ�a,�D-1,�G����H�U�ʧ@    
	//		System.out.print((char)fin.read());   //�i�O�b�o�L�Xb
		
		
		fin.close();
	//	}catch(FileNotFoundException ee){
	//		System.out.println(ee.toString());
		}catch(Exception ee){       //��Exception������
			System.out.println(ee.toString());
		}
	//	if(file.exists()){
	//		//System.out.println("OK:" + file.getAbsolutePath());  //�o�X"."����}
	//		System.out.println("OK");
	//	}else{
	//		System.out.println("XX");   //API �W�g�|�ߥX,�]���ORuntimeException�ҥH�i���i����
	//	}
	}

}
