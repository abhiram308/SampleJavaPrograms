package hackerearth.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumbers {
	public static void main(String args[]) throws Exception {
		getPrimeNumbersTillN();
	}
	
	private static void getPrimeNumbersTillN() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for (int i = 2; i < N; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i+ " ");
			}
		}
	}
}
