package geeks.basic;

import java.util.Arrays;

public class ChocolateDistributionProblem {
	
	public static void main(String[] args) {
		int[] inputArray = new int[] {7, 3, 2, 4, 9, 12, 56};
		int arrayLength = inputArray.length;
		int m=3;
// 1 3 4 7 9 9 12 56
		Arrays.sort(inputArray);
		
		int leastDifference = 999999;
		
		for(int i = 0; i <= arrayLength-m; i++) {
			int difference = inputArray[arrayLength-m+i+1] - inputArray[i];
			
			if(difference < leastDifference) {
				leastDifference = difference;
			}
		}
		
		System.out.println(leastDifference);
	}
}
