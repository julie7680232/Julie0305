package tw.org.iii;

public class EX1 {

		public static void main(String[] args) {
			print();
		}

		static void print() {
			for (int i = 1; i <= 100; i++) {
				// �p�G10�����ƴN��X����
				if (i % 10 == 0) {
					System.out.println(i);
				} else {
					if (isprime(i) && i != 1) {
						System.out.printf("*%d\t", i);
					} else {
						System.out.printf("%d\t", i);
					}
				}

			}
		}

		static boolean isprime(int a) {
			boolean b = true;
			// i<a�~���|�Q�ۤv���
			for (int i = 2; i < a; i++) {
				if (a % i == 0) {
					b = false;
					break;
				}
			}

			return b;
		}
}
