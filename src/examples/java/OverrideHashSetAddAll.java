package examples.java;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

class ExtendHashSetAddAll<E> extends HashSet<E> {
	private int count;

	public ExtendHashSetAddAll() {
		count = 0;
	}

	public int getCount() {
		return count;
	}

	@Override
	public boolean add(E e) {
		count++;
		System.out.println("count in add: " + count);
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		count++;
		System.out.println("count in addAll: " + count);
		return super.addAll(c);
	}
}

public class OverrideHashSetAddAll {
	public static void main(String[] args) {
//		ExtendHashSetAddAll extendHashSetAddAll = new ExtendHashSetAddAll();
//		extendHashSetAddAll.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
//		System.out.println(extendHashSetAddAll.getCount());
		
		classB b = new classB();
		b.method2();
	}
}

class classA {
	public void method1() {
		System.out.println("A1");
	}

	public void method2() {
		method1();
		System.out.println("A2");
	}
}

class classB extends classA {
	@Override
	public void method1() {
		System.out.println("B1");
	}

	@Override
	public void method2() {
		super.method2();
		System.out.println("B2");
	}
}