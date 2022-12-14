package ranju;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Cool {
	public static void main(String[] args) throws Exception {
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
	Statement statement=connection.createStatement();
	statement.execute("create database KFI");
	connection.close();
}
}