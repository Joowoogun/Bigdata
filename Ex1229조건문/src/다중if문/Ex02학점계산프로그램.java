package 다중if문;

import java.util.Scanner;

public class Ex02학점계산프로그램 {

	public static void main(String[] args) {
		// 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 점수 입력 받기
		System.out.print("점수 입력 : ");
		int totalScore = sc.nextInt();
		// 점수 에 따른 학점 계산
		if (totalScore < 70) {
		// 70점 보다 낮으면 D학점
			System.out.println("D학점 입니다.");
		// 80점 보다 낮으면 C학점
		} else if(totalScore <= 80 ) {
			System.out.println("C학점 입니다.");
		// 90점 보다 낮으면 B학점
		} else if(totalScore <= 90 ) {
			System.out.println("B학점 입니다.");
		// 그외 A학점
		} else {
			System.out.println("A학점 입니다.");
		}

		
		
		
		
		
		
		
		
		
		
		
	}

}
