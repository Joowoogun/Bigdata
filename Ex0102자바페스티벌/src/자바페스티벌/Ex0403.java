package 자바페스티벌;

public class Ex0403 {

	public static void main(String[] args) {
		// 4일차 3번
		for (int j = 1; j < 6; j++) {
			for (int i = 0; i < 5 - j; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
