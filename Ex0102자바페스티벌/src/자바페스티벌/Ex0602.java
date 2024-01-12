package 자바페스티벌;

import java.util.Iterator;
import java.util.Scanner;

public class Ex0602 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int n = sc.nextInt();
		int[][] array = new int[n][n];
		int num = 1;

		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < array.length; j++) {
					array[i][j] = num++;

				}
			} else {
				for (int j = n - 1; j >= 0; j--) {
					array[i][j] = num++;
				}
			}
		}
		for (int j = 0; j < array.length; j++) {

			for (int i = 0; i < array.length; i++) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
		}

	}

}
