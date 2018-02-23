package examples.java;

import java.io.IOException;

public class Inheritence1 {
	public static void main(String[] args) {

	}
}

class implementor implements first, second {
	/* does not complain */
	public void print() {

	}

	/* compiler error */
//	 public void print() throws IOException{
//	
//	 }
	
	/* complains */
//	public void print() throws Exception {
//
//	}

}

class implementor1 implements second {
	/* does not complain */
//	 public void print(){
//	
//	 }

	/* works */
	public void print() throws IOException {

	}

	/* complains */
//	public void print() throws Exception {
//
//	}

}

interface first {
	public void print();
}

interface second {
	public void print() throws IOException;
}