package tw.org.iii;
//ŪExcel�ɤ���r(�H�r�����j)
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Brad55 {

	public static void main(String[] args) {
		File file = new File("./dir1/julie.csv");  //csv�ɥu��s�@�i�u�@��
		try{
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);   //BufferedReader(),�A���̶�J�������,�G�إߤ@��fr�������
			System.out.println(br.readLine());   //readLine�OBufferedReader��Method Summary,Ū���C�C����r
			String temp;
			while((temp = br.readLine()) !=null){  //�]��readLine�C���uŪ�@�C,�ҥH�gwhile�j��Ū�C�@�C,����S���C,�Ynull,�j�鰱��
				System.out.println(temp);
			}
			fr.close();
		}catch(Exception ee){
			System.out.println(ee.toString());
		}
	}
}
