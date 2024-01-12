package dowhile문;

import java.util.Scanner;

public class Ex02dowhile문예제 {

	public static void main(String[] args) {
		// 입력도구
		Scanner sc = new Scanner(System.in);
		// 현재 몸무개
		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();
		// 목표 몸무게 입력
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		// 주차별 감량 몸무게 입력
		// ---> 다이어트 언제 성공할지모르니 주차도 변수선언
		int week = 1;
		do {
			System.out.print(week++ + "주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			// 현재 몸무게 = 원래 몸무게 - 감량 몸무게
			now = now - minus; // now -= minus;
			// 현재 몸무게가 목표에 도달했는지 조건 확인
			if (now <= goal) {
				System.out.println(now + "kg 달성!! 축하합니다!!");
				break;
			}
		} while (true);

	}
}
