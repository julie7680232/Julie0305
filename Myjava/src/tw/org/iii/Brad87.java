package tw.org.iii;

import java.util.LinkedList;

public class Brad87 {

	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<>(); //�x��String
		
//		list1.add(0,"A");   //���X��[A,B,C],�Q��X��CBA
//		list1.add(0,"B");
//		list1.add(0,"C");
//		//list1.add(0,"C");  //0�N��Ĥ@�Ӷ���,1�N��ĤG�Ӷ���,2�N��ĤT�Ӷ���,3�|�sĶ����; index <= list1.size(),
//		System.out.println(list1);
//		System.out.println(list1.get(0));  //���X��0�Ӥ��� ; �����૬,�]��List�����ǩ�,�S���ǩʥu��M�X�L
		
		list1.add("A");  
		list1.add("B");
		list1.add("C");
		list1.add("B");
		System.out.println(list1);
		list1.remove("B");
		System.out.println(list1);  //�屼�Ĥ@��"B"
		list1.remove("B");
		System.out.println(list1);
		list1.remove("B");
		System.out.println(list1);
	}

}
