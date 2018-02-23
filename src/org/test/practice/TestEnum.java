/**
 * Java code example for enum with value, getting that value and using ordinal method
 * Author: Abhiram Hatolkar
 */

package org.test.practice;

enum Currency {
	INR ("Indian Rupees"), USD ("US Dollar");
	private String name;
	
	Currency(String name) {
		this.name = name;
	}
	
	public String getValue() {
		return this.name;
	}
	
	public static Currency getCurrencyOf(String arg) {
		for(Currency currency : values()) {
			if (currency.getValue().equals(arg)) {
				return currency;
			}
		}
		return null;
	}
}

/**
 * java.lang.enum.oridinal method returns a constant viz it's position in enum declaration 
 */

public class TestEnum {
	public static void main(String[] args) {
		Currency currency = Currency.getCurrencyOf("US Dollar");
		System.out.println(currency.getValue());
		System.out.println(Currency.INR.getValue());
		System.out.println("Ordinal for USD " + currency.ordinal());
		System.out.println(currency);
	}
}