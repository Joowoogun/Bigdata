package 자바페스티벌;

import java.util.Scanner;

public class Ex0305 {

	public static void main(String[] args) {
		// 3일차 5번
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i<9; i++) {
			
			int j = input % 10;
			input = input / 10;
		    sum += j;
			
			
			
		}
		
		
		System.out.print("합은 " + sum +"입니다.");
		
		
		
		
		

	}

}
