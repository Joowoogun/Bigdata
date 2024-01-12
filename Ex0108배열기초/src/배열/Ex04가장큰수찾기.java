package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex04가장큰수찾기 {

	public static void main(String[] args) {
		// 랜덤 도구
		Random ran = new Random();
		// 정수형 데이터 5개 저장하는 배열 선언
		int array[] = new int[5];
		// 가장 큰 수를 선언하는 변수 max 선언
		int max = 0;
		System.out.print("배열 안에 들어있는 값 : ");
		for (int i = 0; i < array.length; i++) {
			// 랜덤한 숫자로 배열 초기화
			array[i] = ran.nextInt(10) + 1;
			// 랜덤한 변수가 들어있는 배열 출력
			System.out.print(array[i] + " ");
			// array[i] 에 9가 담겨있으면 max의 값이 9가 되기때문에 더
			// 높은수가 나오지 않는이상 if문 작동이 안되므로 max의 값은 9
			if (array[i] > max) {
				max = array[i];
				// 만약 배열안에 들어있는 값이 max보다 크다면
				// max를 배열안에 있는 값으로 변경하기
			}
		}
		// 배열안의 모든 값 출력하는 명령어 (Arrays.toString(어레이 이름));
		// System.out.println("배열 안에 들어있는 값 : " + Arrays.toString(array));
		System.out.println();
		System.out.println("가장 큰 값은 " + max + "입니다");
	}

}
