package 보충0111;

import java.util.Arrays;
import java.util.Random;

public class Roto {

	public static void main(String[] args) {
		Random ran = new Random();

		// 중복없이 숫자 6개 뽑기
		// 로또라는 6칸 배열 선언
		int[] roto = new int[6];

		// 배열안에 랜덤값 넣기
		for (int i = 0; i < roto.length; i++) {
			roto[i] = ran.nextInt(45) + 1;

			// 앞서 뽑은 숫자와 비교하는 반복문
			for (int j = 0; j < i; j++) {
				if (roto[j] == roto[i]) {
					// 앞서 뽑은 숫자와 같은 수가 있다면
					// 다시 뽑기 위해서 인덱스 값을 1감소
					i--;
				}

			}

		}
		System.out.println(Arrays.toString(roto));

	}

}
