package 자바페스티벌;

import java.util.Scanner;

public class Ex0304 {

	public static void main(String[] args) {
		// 3일차 4번

		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		int up = 0;

		for (int i = 0; i < n; i++) {

			up += i;
			int one = 1;
			System.out.print(one + up + " ");
		}

	}

}
