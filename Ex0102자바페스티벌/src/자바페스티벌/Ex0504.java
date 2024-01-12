package 자바페스티벌;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0504 {

	public static void main(String[] args) {
		// 5일 4번
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];

		for (int i = 0; i < array.length; i++) {
			System.out.print(i + "번째 별의 수 : ");
			array[i] = sc.nextInt();
		}
		
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + ":");

			for (int i = 0; i < array[j]; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
