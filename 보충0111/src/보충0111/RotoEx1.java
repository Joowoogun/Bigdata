package 보충0111;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class RotoEx1 {

	public static void main(String[] args) {
		//
		Random ran = new Random();
		
		int[] roto = new int[6];
		
		for (int i = 0; i < roto.length; i++) {
			
			roto[i] = ran.nextInt(10)+1;
			for (int j = 0; j < i; j++) {
				if(roto[i]== roto[j]) {
					i--;
				}
				
			}
			
		}
		
		System.out.println(Arrays.toString(roto));
		
		
		
		
		
		
		
		
		
		
		

	}

}
