package mod8;

import java.io.*;

public class Sandbox {

	public static void main(String[] args) {

		try {
			// create a RAF object
			File f = new File("res/mod8test.bin");
			RandomAccessFile raf = new RandomAccessFile(f, "rw");

			// go to the start of the file
			raf.seek(0);

			// write a value into the file
			// raf.writeBoolean(true);
			raf.writeInt(42);

			// go BACK to the start of the file
			raf.seek(0);

			// read the values from the file
			// boolean b = raf.readBoolean();
			// byte x = raf.readByte();
			float x = raf.readFloat();

			// print out the value we read:
			// System.out.println("The boolean value is " + b);
			// System.out.println("The byte value is " + x);
			System.out.println("The float value is " + x);

			// close the RAF
			raf.close();

		} catch (IOException e) {
			System.out.println("Something went wrong.");
		}

	}

}
