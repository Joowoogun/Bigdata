package switch문;

import java.util.Scanner;

public class Ex02자판기프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int cash = sc.nextInt();
		System.out.println("메뉴를 고르세요.");
		System.out.print("1.아우터(700) 2.이구동성(1000원) 3.에그몽(500원) >> ");
		int num = sc.nextInt();
		int change = cash;
			
		
		if(num == 1) 
		{if(cash >= 700) {change = cash -700;
		} else {
			System.out.println("돈이 부족해요 ㅠ");
			change = cash;
		}
			
			 //System.out.println("잔돈 :" + (cash-700) +"원");
		  
			 
		} else if(num ==2) {
			if(change >= 1000) {
				change = cash-1000;
			}else {System.out.println("돈이 부족해요 ㅠ");
			
			}
		
			//System.out.println("잔돈 : " + (cash-1000) + "원");
		} else if(num ==3) {
			if(cash >=500) {
				change = cash-500;
			}else {
				System.out.println("돈이 부족해요 ㅠ");
			}
			//System.out.println("잔돈 : " + (cash-500) + "원");
			
		} else {
			System.out.println("없는 메뉴입니다");
 		}
		System.out.println("잔돈은" + change + "원 입니다.");
		int num0 = change/1000;
		int num1 = change%1000;
		int num2 = num1/500;
		int num3 = num1%500;
		int num4 = num3/100;
		System.out.println("천원 : " + num0 + "개 , 오백원 : "+num2+"개 , 백원 : "+num4+"개");
		
		//int num3 = num2/100
		
		
		
		
		// 입력 도구
		// Scanner sc = new Scanner(System.in);
		
		// 금액 입력
	    // System.out.print("금액을 입력하세요 >>");
		
		// 입력 금액 저장 변수 선언
		// int money = sc.nextInt();
		
		// 메뉴판 출력
		//System.out.println("메뉴를 고르세요");
		//System.out.print("1 아우터 700 2 이구동성 1000 3 에그몽 500");
		
		// 메뉴 입력받기
		// int menu = sc.nextInt();
		
		// 메뉴 무엇인지 판단
		// int change = 0;
		// if(menu == 1) {
		
		// 아우터 700 골랐을 경우
		// change = money-700;
		// }else if(menu == 2) {
		
		// 이구동성 1000 골랐을 경우
		// change = money-1000;
		// }else if(menu == 3) {
		
		// 에그몽 500 골랐을경우
		// change = money-500;
		
		// else {System.out.println("없는 메뉴입니다"); 
	    //}
		
		// System.out.println("잔돈"+change+"원입니다");
		// 
		// 잔돈 출력
		
		
		
		
		
	
		
		
		
		

	}

}
