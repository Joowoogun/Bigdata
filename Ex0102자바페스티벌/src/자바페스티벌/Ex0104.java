package 자바페스티벌;

import java.util.Scanner;

public class Ex0104 {

	public static void main(String[] args) {
		// 1일차 4번
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();
		
		int math1 = num2/100;
		int math2 = num2%100;
		int math3 = math2/10;
		int math4 = math2%10;
		int math5 = math3/1;
		
		System.out.println(num1 * math4);
		System.out.println(num1 * math3);
		System.out.println(num1 * math1);
		System.out.println(num1 * num2);
		
		
		
		
	}

}
