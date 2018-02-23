package java8;

public class Person {
	private String firstName;
	private String lastName;
	
	public Person(String firstname, String lastname) {
		this.firstName = firstname;
		this.lastName = lastname;
	}
	public String toString() {
		return "Firstname: " + firstName + " Lastname: " + lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
