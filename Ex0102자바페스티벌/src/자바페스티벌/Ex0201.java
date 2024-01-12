package 자바페스티벌;

import java.util.Scanner;

public class Ex0201 {

	public static void main(String[] args) {
		
		// 2일차 1번
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		int week = 1;
		
		do { 
			System.out.print(week++ + "주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			
			now -= minus;
			if(now <= goal) {
				break;
			}
			
		} while(true);
		
		System.out.println(now + "kg 달성!! 축하합니다!");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
