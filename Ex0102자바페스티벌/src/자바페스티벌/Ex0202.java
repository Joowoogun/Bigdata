package 자바페스티벌;

import java.util.Scanner;

public class Ex0202 {

	public static void main(String[] args) {
		//2일차 2번
		
		Scanner sc = new Scanner(System.in);
		do {System.out.print("A 입력 >> ");
		int a = sc.nextInt();
		System.out.print("B 입력 >> ");
		int b = sc.nextInt();
		if(a==0&&b==0) {
			break;
		}
		System.out.println("결과 >> " + (a-b));
		}
		while(true);
		
		
		
		
		
		

	}

}
