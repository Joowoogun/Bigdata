package while문;

import java.util.Scanner;

public class Ex01while문기초 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
		// ctrl shift f : 정렬 단축키
		
		// whil문 구조
		// Hello World 5번 출력하는코드 작성

		// 반복 횟수를 정해주는 변수 num 선언
		int num = 0;
		while (num < 5) {
			System.out.println("Hello World!");
			num++;
		}

	}

}
