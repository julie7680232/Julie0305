package tw.org.iii;

import java.util.HashSet;
import java.util.TreeSet;

public class Brad86 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(1);
		HashSet set2 = new HashSet();
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set.addAll(set2);
		System.out.println(set); //set.size();第一層集合是兩個,為1及set2,但共4個元素

	}

}
