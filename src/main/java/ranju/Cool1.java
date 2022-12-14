package ranju;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Cool1 {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/KFI","root","root");
		Statement statement=connection.createStatement();
		statement.execute("create Table collection(no integer primary key,Moviename Varchar(40),Hero varchar(30),collection bigint unique)");
		connection.close();
	}
}
