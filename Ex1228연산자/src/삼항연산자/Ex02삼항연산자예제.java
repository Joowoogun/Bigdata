package 삼항연산자;

import java.util.Scanner;

public class Ex02삼항연산자예제 {

	public static void main(String[] args) {
		// 입력도구 꺼내기
		Scanner sc = new Scanner(System.in);
		// 정수입력 출력
		System.out.print("정수를 입력하세요 :  ");
		// 정수 입력받기 + 변수로 선언
		int num1 = sc.nextInt();
		// 입력값이 홀수인지 짝수인지 확인
		String result = num1%2 > 0 ? num1 +" 는 홀수입니다" :
		num1 + " 홀수가 아닙니다 ";
		// 결과 출력
		System.out.println(result);
		
		
		// 다른방법
		// String result = num1%2 == 1 ? " 홀수 " : " 짝수 ";
		// System.out.println(num1+ "은(는)" + result + "입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
