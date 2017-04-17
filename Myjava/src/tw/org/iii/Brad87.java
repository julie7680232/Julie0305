package tw.org.iii;

import java.util.LinkedList;

public class Brad87 {

	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<>(); //泛型String
		
//		list1.add(0,"A");   //集合為[A,B,C],想抽出變CBA
//		list1.add(0,"B");
//		list1.add(0,"C");
//		//list1.add(0,"C");  //0代表第一個順序,1代表第二個順序,2代表第三個順序,3會編譯失敗; index <= list1.size(),
//		System.out.println(list1);
//		System.out.println(list1.get(0));  //取出第0個元素 ; 不需轉型,因為List有順序性,沒順序性只能尋訪他
		
		list1.add("A");  
		list1.add("B");
		list1.add("C");
		list1.add("B");
		System.out.println(list1);  //印出[A,B,C,B]
		list1.remove("B");
		System.out.println(list1);  //砍掉第一個"B" ; 印出[A,C,B]
		list1.remove("B");
		System.out.println(list1);  //印出[A,C]
		list1.remove("B");
		System.out.println(list1);  //不會拋出例外,只是砍不到B,會印出[A,C]
	}

}
