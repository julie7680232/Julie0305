package tw.org.iii;
//P48����-2
public class Brad57 {

	public static void main(String[] args) {
		sayYa("Brad","Peter","Andy","Mary");

	}
	static void sayYa(String name){
		System.out.println("Ya,"+ name);
	}
	static void sayYa(String name1,String name2){
		System.out.println("Ya,"+ name1);
		System.out.println("Ya,"+ name2);
	}
	static void sayYa(String...names){  //���w�Ӽ�,��I�s��sayYa��k��2�Ӯ�,�|�L�XYa,Brad��Ya,Peter;����3�Ӯ�,�|�L�XOK
		//names => String[] => {"Brad","Peter"}
		for(String name :names){
			System.out.println("Ya, "+ name);
		}
		//System.out.println("OK");
	}

}
