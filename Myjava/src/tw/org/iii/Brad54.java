package tw.org.iii; 
import java.io.*; 
public class Brad54 {
	public static void main(String[] args) {
		File file = new File("./dir1/file1.txt");
		try {
			FileReader reader = new FileReader(file);    //ReaderŪ���O�r��
			int temp;
			while((temp = reader.read()) !=-1){  //��read()��API��Method Summary ��InputStreamReader�o��,��L������,�YInputStreamReader
				System.out.print((char)temp);   //API�W�嫬�O��int,�]���ڭ̭nŪ���r��,�ҥH�j���૬���r��
			}
			reader.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}

//FileInputStream��read() => Ū�@��byte
//Read��InputStreamReader��read() => Ū�@�Ӧr��