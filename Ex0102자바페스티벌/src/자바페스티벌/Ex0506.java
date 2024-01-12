package 자바페스티벌;

import java.util.Iterator;
import java.util.Scanner;

public class Ex0506 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("==== 채점하기 ====");
		String ox = sc.next();
		int cnt = 0;
		int total = 0;
		for (int i = 0; i < ox.length(); i++) {

			char OX = ox.charAt(i);
			if (OX == 'o') {
				cnt++;
				total += cnt;
			} else if (OX == 'x') {
				cnt = 0;
			}
		}
		System.out.println(total);

	}
}
