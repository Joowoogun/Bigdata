package ifelse문;

import java.util.Scanner;

public class Ex02입장료계산 {

	public static void main(String[] args) {
		// 입력도구
		Scanner sc = new Scanner(System.in);
		// 환영문 및 나이 입력
		System.out.println("====에버랜드에 오신 걸 환영합니다!====");
		System.out.print("나이를 입력하세요 : ");		
		int age = sc.nextInt();
		// 인원수 입력
		System.out.print("인원수를 입력하세요 : ");
		int seat = sc.nextInt();
		// 계산하기		
		if(age<20) {
			// 20세 미만 50% 할인 
			System.out.println("총" + (2500 * seat) + "입니다");
			// 20세 이상 기본값 5000원
		}else {System.out.println("총" + (5000 * seat) +"입니다");
		
		// *****지역변수(local variable)*****
		// : {} 영역 안에서 선언된 변수는 {}영역 안쪽에서만 사용이 가능하다!
		// ---> {} : scope <--명칭
		
		
		// int money = 0; {} <-- 밖으로 빼서 0값으로만듬
		// int money = (int) (5000 * seat * 0.5); 
		// <-- 소수점 없에려고 앞에 (int) 넣음
		
		// else { int money = 5000 * seat;
		// System.out.println("입장료는 " + money + "원 입니다");
		
		}
		
		
		

	}

}
