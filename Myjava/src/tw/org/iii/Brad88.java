package tw.org.iii;
//Map後並尋訪key及其value
import java.util.HashMap;
import java.util.Set;
public class Brad88 {

	public static void main(String[] args) {
		HashMap<String,Object> map = new HashMap<>();
		
		map.put("name", "Brad");    //和List比較:Map沒有順序性,關鍵為key
		map.put("weight", 80.5);
		map.put("gender", true);
		
		//Map尋訪key及其value
		//for-each:使用於陣列或is-a Collection
		Set<String> keys = map.keySet();   //方法呼叫
		for(String key : keys){    //尋訪
			System.out.println(key + "=>" + map.get(key));
		}
//		System.out.println(map.get("gender"));   //印出true
//		System.out.println(map);                 //印出{gender=true,name=Brad,weight=80.5}
//		map.put("weight", 70.5);         //put:設定key為什麼值
//		System.out.println(map.get("weight"));   //印出70.5
//		System.out.println(map);                 //印出{gender=true,name=Brad,weight=70.5}
	}
}
