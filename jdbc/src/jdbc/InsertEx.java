package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertEx {
	public static void main(String[] args) throws Exception {
		System.out.println(1);
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println(2);
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		System.out.println(3);
		Statement stmt=connection.createStatement();
		String sql="insert into employee values ('45','java')";
		int rows=stmt.executeUpdate(sql);
		System.out.println(rows);
	}

}
