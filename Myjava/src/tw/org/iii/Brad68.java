package tw.org.iii;
//�{�ҦҸձ`��,�ǦC�ƻP�ѧ�
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad68 {
	public static void main(String[] args) {
		Brad613 obj = new Brad613();
		//�ǦC(���Ӷ��Ǥ@�Ӥ@��),�æC(�P��)
		try{
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("./dir1/Brad611"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("OK1");
		}catch(Exception e){
			System.out.println(e.toString());
		}
		System.out.println("--------------------------------");
		//�ѧ�
		try{  //�ѧǦC��,�u�n���ǦC�Ƥ@�ߨ���
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("./dir1/Brad611"));
			Brad613 obj2 = (Brad613)oin.readObject();
		}catch(Exception ee){
			System.out.println(ee.toString());
		}
	}
}
class Brad611 implements Serializable{  //����  
//�]�������ǦC��,�ҥH����.�����Ψ�l�]�|�ǦC��,�ҥH�������|�ѧ�;���D��§ǦC�ƨ�l,�h��l�|�ѧ�;�ǦC�ƪ���,�h�����Ψ�l���|�ǦC��,�����Ψ�l���|�ѧ�
	Brad611(){System.out.println("Brad611()");}
	
}
class Brad612 extends Brad611 {   //����
	Brad612(){System.out.println("Brad612()");}
}
class Brad613 extends Brad612 {  //Brad613()�ݹ�@�ǦC�Ƨ_�h�|��X�ҥ~   //��l
	Brad613(){System.out.println("Brad613()");}
}
