package tw.org.iii;
//set放入不同型別-1
import java.util.HashSet;
import java.util.TreeSet;

public class Brad84 {

	public static void main(String[] args) {
		//HashSet set = new HashSet();
		//TreeSet set = new TreeSet();   //會得出set依順序排列
		TreeSet<Integer> set = new TreeSet<>();   //會得出set依順序排列
		
//1.		
//		int i=0;
//		while(set.size()<6){   //洗牌
//			set.add((int)(Math.random()*52+1));
//			i++;
//		}
//		System.out.println(set);  //效率不見得比當初洗牌程是好,速度不見得比較快
//		System.out.println(i);  //知道while迴圈跑了幾次

//2.
//		set.add(1200000);
//		set.add(1200000);
//		set.add(1200000);
//		set.add(12.3);
//		set.add(56);
//		set.add(12.3);
//		set.add("Brad");
//		set.add(12.3);   //不管多少12.3,執行出來還是只有一個12.3
//		System.out.println(set);  //set沒有原來程式的順序性,但執行時,有自己的順序性
//		//將每一個元素拿出來:通通視為物件,toString,執行出來不會重複

		set.add(12); //=>auto-boxing  
		set.add(56);
		byte a = 13;  
		set.add(a);  //byte => int => Integer ,轉型無法一次性,除非改成set.add((int)a)才可以
		//set.add("78");  //因為TreeSet已宣告裡面只能放整數,故無法編譯
		System.out.println(set);   //字串"78"無法排序,所以會拋出例外ClassCastException
	}
}
