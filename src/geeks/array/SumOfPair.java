package geeks.array;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array A[] and a number x, check for pair in A[] with sum as x.
 * Write a C program that, given an array A[] of n numbers and another number x, determines whether or not there exist two elements in S whose sum is exactly x. 
 * */
public class SumOfPair {

	public static void main(String[] args) {
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

		int sum = 16;
		int[] input = new int[] { 1, 4, 45, 6, 10, 8 };

		for (int i = 0; i < input.length; i++) {
			try {
				if (map.get(sum - input[i]) != null) {
					System.out.println(input[i] + "       " + (sum - input[i]));
				}
			} catch (Exception e) {
				// do nothing
				System.out.println("error");
			}

			map.put(input[i], true);
			map.put(sum - input[i], false);
			
		}
	}
}
