package tw.org.iii;
//建立Student類別執行序列化(搭配Brad66及67)
import java.io.Serializable;

public class Student implements Serializable{  //實作序列化
	private int ch;
	private transient  int math;   //數學成績不打算序列化,執行後Brad66會得出s1總成績為104,但Brad67回得出s1總成績為74因為數學成績被解序列化,會變成數學成績為初始值0
	private int eng;
	private String name;
	private Car car;     //1.增加Car
	public Student(String name,int ch,int math,int eng){
		this.name = name; this.ch = ch; this.math = math; this.eng = eng;
		car = new Car();  //2.建構Car
	}
	String getName(){return name;}   //class String有序列化,所以可以執行,只要是物件都必須序列化,基本型別沒關係
	double sum(){return ch+math+eng;}
	double avg(){return sum()/3;}
}
class Car implements Serializable{   //3.建立類別Car,做這三步驟會發現車子因為沒有序列化,無法執行
	          //只要是物件都要宣告時作序列化,基本型別沒關係,否則會編譯錯誤  
}