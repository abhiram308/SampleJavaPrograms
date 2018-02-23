package org.test.practice;

public class SingletonSample {
	private static SingletonSample singleton = new SingletonSample();
	
	private SingletonSample() {
		System.out.println("in private constructor SingletonSample");
	}
	
	public static SingletonSample getInstance() {
		System.out.println("in getInstance SingletonSample");
		return singleton;
	}
	public static void main(String[] args) {
		// in private constructor SingletonSample comes before in main
		System.out.println("in main");
		SingletonSample.getInstance();
	}
}
