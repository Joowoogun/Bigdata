package for문;

import java.util.Random;
import java.util.Scanner;

public class Ex05약수구하기 {

	public static void main(String[] args) {
		// 입력도구
		Scanner sc = new Scanner(System.in);
		// 정수 입력
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		// 약수 출력
		for(int i = 1; i <= input; i++) {
		// --> 입력받은 숫자를 임의의 숫자로 나누었을때 나머지가 0이면 약수
			if(input % i == 0) {
				//약수인 경우
				System.out.print(i + " ");
			}
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
