package tw.org.iii;

public class P6 {

		static String o = "";

	    public static void main(String[] args) {
	        z: o = o + 2;
	        for (int x = 3; x < 8; x++) {
	            if (x == 4)
	                break;
	            if (x == 6)
	                break z;   //此例無法編譯,因為z之定義錯誤
	            o = o + x;
	        }
	        System.out.println(o);
	    }

}
