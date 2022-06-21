package mod8;

import java.io.*;

public class StudentExercise {

	private static RandomAccessFile raf;
	private final static byte RECORD_LENGTH = 77 + 1 + 4 + 1;
	// 75 chars for name, 1 byte for age, 4 bytes for GPA, 1 byte for active

	public static void main(String[] args) {

		try {
			raf = new RandomAccessFile("res/students.bin", "rw");

			writeStudents();

			displayStudents();

			displayActiveStudents();

			raf.close();

		} catch (IOException e) {
			System.out.println("Something went wrong.");
		}
	}

	private static void writeStudents() throws IOException {
		// put pointer at start of file:
		raf.seek(0);

		// write Joe Blow, age 23, GPA 2.1, Active
		raf.writeUTF(String.format("%-75s", "Joe Blow"));
		raf.writeByte(23);
		raf.writeFloat(2.1f);
		raf.writeBoolean(true);

		// write John Smith, age 45, GPA 3.7, Not Active
		raf.writeUTF(String.format("%-75s", "John Smith"));
		raf.writeByte(45);
		raf.writeFloat(3.7f);
		raf.writeBoolean(false);

		// write Jane Doe, age 41, GPA 2.9, Active
		raf.writeUTF(String.format("%-75s", "Jane Doe"));
		raf.writeByte(41);
		raf.writeFloat(2.9f);
		raf.writeBoolean(true);

		// write Tom Cruise, age 71, GPA 1.5, not Active
		raf.writeUTF(String.format("%-75s", "Tom Cruise"));
		raf.writeByte(71);
		raf.writeFloat(1.5f);
		raf.writeBoolean(false);
	}

	private static void displayStudents() throws IOException {
		// put pointer at start of file:
		raf.seek(0);

		// loop through and display each student
		for (int counter = 0; counter < raf.length(); counter += RECORD_LENGTH) {
			System.out.println("Student #" + (counter / RECORD_LENGTH + 1) + " : " + raf.readUTF().trim()
					+ "\nStudent age: " + raf.readByte() + "\nStudent GPA: " + raf.readFloat() + "\nStudent Active: "
					+ raf.readBoolean() + "\n");

		}

	}

	private static void displayActiveStudents() {

	}

}
