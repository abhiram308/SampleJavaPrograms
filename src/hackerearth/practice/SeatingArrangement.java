package hackerearth.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SeatingArrangement {
	public static void main(String[] args) throws Exception {
		process();
	}

	public static void process() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			int remainder = N % 12;
			int difference = 13 - remainder;
			int quotient = N / 12;
			int completedSegment = 12 * quotient;
			System.out.print(completedSegment + difference);
			System.out.print(" ");
			int seat = N % 6;
			if (seat == 0 || seat == 1) {
				System.out.print("WS");
			} else if (seat == 2) {
				System.out.print("MS");
			} else {
				System.out.print("AS");
			}
			System.out.println();
		}
	}
}
