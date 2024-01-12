package 자바페스티벌메소드;

public class Ex01 {

	public static void main(String[] args) {
		
		
		
		int num1 = 10;
		int num2 = 3;
		boolean result = isDivde(num1, num2);
		System.out.println("결과 확인 : "+result);
		
		
		
		
		

	}
private static boolean isDivde(int num1, int num2) {
	
	boolean divide = false;
	if(num1%num2==0) {
		divide = true;
	}
	
	
	return divide;
}
	
}
