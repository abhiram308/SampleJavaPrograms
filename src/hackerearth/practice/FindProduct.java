package hackerearth.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
 * 
 * */
public class FindProduct {
	public static void main(String[] args) throws Exception{
		findProduct();
	}

	private static void findProduct() throws Exception {
		long someNumber = 1000000000L;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputLength = Integer.parseInt(br.readLine());
		StringTokenizer tk = new StringTokenizer(br.readLine());
		List<Integer> input = new ArrayList<Integer>();
		long answer = 1L;
		for (int i = 0; i < inputLength; i++) {
			String token = tk.nextToken();
			Integer newInt = Integer.valueOf(token);
			input.add(newInt);
			answer = (answer * newInt) % (someNumber + 7);
		}
		System.out.println(answer);
	}
}
