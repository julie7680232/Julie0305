package tw.org.iii;
//Brad88:�p�G�OHashMap<K,V>����|�L�X�e�@�ө�J���󤧪F��,return�e�@��key���� =>��API
import java.util.HashMap;
import java.util.Set;
public class Brad96 {

	public static void main(String[] args) {
		HashMap<String,Object> map = new HashMap<>();
		Object o1 =map.put("name", "Brad");
		System.out.println((String)o1);          //�L�Xnull ; �S��string�]�S���Y,�]��String��toString   
		
		Object o2 =map.put("name", "Brad1");
		System.out.println((String)o2);          //�L�XBrad ; �S��string�]�S���Y,�]��String��toString
		
		Object o3 =map.put("name", "Brad2");
		System.out.println((String)o3);          //�L�XBrad1 ; �S��string�]�S���Y,�]��String��toString
	}
}
