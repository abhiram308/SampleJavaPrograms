package org.test.polymorphism;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConsumerRecord {
	private String id;
	private String description;
	private String ownerEnterpriseId;
	
	public void doSomething() {
		System.out.println("consumer do somthing");
	}
	
}
