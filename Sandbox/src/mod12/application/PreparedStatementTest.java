package mod12.application;

import java.sql.*;

public class PreparedStatementTest {

	private static final String SERVER = "localhost";
	private static final int PORT = 3306;
	private static final String DATABASE = "cprg251";
	private static final String USERNAME = "cprg251";
	private static final String PASSWORD = "password";

	public static void main(String[] args) {

		String dsn = getDsn();
		try {
			// connect to the db
			Connection connection = DriverManager.getConnection(dsn);

			// create our prepared statement
			String query = "SELECT * FROM student WHERE gpa <= ? OR name = ?";
			PreparedStatement ps = connection.prepareStatement(query);

			// replace the placeholders
			double placeholderGpa = 2.0;
			String placeholderName = "Joe Blow"; // TO DO: get these values from the user
			ps.setDouble(1, placeholderGpa); // can we re-set it later? YES
			ps.setString(2, placeholderName);

			// execute the statement
			ResultSet rs = ps.executeQuery();

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
				System.out.println("GPA:  " + gpa); // TO DO: create Student objects
			}

			// disconnect
			connection.close();
		} catch (SQLException e) {
			System.out.println("Something went wrong.");
			e.printStackTrace();
		}
	}

	private static String getDsn() {
		// Data source name is formatted as follows (for MariaDB):
		// jdbc:mariadb://localhost:3306/DB?user=root&password=myPassword
		String dataSourceName = String.format("jdbc:mariadb://%s:%d/%s?user=%s&password=%s", SERVER, PORT, DATABASE,
				USERNAME, PASSWORD);

		return dataSourceName;
	}

}
