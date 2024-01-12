package 자바페스티벌;

import java.util.Scanner;

public class Ex0401 {
	// 4일차 1번

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int h = sc.nextInt();
		int i = 0;
		for (i = 1; i <= h; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
