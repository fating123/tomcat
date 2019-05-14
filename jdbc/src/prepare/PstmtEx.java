package prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PstmtEx {
	public static void main(String[] args) throws Exception {
		System.out.println(1);
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println(2);
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		System.out.println(3);
		PreparedStatement pstmt=connection.prepareStatement("insert into employee values ('33','selenium')");
		int pp=pstmt.executeUpdate();
		System.out.println(pp);
	}

}
