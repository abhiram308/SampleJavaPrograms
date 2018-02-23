package org.test.practice;

public class RotateArrayCodility {
	public static void main(String[] args) {
		int[] inputArray = new int[] { 3, 8, 9, 7, 6 };
		int k = 3;

		int arrayLength = inputArray.length;
		k = k % arrayLength;
		int[] temp = new int[k];

		for (int i = arrayLength - k, j = 0; i < arrayLength; i++, j++) {
			temp[j] = inputArray[i];
		}

	}
}
