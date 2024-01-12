package while문;

import java.util.Scanner;

public class Ex04while문예제 {

	public static void main(String[] args) {
		// 도구 꺼내오기
		// 정수 입력출력
		// 정수 입력받기
		//
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int count2 = 0;

		while (true) {
			System.out.print("숫자 입력: ");
			int num = sc.nextInt();
			// num2가 나머지가 0이면 ++count 아니면 ++count2
			if (num % 2 == 0) {
				++count;
			} else {
				++count2;
			}
			if (num == -1) {
				System.out.println("종료되었습니다. ");
				break;
			}
			System.out.println("짝수 개수 : " + count);
			System.out.println("홀수 개수 : " + count2);
		}

	}

}
