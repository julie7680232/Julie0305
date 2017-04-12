package tw.org.iii;
//認證考試常考,同時序列化與解序,序列化屬性,存屬性
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad68 {
	public static void main(String[] args) {
		Brad613 obj = new Brad613();
		//序列(按照順序一個一個),並列(同時)
		try{
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("./dir1/Brad611"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("OK1");  //若執行後成功印出OK1,看Brad613有沒有實作序列化
		}catch(Exception e){
			System.out.println(e.toString());
		}
		System.out.println("--------------------------------");
		//解序
		try{  //解序列化,只要有序列化一律取消
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("./dir1/Brad611"));
			Brad613 obj2 = (Brad613)oin.readObject();   
			//強制轉型obj2轉成Brad613,obj2在這程式裡面沒有被new出來,沒有經過建構之程序,是從序列化裡面進來的
		}catch(Exception ee){
			System.out.println(ee.toString());
		}
	}
}
class Brad611 implements Serializable{  //阿公  
//因為阿公序列化,所以阿公.爸爸及兒子也會序列化,所以全部都會解序;序列化爸爸,則爸爸及兒子都會序列化,爸爸及兒子都會解序;除非單純序列化兒子,則兒子會解序
//因為implements Serializable Brad611,執行後不會印出任何東西,意指不會印出Brad611.Brad612.Brad613
	Brad611(){System.out.println("Brad611()");}
	
}
class Brad612 extends Brad611 {   //爸爸
	//若implements Serializable Brad612,執行後會印出Brad611
	Brad612(){System.out.println("Brad612()");}
}
class Brad613 extends Brad612 {  //Brad613()需實作序列化否則會丟出例外   //兒子
	//若implements Serializable Brad613,執行後會印出Brad611及Brad612
	Brad613(){System.out.println("Brad613()");}
}
