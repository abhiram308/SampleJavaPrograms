package org.test.practice;

public class ArrayEquilibriumElement {
	public static void main(String[] args) {
		int[] array = new int[] {1, 2, -3, 0};
		long sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("sum " + sum);
		long leftSum = 0;
		int probableAnswer = 0;
		for(int i = 0; i < array.length; i++) {
			leftSum += array[i];
			if(leftSum > sum / 2) {
				probableAnswer = i;
				leftSum -= array[i];
				break;
			} else if (leftSum == sum/2) {
				probableAnswer = i + 1;
				break;
			}
		}
	
		long rightSum=0;
		for (int i = probableAnswer + 1; i < array.length; i++) {
			rightSum += array[i];
		}
		System.out.println("leftSum : " + leftSum + " rightSum : " + rightSum);
		if(leftSum == rightSum) {
			System.out.println(probableAnswer);
		} else {
			System.out.println("No equilibrium");
		}
	}
}
