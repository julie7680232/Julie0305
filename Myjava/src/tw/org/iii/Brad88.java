package tw.org.iii;
//Map後並尋訪key及其value
import java.util.HashMap;
import java.util.Set;
public class Brad88 {

	public static void main(String[] args) {
		HashMap<String,Object> map = new HashMap<>();
		
		map.put("name", "Brad");    //沒有順序性,關鍵為key
		map.put("weight", 80.5);
		map.put("gender", true);
		
		//Map尋訪key及其value
		Set<String> keys = map.keySet();   //方法呼叫
		for(String key : keys){    //尋訪
			System.out.println(key + "=>" + map.get(key));
		}
//		System.out.println(map.get("gender"));
//		System.out.println(map);
//		map.put("weight", 70.5);
//		System.out.println(map.get("weight"));
//		System.out.println(map);
	}
}
