package examples.java;

import java.math.BigDecimal;

public class CompareDouble extends parent {
	public static void main(String[] args) {
		Double d1 = new Double(2.0f);
		Double d2 = new Double(2.0f);
		short s = 1;
		BigDecimal d3 = new BigDecimal(2.00f);
		BigDecimal d4 = new BigDecimal(2.00f);
		
		System.out.println(d1.equals(d2));
		System.out.println(d3.equals(d4));
//		System.out.println(add(s + 6)); // gives compile time error
		
	}
}

class parent {
	int add (int a, int b) {
		return a + b;
	}
}