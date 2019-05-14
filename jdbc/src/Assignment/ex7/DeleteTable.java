package Assignment.ex7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTable {
	public static void main(String[] args) {
		Statement stmt=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
			stmt=con.createStatement();
			String sql="drop table person";
			stmt.executeUpdate(sql);
			System.out.println("Table deleted from database");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
