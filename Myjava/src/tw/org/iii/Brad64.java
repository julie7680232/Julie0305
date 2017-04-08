package tw.org.iii;
//�Ϥ�   //�F�ѥ\���API
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
			while ((b = fin.read()) !=-1){   //���ɦ��h�j�A�N���X��
				fout.write(b);    
			}
			fin.close();
			fout.flush();
			fout.close();
			System.out.println("Finish");
			
		}catch(Exception e){
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis()-start);
	}

}
