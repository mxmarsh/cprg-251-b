package mod12.application;

import java.sql.*;

import mod12.drivers.*;

public class SelectTest {

	public static void main(String[] args) {
		// create a MariaDB object
		DatabaseDriver driver = new MariaDBDriver();

		try {
			// connect to the DB
			driver.connect();

			// execute a SQL query
			ResultSet rs = driver.get("SELECT * FROM student");

			// display results
			while (rs.next()) {
				// read their id & print it
				int id = rs.getInt(1);
				System.out.println("ID:   " + id);
				// read their name & print it
				String name = rs.getString(2);
				System.out.println("Name: " + name);
				// read their gpa and print it
				double gpa = rs.getDouble(3);
				System.out.println("GPA:  " + gpa);
			}

			// disconnect
			driver.disconnect();
		} catch (SQLException e) {
			System.out.println("Could not connect to DB.");
		}
	}

}
