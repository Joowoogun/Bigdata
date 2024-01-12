package 보충0111;

public class Ex02 {

	public static void main(String[] args) {
		
		// 이중 for문 --> for문을 중첩 시킨 구조
		// i=0 , j=0 .... 출력! 
		// i=0 , j=1 .... 출력!
		// i=0 , j=2 
		// i=1 , j=0 .... 출력!
		// i=1 , j=1 .... 출력!
		// i=1 , j=2 
		// i=2 , j=0 .... 출력!
		// i=2 , j=1 .... 출력!
		// i=2 , j=2 ....
		// i=3 , for문 종료
		for(int i =0;i<3; i++) {
			for(int j =0; j<2; j++) {
				System.out.println("출력!");
			}
		}
		
		

	}

}
