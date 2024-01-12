package 자바페스티벌;

import java.util.Arrays;
import java.util.Random;

public class Ex0503 {

	public static void main(String[] args) {

		Random ran = new Random();
		int[] lotto = new int[5];
		lotto[0] = ran.nextInt(10) + 1;
		for (int j = 0; j < 5; j++) {
			lotto[j] = ran.nextInt(10) + 1;
			
			for (int i = 0; i < j; i++) {
				if (lotto[i] == lotto[j]) {
					j--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));

	}

}
