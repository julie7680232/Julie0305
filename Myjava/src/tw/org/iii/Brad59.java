package tw.org.iii;
//P48解釋-4
public class Brad59 {

	public static void main(String[] args) {
		//sayYa1();  //會編譯錯誤,因為第9列寫說至少呼叫一個
		//sayYa1("Brad","Peter","Andy","Mary");
		sayYa1(3,"A","B");  //改name1之型別,由String改成int
	}

	static void sayYa1(int name1,String...names){   //至少呼叫一個   //只能有一個不定參數,適合用在移動多個檔案
		//name => String[]
		System.out.println("OK");
	}
}
