package ranju;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class tester3 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/kfi","root","root");
		Statement statement=connection.createStatement();
		statement.executeUpdate("drop table collection");
		connection.close();
		//System.out.println("Database created");
	}
}
