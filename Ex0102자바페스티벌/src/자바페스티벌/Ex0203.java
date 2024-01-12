package 자바페스티벌;

import java.util.Random;
import java.util.Scanner;

public class Ex0203 {
	     // 2일차 3번

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int cnt = 1;
		while (true) {
			int a = ran.nextInt(9) + 1;
			int b = ran.nextInt(9) + 1;
			System.out.print(a + " + " + b + " = ");
			int input = sc.nextInt();
			if (a + b == input) {
				System.out.println("SUCCESS!");
			} else {
				System.out.println("Fail...");
				cnt++;
				if (cnt > 5) {
					break;
				}
			}
		}
		System.out.println("게임종료");
	}
}
