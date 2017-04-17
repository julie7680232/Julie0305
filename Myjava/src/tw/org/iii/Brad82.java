package tw.org.iii;

import java.util.HashSet;

//實作collection
public class Brad82 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
//3		toBike b1 = new toBike();
//2		String s1 = "Brad";
//1		Integer i1 = new Integer(12);     //第一招建構式
//1		Integer i2 = new Integer("34");  //可能拋出例外,API上有寫;i2是物件  ;改成Integer i2 = new Integer("Brad")會拋出例外
//4		int ii3 = 56;        //基本型別
//4		Integer i3 = ii3;   //物件型別 ;56包成物件=>裝箱
//3		System.out.println(b1);   //印出記憶體位置,但如果class toBike override 則會印出字串,即執行第27~32列
//2		System.out.println(s1);    //因為字串有toString,本身已有override,故不會印出記憶體位址
//1		System.out.println(i1); //因為整數有toString,本身已有override,故不會印出記憶體位址
//1		System.out.println(i2);   //印出34
//4 	System.out.println(ii3);  //印ii3的值
//4		System.out.println(i3.floatValue());  //還是印出56但是將ii3的值建構成物件,所以可以這樣用,ii3是基本型別,不會是物件,不會有floatValue
		
		//set.add(arg0);  //add只能丟物件
	}
}
class toBike{
	@Override
	public String toString() {
		return "Brad";
	}
}
