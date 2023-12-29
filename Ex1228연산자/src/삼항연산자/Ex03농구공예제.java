package 삼항연산자;

import java.util.Scanner;

public class Ex03농구공예제 {

	public static void main(String[] args) {
		
		// 1 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2 농구공의 개수를 입력하세요 출력
		System.out.print(" 농구공의 개수를 입력하세요 : ");
		// 3 농구공의 개수 데이터 입력
		int ball = sc.nextInt();
		// 4 필요한 상자의 수 구하기
		int result = ball % 5 == 0 ? ball / 5 : ball / 5 + 1;
		// 5 결과 출력하기
		System.out.println("필요한 상자의 수 : " + result);		
		
			
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		

	}

}
