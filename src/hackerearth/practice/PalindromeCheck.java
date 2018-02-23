package hackerearth.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeCheck {
	public static void main(String[] args) throws Exception {
		testPalindrome();
	}

	private static void testPalindrome() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		// String line =
		// "fnjzxnxnjplfwzowfdrhrvhegkmoncbkembjoudteqchjwqfzlofyflkmxnooasxulwofjzknthqqxgshvwxdvhdnlzjzdjdiifg";
		int length = line.length();
		StringBuilder reverse = new StringBuilder();
		for (int i = 0; i < length; i++) {
			reverse.append(line.charAt(length - i - 1));
		}
		if (reverse.toString().equals(line)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}
