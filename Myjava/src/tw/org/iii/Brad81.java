package tw.org.iii;
//子介面
public class Brad81 {
	public static void main(String[] args) {
	}

}

interface Brad701{
	public void m1();  //對外宣告
} 
interface Brad702 extends Brad701{  //因為介面不可能有實作,所以不可能有implements,但是可以有繼承
	public void m2();
}
interface Brad703 extends Brad701{  //因為介面不可能有實作,所以不可能有implements,但是可以有繼承,此為子介面
	//public void m1();  //因為Brad701有m1,所以定義宣告都一樣(寫的跟爸爸一樣),所以沒差(有寫沒寫是一樣的),有差是第17列,有差是在實作
	public void int m1();   //因為第25列有實作,不知道要做第17列還是第10列
	public void m1(int a);
	public void m3();
}
interface Brad704 extends Brad701,Brad702{  //因為介面不可能有實作,所以不可能有implements,但是可以有繼承,而且可以繼成多個,但類別只能一個繼承
	public void m2();                         //介面沒有override
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
	public void m1(){}  //override,所以傳回子型別void,繼承爸爸要發揚光大public                     
}
