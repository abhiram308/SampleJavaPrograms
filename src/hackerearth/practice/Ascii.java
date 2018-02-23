package hackerearth.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ascii {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char c = br.readLine().charAt(0);
		System.out.println((int) c);
	}
}
