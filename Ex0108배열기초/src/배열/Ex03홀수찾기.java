package 배열;

import java.util.Random;

public class Ex03홀수찾기 {

	public static void main(String[] args) {
		// 랜덤도구 꺼내기
		Random ran = new Random();

		// 데이터 5개를 저장할 정수 array 선언
		int[] array = new int[5];
		// 랜덤으로 100 까지 출력하기위해 랜덤수 선언
		int total = 0;
		String hol = " ";
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(100) + 1;
			if (array[i] % 2 == 1) {
				hol += array[i] + " ";
				total++;
			}
		}
		System.out.println("array에 들어있는 홀수는" + hol + "이며,");
		System.out.println("총 " + total + "개 입니다.");

		// # 정석 풀이 #

		// 1.정수형 데이터를 5개 저장할수있는 array선언
		// int[] array = new int[5];

		// 2.랜덤한 값으로 배열값 초기화 1~100
		// Random ran = new Random();
		// for(int i = 0; i < array.length; i++){
		// array[i] = ran.nextInt(100)+1;
		// }

		// 3.홀수값만 출력하고, 총 몇 개인지 출력
		// array에 들어있는 홀수는 53 39 5 이며,
		// --> 총 3개입니다.
		// System.out.print("array에 들어있는홀수는");
		// int count = 0;
		// for(int i = 0; i < array.length; i++)
		// {
		// if(array[i]%2 == 1){
		// -->이프문 안쪽이라 홀수일때만 출력됨
		// System.out.print(array[i]+" ");
		// count++;
		// }
		// }
		// System.out.println("이며 ");
		// System.out.println("총 " + count + "개입니다.");

	}
}
