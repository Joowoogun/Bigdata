package 자바페스티벌;

import java.util.Scanner;

public class Ex0306 {

	public static void main(String[] args) {
		// 3일차 6번
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단수입력 :");
		int dan = sc.nextInt();
		System.out.println("어느 수까지 출력 :");
		int soo = sc.nextInt();
		System.out.println(dan+"단");
		for(int i = 1; i<soo+1; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
			
		}
		
		
		
		
		
		
		
		
		
	}

}
