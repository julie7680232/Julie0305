package tw.org.iii;

public class P7 {
	static String o = "";

    public static void main(String[] args) {
        z: for (int x = 2; x < 7; x++) {
            if (x == 3)
                continue;
            if (x == 5)
                break z;
            o = o + x;
        }
        System.out.println(o);
    }

}
