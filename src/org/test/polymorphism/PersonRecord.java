package org.test.polymorphism;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class PersonRecord extends ConsumerRecord{
	private String firstName;
	private String lastName;
	
	public void doSomething() {
		System.out.println("person do somthing");
	}
	
}
