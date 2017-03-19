package tw.org.iii;

public class Brad40 {

	public static void main(String[] args) {

	}

}
class Brad281{
	Brad283 m1(){return new Brad283();} 
	String m2(){return "";}
}
class Brad282 extends Brad281{
	Brad284 m1(){return new Brad284();}  //型別不能int m1(){return 1;},要void
	                     //爸爸要發揚光大到兒子,所以存取修飾字(1.public 2.protected 3.沒有  4.private)
	                     //不能比他小,基本上存取修飾字是private,建構式一定自己寫
}
class  Brad283{}
class Brad284 extends Brad283{}