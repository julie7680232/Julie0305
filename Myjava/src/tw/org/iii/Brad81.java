package tw.org.iii;
//�l����
public class Brad81 {
	public static void main(String[] args) {
	}

}

interface Brad701{
	public void m1();  //��~�ŧi
} 
interface Brad702 extends Brad701{  //�]���������i�঳��@,�ҥH���i�঳implements,���O�i�H���~��
	public void m2();
}
interface Brad703 extends Brad701{  //�]���������i�঳��@,�ҥH���i�঳implements,���O�i�H���~��,�����l����
	//public void m1();  //�]��Brad701��m1,�ҥH�w�q�ŧi���@��(�g���򪨪��@��),�ҥH�S�t(���g�S�g�O�@�˪�),���t�O��17�C,���t�O�b��@
	public void int m1();   //�]����25�C����@,�����D�n����17�C�٬O��10�C
	public void m1(int a);
	public void m3();
}
interface Brad704 extends Brad701,Brad702{  //�]���������i�঳��@,�ҥH���i�঳implements,���O�i�H���~��,�ӥB�i�H�~���h��,�����O�u��@���~��
	public void m2();                         //�����S��override
}
class Brad705 implements Brad703{
	public void m1(){}
	public void m1(int a){}
	public void m3(){}
}
class Brad706 implements Brad704{
	public void m1(){}
	public void m2(){}
	public void m3(){}
	
}
class Brad707 extends Brad705{  
	public void m1(){}  //override,�ҥH�Ǧ^�l���Ovoid,�~�Ӫ����n�o�����jpublic                     
}
