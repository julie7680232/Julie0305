package tw.org.iii;

public class P6 {

		static String o = "";

	    public static void main(String[] args) {
	        z: o = o + 2;
	        for (int x = 3; x < 8; x++) {
	            if (x == 4)
	                break;
	            if (x == 6)
	                break z;   //���ҵL�k�sĶ,�]��z���w�q���~
	            o = o + x;
	        }
	        System.out.println(o);
	    }

}
