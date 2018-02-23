package org.test.practice;

import org.test.practice.class1.CoffeeSize;

public class AbstractClassExample {
	 public static void main(String[] args) {
		subclass sub = new subclass();
	
		sub.methodOne();
		someInterface.useThis();
			
	 }
}

abstract class someAbstractClass implements someInterface, someOtherInterface{
	public abstract void impletmentThisMethod();
	CoffeeSize cs = CoffeeSize.LARGE;
	public void NotCompulsoryToImplementThis() {}
	
	protected void methodOne() {
		System.out.println("methodOne -- superclass");
	}
	
	
}

class class1 {
	enum CoffeeSize{SMALL, MEDIUM, LARGE}
	
}

class subclass extends someAbstractClass{

	@Override
	public double interfaceMethod() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void impletmentThisMethod() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void methodOne() {
		System.out.println("methodOne -- subclass");
	}
	
	
}

interface someInterface {
	
	int pi = 3;
	
	static int useThis(){
		System.out.println("useThis() method in someInterface");
		return 0;
	}

}


interface someOtherInterface {
	static double useThis() {
		return 3.4D;
	}
	
	public double interfaceMethod();
}