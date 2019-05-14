package Assignment.ex8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DropDB {
	public static void main(String[] args) {
		Statement stmt=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			System.out.println("Deleting Database.........");
			stmt=con.createStatement();
			String sql="drop database student";
			stmt.executeUpdate(sql);
			System.out.println("Database Deleted Successfully");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
