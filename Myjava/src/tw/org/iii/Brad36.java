package tw.org.iii;
public class Brad36 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brad253 b1 = new Brad253();  //執行之順序1.=>2.=>3.=>4.=>5.
}
class Brad251{
	//Brad251(){System.out.println("Brad251()");}
	Brad251(int a){System.out.println("Brad251(int)");}    //3.   //因為有自己的建構式,本是繼承Object有建構式super但因為有自己的建構式
}
class Brad252 extends Brad251{    //因為沒有無傳參數建構式,Brad251可以給一個副類別或Brad252增加新的建構式,此列編譯才會過
	//因為沒有無傳參數建構式,Brad251可以給一個副類別或Brad252增加新的建構式並增加super或this,否則此列編譯不會過
	Brad252(String a){   //不一定給參數int a
		//super();
		super(2);             //子類別存在,主類別一定存在     //2.
		System.out.println("Brad252(String)");    //4.
	}
}
class Brad253 extends Brad252{
	Brad253(){
		super("brad");                   //1.
	System.out.println("Brad253()");    //5.
	}
}