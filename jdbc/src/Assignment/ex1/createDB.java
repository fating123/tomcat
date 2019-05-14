package Assignment.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class createDB {
	public static void main(String[] args) {
		Statement stmt=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
			stmt=con.createStatement();
			String sql="create database student";
			stmt.executeUpdate(sql);
			System.out.println("database created successfully");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
