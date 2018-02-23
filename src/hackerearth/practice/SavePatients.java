package hackerearth.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * A new deadly virus has infected large population of a planet. 
 * A brilliant scientist has discovered a new strain of virus which can cure this disease. 
 * Vaccine produced from this virus has various strength depending on midichlorians count. 
 * A person is cured only if midichlorians count in vaccine batch is more than midichlorians count of person. 
 * A doctor receives a new set of report which contains midichlorians count of each infected patient. 
 * Practo stores all vaccine doctor has and their midichlorians count. 
 * You need to determine if doctor can save all patients with the vaccines he has. 
 * The number of vaccines and patients are equal.
 * */
public class SavePatients {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] vaccineStrengths = new int[N];
		int[] patientStrengths = new int[N];
		
		StringTokenizer ip1 = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			vaccineStrengths [i] = Integer.parseInt(ip1.nextToken());
		}
		StringTokenizer ip2 = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			patientStrengths [i] = Integer.parseInt(ip2.nextToken());
		}
		
		Arrays.sort(vaccineStrengths);
		Arrays.sort(patientStrengths);
	}
}
