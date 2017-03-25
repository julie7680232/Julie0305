package tw.org.iii; 
import java.io.*; 
public class Brad54 {
	public static void main(String[] args) {
		File file = new File("./dir1/file1.txt");
		try {
			FileReader reader = new FileReader(file);    //ReaderÅªªº¬O¦r¤¸
			int temp;
			while((temp = reader.read()) !=-1){
				System.out.print((char)temp);
			}
			reader.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	
	}

}
