package while문;

import java.util.Scanner;

public class Ex02while문예제 {

	public static void main(String[] args) {
//		// 입력받는 도구 꺼내기
		Scanner sc = new Scanner(System.in);
//		// 정수 입력 : <-출력하기
//		System.out.print("정수 입력 : ");
//		// 정수 입력받기
		int num = sc.nextInt();
//		// 변수 num 이 바뀔수있게 선언
		num = 0;
//		
//		// 2~3 반복하고 10보다 큰수 입력시 종료하게 만들기
		
//		while(num<10) {
//			
//			System.out.print("정수 입력 : ");
//			num = sc.nextInt();
//			
//			}
//		
//		// 마지막 출력문 괄호밖에 작성
//		System.out.println("종료되었습니다.");
		
		// 무한반복문
		
		while(true) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			if(num>=10) {
				System.out.println("종료되었습니다.");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
