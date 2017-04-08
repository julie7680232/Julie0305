package tw.org.iii;
//序列化  //了解功能及API
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Brad66 {

	public static void main(String[] args) {
		Student s1 = new Student("Brad",50,30,24);
		Student s2 = new Student("Andy",70,80,94);
		System.out.println(s1.sum());
		System.out.println(s1.avg());
		
		try{
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("./dir1/brad.object"));
			oout.writeObject(s1);
			oout.writeObject(s2);
			oout.flush();
			oout.close();
			System.out.println("OK");
		}catch(Exception e){
			System.out.println(e.toString());
		}
		
	}

}
