package Assignment.ex2;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public class Createtable {
	public static void main(String[] args) {
		Statement stmt=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
		stmt=con.createStatement();
		String sql="CREATE TABLE person"+"(id INTEGER not NULL,"+"firstname VARCHAR(50),"+"lastname VARCHAR(50),"+"age INTEGER,"+"PRIMARY KEY(id))"; 
		stmt.executeUpdate(sql);
		System.out.println("Table created in given database...");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
