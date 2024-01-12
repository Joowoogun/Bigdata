package for문;

import java.util.Scanner;

public class Ex06곱셈누적77 {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 1;
		for(int i = 77; i > 0; i--) {    // i: 77 --> 1
			sum += (i*num);              // num : 1 --> 77
			num++;
			
		}
		System.out.println(sum);
		
		
		
		
		
		
		
//		int minus = 77;
//		int plus = 1;
//		
//		for(plus = 1; plus <= 77;  plus++) {
//			
//		    int result = plus*minus;
//			minus--;
//			result += result;
//			if(minus == 1) {
//				System.out.println(result);
//			}
//		    
//			
//		}
		
		
		
		
		

	}

}
