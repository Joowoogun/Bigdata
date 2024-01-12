package 자바페스티벌;

import java.util.Iterator;
import java.util.Scanner;

public class Ex0601 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int n = sc.nextInt();
		int num = 1;
		int[][] array = new int[n][n];

		for (int j = 0; j < array.length; j++) {

			for (int i = 0; i < array.length; i++) {
				array[j][i] = num++;

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
