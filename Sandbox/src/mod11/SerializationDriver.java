package mod11;

import java.io.*;

public class SerializationDriver {

	public static void main(String[] args) {

		try {
			/* SERIALIZATION */
			// create the FileOutputStream object
			FileOutputStream fos = new FileOutputStream("res/mod11test.bin");

			// create the ObjectOutputStream object
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			// create a String
			String testString = "happy birthday, mom";

			// serialize that String
			oos.writeObject(testString);

			// close the FileOutputStream & ObjectOutputStream objects
			oos.close();
			fos.close();

			/* DE-SERIALIZE */
			// create our FileInputStream object
			FileInputStream fis = new FileInputStream("res/mod11test.bin");

			// create our ObjectInputStream object
			ObjectInputStream ois = new ObjectInputStream(fis);

			// read the object
			String inputString = (String) ois.readObject();

			// display what we read:
			System.out.println("Object read: " + inputString);

			// close the streams
			ois.close();
			fis.close();

		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Sorry, something went wrong.");
		}

	}

}
