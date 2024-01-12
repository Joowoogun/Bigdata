package 자바페스티벌;

import java.util.Scanner;

public class Ex0502 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		String list = "";
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번 째 정수 입력 >> ");
			array[i] = sc.nextInt();
			if (array[i] % 3 == 0) {
				list += array[i] + " ";
			}

		}

		System.out.println("3의 배수 : " + list);

	}

}
