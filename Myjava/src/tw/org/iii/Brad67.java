package tw.org.iii;
//java����ѧǦC�Ʀ^��(ObjectInputStream) :�f�tStudent���O
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Brad67 {

	public static void main(String[] args) {
		try{
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("./dir1/brad.object"));
			Object obj1 = oin.readObject();   //����QŪ�i��
			Object obj2 = oin.readObject();   //����QŪ�i��
			oin.close();
			Student s1 = (Student)obj1;   //��k�ԧQ�i�Ӧ��� �٬O���l(Student�S�����l�����O),�i�H�j���૬ =>���^���
			Student s2 = (Student)obj2;
			//System.out.println(s1.sum());
			//System.out.println(s1.avg());
			
			System.out.println(s1.getName() + ":" + s1.sum() + ":" + s1.avg());  //�]���ƾǨS���ǦC��,�|�ּƾǤ���
			System.out.println(s2.getName() + ":" + s2.sum() + ":" + s2.avg());
		}catch(Exception e){
			System.out.println(e.toString());
		}

	}

}
