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
			int numStudentsAdded = driver.update("INSERT INTO student ....");
			// print out the number of students affected
			if (numStudentsAdded == 0)
				System.out.println("No student were added.");
			else
				System.out.println(numStudentsAdded + " students were added.");

			// update at least one student based on GPA: all failing students now have a 2.0
			// print out the number of students affected

			// delete a student
			// print out the number of students affected

			// disconnect
		} catch (SQLException e) {
			System.out.println("Something went wrong.");
		}

	}

}
