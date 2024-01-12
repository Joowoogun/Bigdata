package for문;

import java.util.Scanner;

public class Ex04구구단 {

	public static void main(String[] args) {
		// 원하는 단을 입력받아 구구단 출력
		// 입력도구
		Scanner sc = new Scanner(System.in);
		// 단 입력받기
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		// 수 입력받기
		System.out.print("어느 수까지 출력 : ");
		int su = sc.nextInt();
		
		
		for(int i = 1; i <= su; i++) {
			System.out.println(dan +"*"+ i +"="+i*dan);
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
