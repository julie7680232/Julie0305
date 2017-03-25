package tw.org.iii;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Brad55 {

	public static void main(String[] args) {
		File file = new File("./dir1/julie.csv");
		try{
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
			String temp;
			while((temp = br.readLine()) !=null){
				System.out.println(temp);
			}
			fr.close();
		}catch(Exception ee){
			System.out.println(ee.toString());
		}
	}
}
