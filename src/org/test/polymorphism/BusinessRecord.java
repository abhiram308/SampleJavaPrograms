package org.test.polymorphism;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BusinessRecord extends ConsumerRecord {
	private String doingBusinessAs;
	private String name;
	private String fedId;

	public void makeNoise() {
		System.out.println("Business making noise");
	}

	public void doSomething() {
		System.out.println("business do somthing");
	}

}
