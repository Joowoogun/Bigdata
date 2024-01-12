package 자바페스티벌;

import java.util.Arrays;
import java.util.Iterator;

public class Ex0505 {

	public static void main(String[] args) {
		// 5일 5번

		
		int array[] = new int[7];
		array[0] = 92;
		array[1] = 32;
		array[2] = 52;
		array[3] = 9;
		array[4] = 81;
		array[5] = 2;
		array[6] = 68;
		
		for (int i = 0; i < array.length; i++) {
				
			for (int j = 0; j < array.length; j++) {
				
				System.out.println(close10(array[i],array[j]));
				
			}
		}
	
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}
	private static int close10(int num1, int num2) {
		// ex) 5, 9를 봤을 때 더 10에 가까운수 --> 9
		// 10-5=5 / 10-9=1 ==> 더 작은 쪽이 10에 가깝다고 판별
		// 11, 15를 봤을 때 더 10에 가까운 수 -->11
		// 10-11=-1 / 10-15=5 ==> 더 작은 쪽이 10에 가깝다고 XX
		// -1, -5에서 -를 뗄 수 있는 방법 ==> 제곱해주기
		// 절대값 : 수직선 위에서 거리를 나타내는 값

		// 1. 제곱으로 만들어서 판별하는 방법
		// if ((10 - num1) * (10 - num1) > (10 - num2) * (10 - num2)) {
		// 10에 가까운 수 num2
		// 2. 자바에서 절대값 만들기 Math.abs();
		if (Math.abs(10 - num1) > Math.abs(10 - num2)) {
			return num2;
		} else if (Math.abs(10 - num1) < Math.abs(10 - num2)) {
			return num1;
		} else {
			return 0;
		}

	}
}
