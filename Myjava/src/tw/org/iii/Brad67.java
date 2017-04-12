package tw.org.iii;
//java物件解序列化回來(ObjectInputStream) :搭配Student類別
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Brad67 {

	public static void main(String[] args) {
		try{
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("./dir1/brad.object"));
			Object obj1 = oin.readObject();   //物件被讀進來
			Object obj2 = oin.readObject();   //物件被讀進來
			oin.close();
			Student s1 = (Student)obj1;   //丟法拉利進來但它 還是車子(Student沒有車子之類別),可以強制轉型 =>打回原形
			Student s2 = (Student)obj2;
			//System.out.println(s1.sum());
			//System.out.println(s1.avg());
			
			System.out.println(s1.getName() + ":" + s1.sum() + ":" + s1.avg());  //因為數學沒有序列化,會少數學分數
			System.out.println(s2.getName() + ":" + s2.sum() + ":" + s2.avg());
		}catch(Exception e){
			System.out.println(e.toString());
		}

	}

}
