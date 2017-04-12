package tw.org.iii;
/*�ǦC�ƴN�O�N�@�ӹ�H�����A�]�U���ݩʶq�^�O�s�_�ӡA�M��b�A���ɭԦA��o�C
�ǦC�Ƥ�����j�����G�ǦC�ƩM�ϧǦC�ơC�ǦC�ƬO�o�ӹL�{���Ĥ@�����A�N�ƾڤ��Ѧ��r�`�y�A�H�K�s�x�b��󤤩Φb�����W�ǿ�C�ϧǦC�ƴN�O���}�r�`�y�í��c��H�C��H�ǦC�Ƥ��ȭn�N�򥻼ƾ������ഫ���r�`��ܡA�����٭n��_�ƾڡC��_�ƾڭn�D����_�ƾڪ���H���
Serializable��@���ǦC�ƾ���C�ҿקǦC�ơA�N�O��N�O����(Memory)����
���骫��(Object Instance)�H�줸�y(byte stream)�覡�x�s��ä[�C��p
�w�СA���L�{�s�ǦC�ơC�ӥB����]��q�w�Ф��AŪ���Ӫ����O���餤��
�ءA�æ^�_���e���A�C
Java��@����ǦC�ƫD�`²��A�A�u�ݱN�Q�n�ǦC�ƪ�����h��@(implements)
java.io.Serializable�����A��L�ǦC�ƪ��u�@�AJVM�|���A�����A�A�|�o�{�A
Serializable�������S���w�q�����k(Method)�A��ꥦ�O�@��Marker Interface�A
���u�O�i�DJVM������i�H�Q�ǦC��!!
*/
//java����ǦC��(ObjectOutputStream) :�f�tStudent���O
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad66 {

	public static void main(String[] args) {
		Student s1 = new Student("Brad",50,30,24);   //����M���󶡪��t���O�b�ݩ�,��k�O�@�Ϊ�
		Student s2 = new Student("Andy",70,80,94);
		System.out.println(s1.sum());
		System.out.println(s1.avg());
		
		try{
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("./dir1/brad.object"));   
			//�����bObjectOutputStream���]�J�@�Ӫ���,���]�������ɮ�
			//ObjectOutputStream��protected,protected:�ۦPpackage���~�Ӥl���O
			oout.writeObject(s1);  
			//�|��X�ҥ~,���~���ORuntimeException,�ǥͨS����k�ǦC��,�]���ǥ����O��,�S�������i�H�Q�ǦC��,�ҥH�t�ΧP�w�@�ߤ���ǦC��
			//�G�n�b�ǥ����O���[�Jimplements Serializable(�ǦC��),�����O������@�ǦC��,�~�i�H
			oout.writeObject(s2);
			oout.flush();  //�]��Output�~�ݭn,��ĳOutput����
			oout.close();
			System.out.println("OK");   //�ǥͥ[�J�ǦC�Ƥ���,�S���ߥX�ҥ~�N�i�H�L�XOK
		}catch(Exception e){
			System.out.println(e.toString());
		}
		
	}

}
