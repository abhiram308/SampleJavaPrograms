package examples.java;

import java.util.HashMap;
import java.util.Map;

public class ReturnFromTryCatchFinally {
	public static void main(String[] args) {
		System.out.println("hello");
		int ret = doSomething();
		System.out.println("world " + ret);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("", "");
		StringBuilder s;
	}

	private static int doSomething() {
		try {
			System.out.println(1);
			return 1;
		} catch (Exception e) {
			System.out.println(2);
			return 2;
		} finally {
			System.out.println(3);
			return 3;
		}
	}
}