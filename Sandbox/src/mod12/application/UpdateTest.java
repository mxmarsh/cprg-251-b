package mod12.application;

import java.sql.SQLException;

import mod12.drivers.*;

public class UpdateTest {

	public static void main(String[] args) {
		DatabaseDriver driver = new MariaDBDriver();

		try {
			// connect to the db
			driver.connect();

			// add a new student
			String query = "INSERT INTO student (id, name, gpa) VALUES (5, 'test', 1.0), (6, 'test', 1.0)";
			int numStudentsAdded = driver.update(query);
			// print out the number of students affected
			if (numStudentsAdded == 0)
				System.out.println("No student were added.");
			else
				System.out.println(numStudentsAdded + " students were added.");

			// update at least one student based on GPA: all failing students now have a 2.0
			int numStudentsUpdated = driver.update("UPDATE student SET gpa = 2.0 WHERE gpa<2.0");
			// print out the number of students affected
			if (numStudentsUpdated == 0)
				System.out.println("No student were updated.");
			else
				System.out.println(numStudentsUpdated + " students were updated.");

			// delete a student
			int numStudentsDeleted = driver.update("DELETE FROM student WHERE gpa < 3.0");
			// print out the number of students affected
			if (numStudentsDeleted == 0)
				System.out.println("No student were deleted.");
			else
				System.out.println(numStudentsDeleted + " students were deleted.");

			// disconnect
			driver.disconnect();
		} catch (SQLException e) {
			System.out.println("Something went wrong.");
			e.printStackTrace();
		}

	}

}
