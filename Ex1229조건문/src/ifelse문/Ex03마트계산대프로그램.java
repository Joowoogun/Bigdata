package ifelse문;

import java.util.Scanner;

public class Ex03마트계산대프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품의 개수를 입력하세요 :" );
		int count = sc.nextInt();
		if(count>10) { 
			
			System.out.println("가격은" + (int)(count * 10000*0.9) + "원 입니다.");
		}else {			
			System.out.println("가격은" + (count * 10000) + "원 입니다.");
			
		// 입력도구
		// Scanner sc = new Scanner(System.in);	
		// 입력 받기
		// System.out.print("상품의 개수를 입력하세요 :" );
		// int count = sc.nextInt();	
		// 선물세트 구입시 지불할 금액 계산하기
		// if(count >= 11) {	
		// 11개 이상구매시 10프로 할인 1세트 가격 : 10000원
		// money = (int) (10000 * count * 0.9);
		// } else {
		//    그렇지 않은경우 정가로 구매
		//  money = 10000 * count;
		// System.out.println("가격은" + money + "원 입니다");	
			
			
			
		
			
			
		}
		
	}

}
