package examples.java;

import java.text.NumberFormat;
import java.text.ParseException;

public class InvalidStringToNumber {
	public static void main(String[] args) throws ParseException {
		String s = "123.23456abcd";
		NumberFormat n = NumberFormat.getInstance();
		n.setMaximumFractionDigits(2);
		System.out.println(n.parse(s));
	}
}
