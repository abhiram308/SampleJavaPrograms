package examples.java;

/*
 * To print anything on the screeen one needs to copy it to the "stdout" file. 
 * So when we call System.out.println(), it copies the value of its parameter into the stdout file 
 * and we know that copying a string will take O(n) where n is the length of the string. 
 * 
 * If System.out.println()'s time complexity is O(1) both the statements will take nearly same time otherwise you'll see the difference.
 * */
public class Sysout {
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; ++i)
//			System.out.println("a");
		 System.out.println(
		 "asdhasdyasiluftyiufhiuasydfujshaskljdaklsdhkajsasdjhakjshakjsfgajskgjfgdsajfgasdkjgadviuasgdfmnasdbfjgsdyjakdhggggggggcjhasdfjkgsjkdfgsdfhgdsfdsfgalsdkjfdhkagsdjkasdjd");
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println(elapsedTime);

	}
}
