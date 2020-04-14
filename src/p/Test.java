package p;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Test {
	public static void main(String[] args) {
		ObjectOutputStream objectOutputStream = new ObjectOutputStream("abc.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(objectOutputStream);

	}

}