package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PersonObjectPrinterUsingLambda {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("abhi", "hat"), new Person("dany", "targ"),
				new Person("jon", "snow"));

		Predicate<Person> predicate = (person) -> person.getFirstName().equals("abhi");
		Consumer<Person> consumer = (person) -> System.out.println(person);
		print(persons, predicate, consumer);

		Consumer<Person> consumer1 = (person) -> System.out.println(person.getFirstName());
		print(persons, predicate, consumer1);
	}

	public static void print(List<Person> persons, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person person : persons) {
			if (predicate.test(person)) {
				consumer.accept(person);
			}
		}
	}
}
