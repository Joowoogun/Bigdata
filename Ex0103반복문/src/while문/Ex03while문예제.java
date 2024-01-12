package while문;

import java.util.Scanner;

public class Ex03while문예제 {

	public static void main(String[] args) {

        // 입력도구
		Scanner sc = new Scanner(System.in);
		// 정수입력 출력
		// System.out.print("정수 입력 : ");
		// 정수 입력
		// int input = sc.nextInt();
		// 정수 누적하기
		// --> 변수 하나 필요
		// int sum = 0;
		// sum = sum + input;
		// sum += input;
		// System.out.println("누적 결과: " + sum);
		// if(input == -1) {
		// System.out.println("종료되었습니다.");
		// break; }
		
		
		int num = 0;
		int num2 = 0;
				
		
		while(true) {
			if(num>=0) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			
			num2 += num;
			System.out.println("누적 결과 : " + num2);
			}else {
			System.out.println("종료되었습니다.");
				break;
				}
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
