package mod12.drivers;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface DatabaseDriver {

	/**
	 * Connects to the database.
	 * @throws SQLException
	 */
	void connect() throws SQLException;

	/**
	 * Performs a retrieval from the database (ie: SELECT)
	 * @param query Query to send to database.
	 * @return Returns the results as a ResultSet
	 * @throws SQLException Thrown if problem performing query.
	 */
	ResultSet get(String query) throws SQLException;

	/**
	 * Performs an update query (UPDATE, DELETE, DROP, etc.) on the database.
	 * @param query Query to send to database.
	 * @return Number of rows modified.
	 * @throws SQLException
	 */
	int update(String query) throws SQLException;

	/**
	 * Disconnects from the database.
	 * @throws SQLException
	 */
	void disconnect() throws SQLException;

}