package ranju;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class tester4 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		Statement statement=(Statement) connection.createStatement();
		statement.executeUpdate("drop database kfi");
		connection.close();
		//System.out.println("Database created");
	}
}
