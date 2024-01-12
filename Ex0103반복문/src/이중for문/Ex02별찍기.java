package 이중for문;

public class Ex02별찍기 {

	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {
			for (int cnt = 0; cnt < i; cnt++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
