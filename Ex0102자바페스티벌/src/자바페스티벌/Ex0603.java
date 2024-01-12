package 자바페스티벌;

public class Ex0603 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int num = 1;
		for (int j = 0; j < arr.length; j++) {
			
			for (int i = 4; i >= 0; i--) {
				
				arr[i][j] = num++;
			}
		}
		System.out.println("90도 회전");
		// 출력문
		for (int j = 0; j < arr.length; j++) {

			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		
		
		

	}

}
