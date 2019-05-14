package prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Selectpstmt {
	public static void main(String[] args) throws Exception {
		System.out.println(1);
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println(2);
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		System.out.println(3);
		Statement stmt =connection.createStatement();
		String sql="SELECT * FROM employee e";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()){
			String eid=rs.getString("eid");
			System.out.println("eid >>>>"+eid);
			String ename=rs.getString("ename");
			System.out.println("ename  >>>>>"+ename);
	}

}
}
