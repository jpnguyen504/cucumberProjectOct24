package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {

	Connection connection;
	Statement statement;
	ResultSet resultSet;
	String columnValue;

	public String getDataFromDb(String columnName) {
		try {
//			Set properties of mysql
//			Calls the jdbc driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			String sqlUrl = "jdbc:mysql://localhost:3306/august2024";
			String sqlUsername = "root";
			String sqlPassword = "root";
			String sqlQuery = "Select * from users;";

//			Create a connection to the local database
//			Connection = interface, conn = reference variable
			connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);

//			Give power to the Connection reference variable to execute queries
//			defining the statement reference variable
			statement = connection.createStatement();

//			Deliver the queries
//			define the resultSet variable
			resultSet = statement.executeQuery(sqlQuery);

			while (resultSet.next()) {
				columnValue = resultSet.getString(columnName);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(statement!=null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return columnValue;
	}
}
