package 산술연산자;

import java.util.Scanner;

public class Ex03산술연산자예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num1 = sc.nextInt();
		System.out.println("결과 값 : " + (num1/100)*100);
		
		// 입력받는 도구 꺼내기
		// 정수업력 출력
	    // 정수입력 int 사용해서 저장
		// 백의자리이하를 버리기
		// 결과값 출력
		
		int result = num1 - num1 % 100;
		System.out.println("결과 값 : " + result);
		
		// += -= *=  %=
		
		// 대입연산자 예제
		// int num = 29;
		// num -= 2;
		// 27
		// int num = 29;
		// num -= 2+3*4;
		// 15
		
		// 증감연산자
		// ++ -- 변수 앞뒤 -- ++ 에 대입해서 1늘리거나 줄이거나
		
		// 비교 연산
		// == 같다 != 같지않다
	
		// 논리 연산자
		// !(NOT)  &&(AND) \\(OR) 
		// !(피연산자)  \\(피연산자)
		
		
		
		

	}

}
