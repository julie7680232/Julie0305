package tw.org.iii;
//Map��ôM�Xkey�Ψ�value
import java.util.HashMap;
import java.util.Set;
public class Brad88 {

	public static void main(String[] args) {
		HashMap<String,Object> map = new HashMap<>();
		
		map.put("name", "Brad");    //�MList���:Map�S�����ǩ�,���䬰key
		map.put("weight", 80.5);
		map.put("gender", true);
		
		//Map�M�Xkey�Ψ�value
		//for-each:�ϥΩ�}�C��is-a Collection
		Set<String> keys = map.keySet();   //��k�I�s
		for(String key : keys){    //�M�X
			System.out.println(key + "=>" + map.get(key));
		}
//		System.out.println(map.get("gender"));   //�L�Xtrue
//		System.out.println(map);                 //�L�X{gender=true,name=Brad,weight=80.5}
//		map.put("weight", 70.5);         //put:�]�wkey�������
//		System.out.println(map.get("weight"));   //�L�X70.5
//		System.out.println(map);                 //�L�X{gender=true,name=Brad,weight=70.5}
	}
}
