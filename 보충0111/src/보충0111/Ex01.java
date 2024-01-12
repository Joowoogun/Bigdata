package 보충0111;

public class Ex01 {

	public static void main(String[] args) {
		// for : 반복 횟수가 정해져 있을때(~언제부터 ~언제까지)
//		for (int i = 0; i < 3; i++) {
//			System.out.print(i);
//		}
//		System.out.println();
		// 1부터 9까지 출력 시켜주세요
		// 구구단 2단을 출력시켜주세요
//		for (int i = 1; i < 10; i++) {
		// System.out.println("2 X " + i + " = " + i * 2);
//			int result = 2*i;
//			System.out.println(2+"*"+i +"="+ result);
//		}

		// 1. 1~100 까지 출력
		// 2. 홀수일때는 양수
		// 짝수일대는 음수 -i
		// 3. 총합
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i*-1+" ");
				sum = sum - i;
			} else {
				System.out.print(i+" ");
				sum = sum + i;
			}

		}
		System.out.println();
		System.out.println("결과 : "+sum);

	}
}
