package 자바페스티벌;

import java.util.Scanner;

public class Ex0101 {
	
	    // 1일차 1번

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
	    int times = ((time-8)*(7500))+40000;
		if(time<8) {
			System.out.println("총 임금은" + time*5000 + "원 입니다.");
		
			
		} else{
			System.out.print("총 임금은" + times + "원 입니다");
		
		}
		
		
		
		
		
		
 
	}

}
