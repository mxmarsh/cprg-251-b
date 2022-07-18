package mod11.practice;

import java.io.*;
import java.util.ArrayList;

public class SerializeDemo {

	public static void main(String[] args) {
		try {
			// create our stream objects
			FileOutputStream fos = new FileOutputStream("res/students.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			// create some students
			Student bob = new Student(1, "Bob");
			Student moose = new Student(2, "Moose");

			ArrayList<Student> students = new ArrayList<>();
			students.add(bob);
			students.add(moose);
			students.add(new Student(3, "Dana"));

			// write them to a file
			oos.writeObject(students);

			// close the streams
			oos.close();
			fos.close();
		} catch (Exception e) {
			System.out.println("Sorry, something went wrong.");
		}

	}

}
