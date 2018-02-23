package org.test.practice;

public class Marble {
	public static void main(String[] args) {
		Marble mar = new Marble();

		mar.go();

	}

	private void go() {
		// TODO Auto-generated method stub
		int z = 0;
		for (int i = 0; i < 5; i++, z++) {
			System.out.println(z);
		}
		for (;;) {
			System.out.println("hello");
		}
	}
}
