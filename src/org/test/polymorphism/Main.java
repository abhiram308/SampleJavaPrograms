package org.test.polymorphism;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
//		superClass object1 = new subClass();
//		object1.superClassMethod1();
		
		Animal animal1 = new Animal();
		animal1.makeNoise();
		Animal animal2 = new Dog();
		animal2.makeNoise();

//		Animal[] a = { new Animal(), new Dog(), new Animal() };
//		for (Animal animal : a) {
//			animal.makeNoise();
//			if (animal instanceof Dog) {
//				((Dog) animal).playDead(); // try to do a Dog behavior ?
//			}
//		}

	}
}

class superClass {
	public void superClassMethod1() throws FileNotFoundException {

		System.out.println("in superclass method1");
	}

	private void somePrivateMethodInSuperClass() {
		System.out.println("in private method in superclass");
	}
}

class subClass extends superClass {
	public void superClassMethod1() {
		System.out.println("in subclass method 1");
	}
}

interface simpleInterface {
	void doThis();
}

// class Animal implements simpleInterface {
// public void eat() throws Exception {
// // throws an Exception
// }
//
// @Override
// public void doThis() {
// // TODO Auto-generated method stub
//
// }
// }
//
// class Dog2 extends Animal implements simpleInterface {
// public void eat() {
// /* no Exceptions */}
//
// public static void main(String[] args) {
// Animal a = new Dog2();
// Dog2 d = new Dog2();
// d.eat(); // ok
// // a.eat(); // compiler error -unreported exception
// }
// }

class Animal {
	void makeNoise() {
		System.out.println("generic noise");
	}
}

class Dog extends Animal {
	void makeNoise() {
		System.out.println("bark");
	}

	void playDead() {
		System.out.println("roll over");
	}
}