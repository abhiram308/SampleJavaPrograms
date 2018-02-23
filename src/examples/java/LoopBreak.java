package examples.java;

public class LoopBreak {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			if(i==3) {break;}
			
			System.out.println(i);
		}
	}
}
