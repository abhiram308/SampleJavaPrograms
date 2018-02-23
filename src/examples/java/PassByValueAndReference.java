package examples.java;

class someClass {
	public int id;
}

public class PassByValueAndReference {
	public static void main(String[] args) {
	
		someClass obj1 = new someClass();
		obj1.id = 1000;
		
		objectChanger(obj1);
		System.out.println(obj1.id); // prints 2000
	}
	
	private static void objectChanger(someClass objByRef) {
		objByRef.id = 2000;
	}
}
