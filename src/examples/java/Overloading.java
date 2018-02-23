package examples.java;

class A {
	String d;
}

public class Overloading {
	public static void main(String[] args) {
		Overloading overloading = new Overloading();
//		overloading.doSomething(null); -------> compilation failure
		A a = new A();
		
		overloading.doSomething(a.d);
		
	}
	
	public void doSomething(String input) {
		System.out.println("in string");
	}
	
	public void doSomething(Integer input) {
		System.out.println("in int");
	}
}
