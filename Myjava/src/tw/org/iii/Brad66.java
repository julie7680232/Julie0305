package tw.org.iii;
/*序列化就是將一個對象的狀態（各個屬性量）保存起來，然後在適當的時候再獲得。
序列化分為兩大部分：序列化和反序列化。序列化是這個過程的第一部分，將數據分解成字節流，以便存儲在文件中或在網絡上傳輸。反序列化就是打開字節流並重構對象。對象序列化不僅要將基本數據類型轉換成字節表示，有時還要恢復數據。恢復數據要求有恢復數據的對象實例
Serializable實作此序列化機制。所謂序列化，就是能將記憶體(Memory)中的
實體物件(Object Instance)以位元流(byte stream)方式儲存於永久媒體如
硬碟，此過程叫序列化。而且之後也能從硬碟中再讀取該物件於記憶體中重
建，並回復先前狀態。
Java實作物件序列化非常簡單，你只需將想要序列化的物件去實作(implements)
java.io.Serializable介面，其他序列化的工作，JVM會幫你完成，你會發現，
Serializable介面中沒有定義任何方法(Method)，其實它是一個Marker Interface，
它只是告訴JVM此物件可以被序列化!!
*/
//java物件序列化(ObjectOutputStream) :搭配Student類別
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad66 {

	public static void main(String[] args) {
		Student s1 = new Student("Brad",50,30,24);   //物件和物件間的差異是在屬性,方法是共用的
		Student s2 = new Student("Andy",70,80,94);
		System.out.println(s1.sum());
		System.out.println(s1.avg());
		
		try{
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("./dir1/brad.object"));   
			//直接在ObjectOutputStream中包入一個物件,此包的物件為檔案
			//ObjectOutputStream為protected,protected:相同package及繼承子類別
			oout.writeObject(s1);  
			//會丟出例外,此外不是RuntimeException,學生沒有辦法序列化,因為學生類別時,沒有說它可以被序列化,所以系統判定一律不能序列化
			//故要在學生類別中加入implements Serializable(序列化),該類別必須實作序列化,才可以
			oout.writeObject(s2);
			oout.flush();  //因為Output才需要,建議Output都有
			oout.close();
			System.out.println("OK");   //學生加入序列化之後,沒有拋出例外就可以印出OK
		}catch(Exception e){
			System.out.println(e.toString());
		}
		
	}

}
