package tw.org.iii;
//set��J���P���O-2
import java.util.TreeSet;

public class Brad85 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();   //�|�o�Xset�̶��ǱƦC
		set.add("1");
		set.add("2");
		set.add("12");
		System.out.println(set);  //�r��r���O�ƧǧP�_�O�@�Ӧr���@�Ӧr���P�_,�|�L�X[1,12,2]
		
		for(String obj:set){   //�]�����x��:�w�q�r��=>TreeSet<String>
			System.out.println(obj);
		}
	}

}
