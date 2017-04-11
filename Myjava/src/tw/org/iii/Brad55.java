package tw.org.iii;
//讀Excel檔之文字(以逗號分隔)
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Brad55 {

	public static void main(String[] args) {
		File file = new File("./dir1/julie.csv");  //csv檔只能存一張工作表
		try{
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);   //BufferedReader(),括號裡填入物件實體,故建立一個fr物件實體
			System.out.println(br.readLine());   //readLine是BufferedReader的Method Summary,讀取每列的文字
			String temp;
			while((temp = br.readLine()) !=null){  //因為readLine每次只讀一列,所以寫while迴圈讀每一列,直到沒有列,即null,迴圈停止
				System.out.println(temp);
			}
			fr.close();
		}catch(Exception ee){
			System.out.println(ee.toString());
		}
	}
}
