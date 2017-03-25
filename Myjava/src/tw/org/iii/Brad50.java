package tw.org.iii;

public class Brad50 {

	public static void main(String[] args) {
		new Brad471().m1();
	}
}
class Brad471{
	void m1(){
		try{
			System.out.println("do something");
			//throw new Exception();  //方法拋出要對外宣告,如果沒有try{}catch(){}
			//return;   //End不會做到
		}catch(Exception ee){         //因為已用try{}catch(){}處理
			System.out.println("catch");
			return;  ////End不會做到
		}finally{
			System.out.println("OK");   //為何要有finally? 若return後,End不會執行
		}
		System.out.println("end");
	}
}
