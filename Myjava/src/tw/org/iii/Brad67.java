package tw.org.iii;
//�ǦC��  //�F�ѥ\���API
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Brad67 {

	public static void main(String[] args) {
		try{
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("./dir1/brad.object"));
			Object obj1 = oin.readObject();
			Object obj2 = oin.readObject();
			oin.close();
			Student s1 = (Student)obj1;
			Student s2 = (Student)obj2;
			System.out.println(s1.getName() + s1.sum() + ":" + s1.avg());  //�]���ƾǨS���ǦC��,�|�ּƾǤ���
			System.out.println(s1.getName() + s2.sum() + ":" + s2.avg());
		}catch(Exception e){
			System.out.println(e.toString());
		}

	}

}
