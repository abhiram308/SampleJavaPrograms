package org.test.practice;

public class testClassForSingleton {

	public static void main(String[] args) {
		// in main comes first here unlike main in the SingletonSample
		System.out.println("in main");
		SingletonSample.getInstance();
	}
}
