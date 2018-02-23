package org.test.practice;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ImmutableClass {
	final int age;
	final String name;

	public ImmutableClass() {
		this.age = 0;
		this.name = "";
	}
}
