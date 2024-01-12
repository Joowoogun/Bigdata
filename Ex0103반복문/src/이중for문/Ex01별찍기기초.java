package 이중for문;

public class Ex01별찍기기초 {

	public static void main(String[] args) {

		// *****

		int cnt = 1;

		for (cnt = 1; cnt < 26; cnt++) {

			System.out.print("*");
			
			if(cnt%5==0) {
				System.out.println();
			}
			
			

		}

	}

}
