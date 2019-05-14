package Assignment.ex3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {
	public static void main(String[] args) {
		Statement stmt=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
			stmt=con.createStatement();
			String sql="insert into person values (11,'A','B',18)";
			stmt.executeUpdate(sql);
			sql="insert into person values (22,'C','D',25)";
			stmt.executeUpdate(sql);
			sql="insert into person values (33,'E','F',30)";
			stmt.executeUpdate(sql);
			sql="insert into person values (44,'S','M',28)";
			stmt.executeUpdate(sql);
			System.out.println("All record inserted........");
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
