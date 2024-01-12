package 자바페스티벌;

public class Ex0301 {

	public static void main(String[] args) {
		// 3일차 1번
		int i = 1;
		int d = -2;
		int e = 0;

		int f = 0;
		int t = 0;

		for (i = 1; i <= 100; i++) {

			if (i % 2 == 1) {
				System.out.print(i + " ");
				f += i;
			}

			else if (i % 2 == 0) {
				e += d;
				t += e;
				System.out.print(e + " ");

			}

		}
		int result = f + t;
		System.out.println();
		System.out.println("결과 : " + result);
	}

}
