package examples.java;

/*
  n=3
  1*2*3*10*11*12
  --4*5*8*9
  ----6*7
  
 * */

public class tracxn {

	public static void main(String[] args) {
		print(3);
	}

	public static void print(int n) {
		int lineNumber = 0;
		int j=0;
		int maxNumber = n * (n+1);
		for (int i = 0; i < n; i++) {
			int numberOfWordsInLine = (n * 2) - (lineNumber * 2);
			for (int l = 0; l < lineNumber*2; l++) {
				System.out.print('-');
			}
			for (int k=1; k <= numberOfWordsInLine / 2; k++) {
				System.out.print(++j + " ");
			}
			
			for (int k = maxNumber-(numberOfWordsInLine/2)+1; k <= maxNumber; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
			lineNumber++;
			maxNumber = maxNumber - numberOfWordsInLine;
		}
	}
}
