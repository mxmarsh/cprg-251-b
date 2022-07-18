package mod11.practice;

import java.io.*;
import java.util.ArrayList;

public class DeserializeDemo {

	public static void main(String[] args) {
		try {
			// create our stream objects
			FileInputStream fis = new FileInputStream("res/students.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			// read the objects
			ArrayList<Student> students = (ArrayList<Student>) ois.readObject();

			// display them to the screen
			for (Student student : students) {
				System.out.println(student);
			}

			// close the streams
			ois.close();
			fis.close();
		} catch (Exception e) {
			System.out.println("Sorry, something went wrong.");
			e.printStackTrace();
		}

	}

}
