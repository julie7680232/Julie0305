package tw.org.iii;
//�إ�Student���O����ǦC��(�f�tBrad66��67)
import java.io.Serializable;

public class Student implements Serializable{  //��@�ǦC��
	private int ch;
	private transient  int math;   //�ƾǦ��Z������ǦC��,�����Brad66�|�o�Xs1�`���Z��104,��Brad67�^�o�Xs1�`���Z��74�]���ƾǦ��Z�Q�ѧǦC��,�|�ܦ��ƾǦ��Z����l��0
	private int eng;
	private String name;
	private Car car;     //1.�W�[Car
	public Student(String name,int ch,int math,int eng){
		this.name = name; this.ch = ch; this.math = math; this.eng = eng;
		car = new Car();  //2.�غcCar
	}
	String getName(){return name;}   //class String���ǦC��,�ҥH�i�H����,�u�n�O���󳣥����ǦC��,�򥻫��O�S���Y
	double sum(){return ch+math+eng;}
	double avg(){return sum()/3;}
}
class Car implements Serializable{   //3.�إ����OCar,���o�T�B�J�|�o�{���l�]���S���ǦC��,�L�k����
	          //�u�n�O���󳣭n�ŧi�ɧ@�ǦC��,�򥻫��O�S���Y,�_�h�|�sĶ���~  
}