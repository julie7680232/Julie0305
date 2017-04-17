package tw.org.iii;
//set放入不同型別-2
import java.util.TreeSet;

public class Brad85 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();   //會得出set依順序排列
		set.add("1");
		set.add("2");
		set.add("12");
		System.out.println(set);  //字串字元是排序判斷是一個字元一個字元判斷,會印出[1,12,2]
		
		for(String obj:set){   //因為有泛型:定義字串=>TreeSet<String>
			System.out.println(obj);
		}
	}

}
