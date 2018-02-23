package hackerearth.practice;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountDivisors {

    public static void main(String[] args) throws Exception {
        calculateDivisors();
    }

    private static void calculateDivisors() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;
        for(int i = L; i <= R; i++ ) {
            if(i%K==0) {
                count++;
                continue;
            }
        }
        System.out.println(count);

    }
}
