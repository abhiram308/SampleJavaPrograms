package org.test.practice;

class A {
	
	public A() {
		B b;
		b = new B();
	}
}

class B {
	
	public B() {
		A a;
		a = new A();
	}
}
public class CyclicDependancy {
	public static void main(String[] args) {
		A a = new A();
	}
}
