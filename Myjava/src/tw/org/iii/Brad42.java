package tw.org.iii;

public class Brad42 {

	public static void main(String[] args) {
		Shape s1 = new TriShape(3,4,5,4);
		Shape s2 = new SquShape(4);
		m1(s2);
		s1.isTriShape();
	}
	
	static void m1(Shape s){
		System.out.println(s.calArea());
	}  //定義方法印出正方型面積或三角形面積
}
interface Shape {
	double calLength();    //介面是抽象的
	double calArea();
	
}
class TriShape implements Shape{
	private double s1,s2,s3,h1; 
	TriShape (double s1,double s2,double s3,double h1){
		this.s1=s1;this.s2=s2;this.s3=s3;this.h1=h1;
	}
	//void setS1(double s1){this.s1=s1}  //可自行訂一個三角形,可伸縮自如
	public double calLength(){
		return s1+s2+s3;
		}
	public double calArea(){
		return s1*h1/2;
		}
	public boolean isTriShape(){
		return true;
	}
	
} 
class SquShape implements Shape{
	private double s; 
	SquShape (double s){
		this.s=s;
	}
	public double calLength(){
		return s*4;
		}
	public double calArea(){
		return s*s;
		};
	
} 