package 자바페스티벌;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0507 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 수 입력: ");
			arr[i] = sc.nextInt();
		}
		// System.out.println(Arrays.toString(arr));
		System.out.println("정렬 후");
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}

	}
}
