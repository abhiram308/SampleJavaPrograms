package java8;

public class SampleLambda {

	public static void main(String[] args) {

//		java 7 implementation
		SampleLambdaInterface sampleLambdaInterface = new SampleLambdaInterface() {
			@Override
			public void doThis() {
				System.out.println("inside doThis of direct impl");
			}
		};

		sampleLambdaInterface.doThis();

//		java 8 implementation
		SampleLambdaInterface sampleLambdaInterface2 = () -> System.out.println("inside lambda");
		
		sampleLambdaInterface2.doThis();
	}

	public static void doSomething() {
		System.out.println("hello world");
	}

}

interface SampleLambdaInterface {
	public void doThis();
}
