package 메소드;

import java.util.Scanner;

public class Ex02계산기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		char op = '+';
		System.out.println(cal(num1, num2, op));

	}

	// private : 다른 클래스에서는 접근이 불가능하게 막아주는 접근제한자
	private static int cal(int num1, int num2, char op) {
		if (op == '-') {
			return num1 > num2 ? num1 - num2 : num2 - num1;
		} else if (op == '+') {
			return num1 + num2;
		} else if (op == '*') {
			return num1 * num2;
		} else if (op == '/') {
			return num1 / num2;
		} else {
			// 조건에 맞지않는 연산자가 들어왔을 때 보내줄 결과값도 작성해야함
			return 0;
		}

	}
}