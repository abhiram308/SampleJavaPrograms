package org.test.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryGap {
	public static void main(String[] args) {
		int input = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			input = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int counter = 0;
		int max = 0;
		int mod;
		boolean isCounting = false;
		
		while(input > 0) {
			mod = input % 2;
			input = input / 2;
			
			if(mod == 0 && isCounting) {
				counter++;
			} else if (mod == 1) {
				if(counter > max) {
					max = counter;
				}
				
				counter = 0;
				isCounting = true;
			}
		}
		
		/* counter = 0;
		 * max = 0
		 * isCounting = false
		 * 0 1 1 1 --> 14
		 * 0 1 1 0 1 1 0 0 1
		 * while loop till input is not 0 {
		 * 		mod = input%2
		 * 		input = input /2;
		 * 		if (mod == 0 && isCounting) {
		 * 			counter++
		 * 		} else if (mod == 1){
		 * 			if ( counter > max ){
		 * 				max = counter
		 * 			}
		 * 			counter = 0
		 * 			isCounting = true;
		 * 		}
		 * }
		 * */
	}
}
