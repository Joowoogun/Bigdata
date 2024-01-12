package 배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex05점수계산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		// 정수형 데이터 5개를 저장하는 배열 array 선언
		int array[] = new int[5];
		// 계산에 사용할 변수들 <-- 계산하면서 만듬
		int low = 100; // array[0]; <-- 도 가능
		int max = 0;
		double sum = 0;
		double average = 0;

		for (int i = 0; i < array.length; i++) {
			// 배열 안의 데이터를 모두 입력 받으세요
			System.out.print((i + 1) + "번째 입력 >> ");
			array[i] = sc.nextInt();
			if (array[i] < low) {
				low = array[i];
			}
			if (array[i] > max) {
				max = array[i];
			}
			sum += array[i];
			average = sum / 5;
		}

		System.out.println("입력된 점수 : " + Arrays.toString(array));
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + low);
		System.out.println("총합 : " + (int) sum);
		System.out.println("평균 : " + average);
		// sum이 인트형일때 f 를 붙여 플로트 형식으로 바꿀수있음
		// 예) --> ("평균 : " + (float)sum/array.length);

	}

}
