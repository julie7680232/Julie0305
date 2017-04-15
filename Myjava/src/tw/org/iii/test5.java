package tw.org.iii;

import java.util.HashSet;
import java.util.Set;

public class test5 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		Integer i1 = 45;
		Integer i2 = 46;
		set.add(i1);
		set.add(i1);
		set.add(i2);System.out.println(set.size()+"");
		set.remove(i1);System.out.println(set.size()+"");
		i2=47;
		set.remove(i2);System.out.println(set.size()+"");
		
		

	}

}
