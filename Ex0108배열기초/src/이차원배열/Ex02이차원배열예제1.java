package 이차원배열;

import java.util.Arrays;
import java.util.Iterator;

public class Ex02이차원배열예제1 {

	public static void main(String[] args) {
		// 21 부터 시작하는 변수 num 생성
		int num = 21;
		
		// 5행 5열 이차원 배열 생성
		int[][] array = new int[5][5];
		
		// 배열 값 지정
		for (int j = 0; j < array.length; j++) {

			for (int i = 0; i < array.length; i++) {
				array[i][j] = num++;
			}

		}

		// 열부터 표 출력 array[1][0] = 22

		for (int j = 0; j < array.length; j++) {

			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i][j] + "\t");

			}
			System.out.println();
		}
		System.out.println();

		// 행부터 표 출력 array[0][1] = 26
		for (int j = 0; j < array.length; j++) {

			for (int i = 0; i < array.length; i++) {
				System.out.print(array[j][i] + "\t");

			}
			System.out.println();

		}

	}
}
