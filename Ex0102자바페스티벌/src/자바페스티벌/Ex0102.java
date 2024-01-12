package 자바페스티벌;

import java.util.Scanner;

public class Ex0102 {
	// 1일차 2번

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("총금액 입력 : ");
	int cost = sc.nextInt();
	System.out.println();
	int num1 = cost/10000;
	int num2 = cost%10000;
	int num3 = num2/5000;
	int num4 = num2%5000;
	int num5 = num4/1000;
	int num6 = num4%1000;
	int num7 = num6/500;
	int num8 = num6%500;
	int num9 = num8/100;
	
	System.out.println("잔돈 : " + cost + "원");
	System.out.println("10000원 : " + num1 + "개");
	System.out.println("5000원 : " + num3 + "개");
	System.out.println("1000원 : " + num5 + "개");
	System.out.println("500원 : " + num7 + "개");
	System.out.println("100원 : " + num9 + "개");
	
	
	
	
	
	
	
	}

}
