package 메소드;

import java.util.Scanner;

public class Ex05완전수구하기 {

	public static void main(String[] args) {

		// 완전수
		// : 자기 자신을 제외한 약수들의 합이 자기 자신인 수
		// 6 ---> 완전수
		// 1 + 2 + 3 = 6
		//
		// 10 --> 완전수 X
		// 1 + 2 + 5 =8

		Scanner sc = new Scanner(System.in);
		System.out.print("num1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 입력 : ");
		int num2 = sc.nextInt();
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor);
		System.out.println(getSum(num1));
		System.out.println(isPerfect(num1));

	}

	public static boolean isDivisor(int num1, int num2) {
		boolean yak = false;

		if (num1 % num2 == 0) {
			yak = true;
		} // else { // else가 없어도 기본값이 false 이기 때문에 생략가능
			// yak = false;
			// }
		if (num1 - num2 == 0) {
			yak = false;
		}
		return yak;

	}
	// 2. 자신을 제외한 약수의 총합을 구하는 메소드
	// 메소드명 : getSum
	// 매개변수 : int, 1개
	// 리턴타입 : boolean

	public static int getSum(int num1) {

		int sum = 0;
		// 1. 입력된 숫자의 약수를 구한다 -> 1~num1 중에 num1을 제외한 범위
		// 2. 나 자신을 제외한 숫자들의 합을 구한다 --> 누적합계

		for (int i = 1; i < num1; i++) {
			// ** 기존 로직
			// if (num1 % i == 0) {
			// i 는 num1의 약수

			// ** 메소드를 호출한 로직
			// 메소드 구조 안에 메소드를 새롭게 구현할 수는 없으나
			// 메소드 자체를 호출하여 사용하는 것은 가능하다.
			if (isDivisor(num1, i) == true) {
				sum += i;
			}
		}
		return sum;
	}
	// 3. 완전수인지 확인하는 메소드
	// 메소드명 : isPerfect
	// 리턴타입 : boolean

	private static boolean isPerfect(int num1) {
		boolean pf = false;
		// int sum = 0;
		// ***기존 코드
		// for (int i = 1; i < num1; i++) {
		// 	if (num1 % i == 0) {
		//		sum += i;
		//	}
		if(getSum(num1)== num1) {
			pf = true;
		}
		//if (sum == num1) {
		//	pf = true;
		//}
		return pf;

	}

}
