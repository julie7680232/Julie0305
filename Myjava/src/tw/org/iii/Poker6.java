package tw.org.iii;

import java.util.Collections;
import java.util.LinkedList;

public class Poker6 {//

	public static void main(String[] args) {
		LinkedList<Integer> poker = new LinkedList<>();
		for (int i=1; i<=49; i++) poker.add(i);
		Collections.shuffle(poker);
		for(int i=0;i<6;i++){
			System.out.println(poker.get(i));
		}

	}

}
