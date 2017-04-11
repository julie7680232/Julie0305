package tw.org.iii;
//DataOutputStream與其write:文字寫入file中,但不同型別之文字如何寫入並儲存起來(程式的變數要能儲存起來)
//執行後,data1.dat須執行refresh,此結果執行出來中文會是亂碼,應將Myjava改成UTF8,但此時整數a,b會是亂碼,沒關係
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Brad61 {

	public static void main(String[] args) {
		int a=1,b=2;String c = "Brad",d = "資策會" ;
		try{
			FileOutputStream fout = new FileOutputStream("./dir1/data1.dat");
			DataOutputStream dout = new DataOutputStream(fout);  //須執行管線串接,才能寫入整數a,b及字串c,d
			dout.writeInt(a);    //寫入整數
			dout.writeInt(b);    //寫入整數
			dout.writeChars(c);  //寫入字串
			dout.writeUTF(d);    //寫入中文字
			dout.flush();      
			dout.close();       //串接只要關一個就可以了(都是Output,除非有Intput),不需要fout也要關
		}catch(Exception e){
			System.out.println(e.toString());
		}
		
	}

}
