package jdbc.insertmultiplestudent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class multipleinsert {
	public static void main(String[] args) throws Exception {
		System.out.println(1);
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println(2);
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		System.out.println(3);
		Statement stmt=connection.createStatement();
		for(int i=0;i<50;i++){
		String sql="insert into employee values ('i','i')";
		int rows=stmt.executeUpdate(sql);
	}

}
}