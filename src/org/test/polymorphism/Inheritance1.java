package org.test.polymorphism;

public class Inheritance1 {
	public static void main(String[] args) {
		base b = new derived();
//		System.out.println(b.a);
	}
}

class base {
	int a = 10;
	
	private final void method1() {
		System.out.println("base method1");
	}
	
	void method2() {
		System.out.println("base method2");
	}
}

class derived extends base {
	int a = 20;
	
	private final void method1() {
		System.out.println("derived method1");
	}
	void method2() {
		System.out.println("derived method2");
	}
}

