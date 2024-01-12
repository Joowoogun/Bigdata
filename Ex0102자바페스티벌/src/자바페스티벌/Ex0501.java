package 자바페스티벌;

import java.util.Arrays;
import java.util.Random;

public class Ex0501 {

	public static void main(String[] args) {
		// 5일차 1번
		Random ran = new Random();
		int array[] = new int[8];
		int max = 0;
		int min = 100;
		System.out.print("배열에 있는 모든 값 : ");
		for (int i = 0; i < array.length; i++) {

			array[i] = ran.nextInt(99) + 1;
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
			System.out.print(array[i] + " ");
		}
		// System.out.println(Arrays.toString(array));
		System.out.println();
		System.out.println("가장 큰 값 :" + max);
		System.out.println("가장 작은 값 :" + min);

	}

}
