package tw.org.iii;
//P48����-3
public class Brad58 {

	public static void main(String[] args) {
		sayYa1("Brad","Peter","Andy","Mary");
		//sayYa2("Brad","Peter","Andy","Mary");  //�|�sĶ���~,���令��8�C,�]��say1��say2�I�s�覡���P
		sayYa2(new String[]{"Brad","Peter","Andy","Mary"});

	}

	static void sayYa1(String...names){  //���w�Ӽ�,��I�s��sayYa��k��2�Ӯ�,�|�L�XYa,Brad��Ya,Peter;����3�Ӯ�,�|�L�XOK
		//names => String[] => {"Brad","Peter"}
		for(String name :names){
			System.out.println("Ya, "+ name);
		}
		//System.out.println("OK");
	}
	static void sayYa2(String[] names){  //���w�Ӽ�,��I�s��sayYa��k��2�Ӯ�,�|�L�XYa,Brad��Ya,Peter;����3�Ӯ�,�|�L�XOK
		//names => String[] => {"Brad","Peter"}
		for(String name :names){                  //�Y�NsayYa2�令sayYa1�|�sĶ���~,�O��جۦP��k
			System.out.println("Ya, "+ name);
		}
	}
}
