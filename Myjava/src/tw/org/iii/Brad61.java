package tw.org.iii;
//DataOutputStream�P��write:��r�g�Jfile��,�����P���O����r�p��g�J���x�s�_��(�{�����ܼƭn���x�s�_��)
//�����,data1.dat������refresh,�����G����X�Ӥ���|�O�ýX,���NMyjava�令UTF8,�����ɾ��a,b�|�O�ýX,�S���Y
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Brad61 {

	public static void main(String[] args) {
		int a=1,b=2;String c = "Brad",d = "�굦�|" ;
		try{
			FileOutputStream fout = new FileOutputStream("./dir1/data1.dat");
			DataOutputStream dout = new DataOutputStream(fout);  //������޽u�걵,�~��g�J���a,b�Φr��c,d
			dout.writeInt(a);    //�g�J���
			dout.writeInt(b);    //�g�J���
			dout.writeChars(c);  //�g�J�r��
			dout.writeUTF(d);    //�g�J����r
			dout.flush();      
			dout.close();       //�걵�u�n���@�ӴN�i�H�F(���OOutput,���D��Intput),���ݭnfout�]�n��
		}catch(Exception e){
			System.out.println(e.toString());
		}
		
	}

}
