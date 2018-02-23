package rank.data.structures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		
		for(int i = 0; i < N; i++) {
			array[i] = br.read();
		}
		System.out.println();
		for(int i = 0; i < N; i++) {
			System.out.print(array[i]);
		}
    }
}
