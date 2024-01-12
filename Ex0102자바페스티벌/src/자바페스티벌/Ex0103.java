package 자바페스티벌;

import java.util.Scanner;

public class Ex0103 {
	// 1일차 3번

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num1 = sc.nextInt();
		int num2 = num1%10;
		
		if(num2<=5) {
			System.out.println("반올림 수 : " + num1/10*10);
		} else { System.out.println("반올림 수 : " + ((num1+10)/10)*10);
		
		}
		
		
		
		
		
		
		
		

	}

}
