package hackerearth.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * Dhananjay has recently learned about ASCII values.He is very fond of experimenting. With his knowledge of ASCII values and character he has developed a special word and named it Dhananjay's Magical word.
A word which consist of alphabets whose ASCII values is a prime number is an Dhananjay's Magical word. An alphabet is Dhananjay's Magical alphabet if its ASCII value is prime.
Dhananjay's nature is to boast about the things he know or have learnt about. So just to defame his friends he gives few string to his friends and ask them to convert it to Dhananjay's Magical word. None of his friends would like to get insulted. Help them to convert the given strings to Dhananjay's Magical Word.
Rules for converting:
1.Each character should be replaced by the nearest Dhananjay's Magical alphabet.
2.If the character is equidistant with 2 Magical alphabets. The one with lower ASCII value will be considered as its replacement.

Input format:
First line of input contains an integer T number of test cases. Each test case contains an integer N (denoting the length of the string) and a string S.

Output Format:
For each test case, print Dhananjay's Magical Word in a new line.
 * */
public class MagicalWord {
	public static void main(String[] args) throws Exception{
		List<String> primes = getPrimeAscii(); 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		br.readLine();
		String word = br.readLine();
	}
	
	private static List<String> getPrimeAscii() {
		List<String> primes = new ArrayList<String>();
		primes.add("67");
		primes.add("71");
		primes.add("73");
		primes.add("79");
		primes.add("83");
		primes.add("89");
		
		primes.add("97");
		primes.add("101");
		primes.add("103");
		primes.add("107");
		primes.add("109");
		primes.add("113");
		
		return primes;
	}
}
