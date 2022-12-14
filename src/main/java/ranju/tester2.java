package ranju;
import java.sql.*;
public class tester2 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/kfi","root","root");
		Statement statement=connection.createStatement();
	    statement.executeUpdate("delete from collection where no=1");
		connection.close();
		//System.out.println("Database created");
	}
}
