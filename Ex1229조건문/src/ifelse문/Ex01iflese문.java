package ifelse문;

import java.util.Scanner;

public class Ex01iflese문 {

	public static void main(String[] args) {
		// 입력도구 꺼내기
		Scanner sc = new Scanner(System.in);
		// 점수 입력
		System.out.print("점수를 입력해 주세요 >> ");
	    int score = sc.nextInt();
		// 60점 이상인지 조건 판별
	    if(score >= 60) {
	    	System.out.println("합격입니다. ");
	    } else {
	    	System.out.println("나가리~. ");
	    }
		
		
		
		
		
		
		
		

	}

}
