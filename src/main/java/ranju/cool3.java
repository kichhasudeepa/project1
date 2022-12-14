package ranju;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class cool3 {
public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/KFI","root","root");
		Statement statement=connection.createStatement();
		statement.executeUpdate("update collection set collection=500 where no=2");
		connection.close();
	}
}
