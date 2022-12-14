package ranju;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class tester1 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/kfi","root","root");
		Statement statement=connection.createStatement();
		ResultSet e=statement.executeQuery("select * from collection");
		while(e.next())
		System.out.println(e.getInt(1)+" "+e.getString(2)+" "+e.getString(3)+" "+e.getLong(4));
		connection.close();
	}
}
