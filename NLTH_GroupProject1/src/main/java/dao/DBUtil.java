package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static final String URL = "jdbc:mysql://localhost:3306/census";
	private static final String USER = "root";
	private static final String PASSWORD = "12345";

	public static Connection getConnection() throws ClassNotFoundException, SQLException  {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		return conn;
//		return DriverManager.getConnection(URL, USER, PASSWORD);
	}




}
