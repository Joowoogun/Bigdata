package switch문;

import java.util.Scanner;

public class Ex01학점계산프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요 >>");
		int totalScore = sc.nextInt();
		// 학점 계산 --> switch문으로
		char grade = 'A';
		switch (totalScore/10){
		    case 10 :
			case 9:
			    grade = 'A';
			    break;
			case 8:
			    grade = 'B';
			    break;
			case 7:
				grade = 'C';
				break;
			default :
			    grade = 'D';
			    break;
			
			
				
				
			
		}
		System.out.println(grade + "학점입니다.");
		
		
		
		
		
		

	}

}
