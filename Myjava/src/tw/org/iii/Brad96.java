package tw.org.iii;
//Brad88:如果是HashMap<K,V>物件會印出前一個放入物件之東西,return前一個key的值 =>看API
import java.util.HashMap;
import java.util.Set;
public class Brad96 {

	public static void main(String[] args) {
		HashMap<String,Object> map = new HashMap<>();
		Object o1 =map.put("name", "Brad");
		System.out.println((String)o1);          //印出null ; 沒有string也沒關係,因為String有toString   
		
		Object o2 =map.put("name", "Brad1");
		System.out.println((String)o2);          //印出Brad ; 沒有string也沒關係,因為String有toString
		
		Object o3 =map.put("name", "Brad2");
		System.out.println((String)o3);          //印出Brad1 ; 沒有string也沒關係,因為String有toString
	}
}
