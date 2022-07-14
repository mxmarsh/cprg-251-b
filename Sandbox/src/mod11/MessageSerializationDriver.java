package mod11;

import java.io.*;

public class MessageSerializationDriver {

	public static void main(String[] args) {
		try {
			/* SERIALIZATION */
			// create the FileOutputStream object
			FileOutputStream fos = new FileOutputStream("res/mod11messagetest.bin");

			// create the ObjectOutputStream object
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			// create a Message
			Message m = new Message("hello");

			// serialize it
			oos.writeObject(m);

			// close the FileOutputStream & ObjectOutputStream objects
			oos.close();
			fos.close();

			/* DE-SERIALIZE */
			// create our FileInputStream object
			FileInputStream fis = new FileInputStream("res/mod11messagetest.bin");

			// create our ObjectInputStream object
			ObjectInputStream ois = new ObjectInputStream(fis);

			// read the object
			Message inputMessage = (Message) ois.readObject();

			// display what we read:
			System.out.println("Object read: " + inputMessage);

			// close the streams
			ois.close();
			fis.close();

		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Sorry, something went wrong.");
		}

	}

}
