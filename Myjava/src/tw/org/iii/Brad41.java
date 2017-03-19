package tw.org.iii;

public class Brad41 {//

	public static void main(String[] args) {
	}
}
interface Brad291{
	void m1();      //都是public void m1(),只是省略
	abstract void m2();  
	  //介面中不會有實作,定義之方法永遠都是抽象方法,沒寫abstract;void m3(){}編譯不會過
}
class Brad292 implements Brad291{    //實作Brad291介面
	public void m1(){}               //要有public void m1(),編譯才會過
	public void m2(){}
}
abstract class Brad293 implements Brad291{   
	public void m1(){}              
}