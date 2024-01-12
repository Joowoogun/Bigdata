package 자바페스티벌;

import java.util.Scanner;

public class Ex0402 {
	// 4일차 2번

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int h = sc.nextInt();
		for (int j = h; j > 0; j--) {
			for (int i = 0; i < h; i++) {
				System.out.print("*");
			}
			System.out.println();
			h--;
		}

	}

}
