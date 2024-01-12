package 이차원배열;

public class Ex03이차원배열예제2 {

	public static void main(String[] args) {
		// 스네이크 모양

		int[][] array = new int[5][5];
		int num = 21;
		// 선생님 풀이
		for (int j = 0; j < array.length; j++) {

			if (j % 2 == 0) {
				for (int i = 0; i < array.length; i++) {
					array[j][i] = num++;
				}
			} else {

				for (int i = 4; i >= 0; i--) {
					array[j][i] = num++;
				}
			} 
		}

//		int up = 0;
//		for (int j = 0; j < array.length; j++) {
//
//			if (up % 2 == 0) {
//				for (int i = 0; i < array.length; i++) {
//					array[up][i] = num++;
//				}
//			} else {
//				for (int i = 4; i >= 0; i--) {
//					array[j][i] = num++;
//				}
//			}
//			up++;
//		}
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
			}

		// 행의 몫이 0 이면 정방향 아니면 역방향

//		array[0][0] = 21;
//		array[0][1] = 22;
//		array[0][2] = 23;
//		array[0][3] = 24;
//		array[0][4] = 25;
//		System.out.println();
//	
//		array[1][0] = 30;
//		array[1][1] = 29;
//		array[1][2] = 28;
//		array[1][3] = 27;
//		array[1][4] = 26;
//		System.out.println();
//		
//		array[2][0] = 31;
//		array[2][1] = 32;
//		array[2][2] = 33;
//		array[2][3] = 34;
//		array[2][4] = 35;
//		System.out.println();
//		
//		array[3][0] = 40;
//		array[3][1] = 39;
//		array[3][2] = 38;
//		array[3][3] = 37;
//		array[3][4] = 36;
//		System.out.println();

	}

}
