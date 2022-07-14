package mod11;

import java.io.*;

public class SerializationAgainDriver {

	public static void main(String[] args) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("res/str.bin"));

			StringBuilder sb = new StringBuilder("a");
			oos.writeObject(sb);

			sb.append("b"); // Changes StringBuilder to "ab"

			oos.reset(); // this "forgets" what we already serialized

			oos.writeObject(sb);

			oos.close();

			// now de-serialize
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("res/str.bin"));

			StringBuilder result = (StringBuilder) ois.readObject();
			System.out.println(result);

			result = (StringBuilder) ois.readObject();
			System.out.println(result);

			oos.close();

		} catch (Exception e) {
			System.out.println("Something went wrong. Sorry.");
		}
	}

}
