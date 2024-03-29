package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex06로또번호추첨 {

	public static void main(String[] args) {

		Random ran = new Random();
		int[] lotto = new int[5];
		// 1. lotto의 0번방 데이터를 랜덤한 수로 초기화(1~10)
		lotto[0] = ran.nextInt(10) + 1;
		// 3. lotto[0]과 lotto[1]의 값이 같은지 비교
		// ---> 같다면 lotto[1]다시 랜덤한 숫자 부여하기
		// 2. lotto의 1번방 데이터를 랜덤한 수로 초기화
		for (int j = 0; j < 5; j++) {
			lotto[j] = ran.nextInt(10) + 1;
			for (int i = 0; i < j; i++) {
				if (lotto[i] == lotto[j]) {
					j--;
					break;
					
				}
			}
		}
//
//		lotto[2] = ran.nextInt(10) + 1;
//		for (int i = 0; i < 2; i++) {
//			if (lotto[i] == lotto[2]) {
//				lotto[2] = ran.nextInt(10) + 1;
//			}
//		}
//
//		lotto[3] = ran.nextInt(10) + 1;
//		for (int i = 0; i < 3; i++) {
//			if (lotto[i] == lotto[3]) {
//				lotto[3] = ran.nextInt(10) + 1;
//			}
//		}
//
//		lotto[4] = ran.nextInt(10) + 1;
//		for (int i = 0; i < 4; i++) {
//			if (lotto[i] == lotto[4]) {
//				lotto[4] = ran.nextInt(10) + 1;
//			}
//		}
		System.out.println(Arrays.toString(lotto));

	}

}
