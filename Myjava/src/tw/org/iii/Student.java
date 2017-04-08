package tw.org.iii;

import java.io.Serializable;

public class Student implements Serializable{  //實作序列化
	private int ch;
	private transient  int math;   //不打算序列化
	private int eng;
	private String name;
	private Car car;
	public Student(String name,int ch,int math,int eng){
		this.name = name; this.ch = ch; this.math = math; this.eng = eng;
		car = new Car();
	}
	String getName(){return name;}
	double sum(){return ch+math+eng;}
	double avg(){return sum()/3;}
}
class Car implements Serializable{  //只要是物件都要宣告時作序列化,基本型別沒關係,否則會編譯錯誤
	
}
