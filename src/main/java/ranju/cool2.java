package ranju;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class cool2 {
public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/KFI","root","root");
		Statement statement=connection.createStatement();
		statement.execute("insert into collection values(3,'Salaga','vijay',100)");
		connection.close();
	}
}
