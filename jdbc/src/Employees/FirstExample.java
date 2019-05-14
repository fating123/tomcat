package Employees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstExample {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("connecting to the database");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
		System.out.println("creating statement");
		Statement stmt=con.createStatement();
		
	/*	// insert elemwnt in the database
		String sql1="insert into employees values ('25','34','nikhil','kapile')";
		int add=stmt.executeUpdate(sql1);       */
		
		
	/*	//update database element
		String sql2="update employees set age=30 where id=12";
		int update=stmt.executeUpdate(sql2);       */
		
	/*	//delete database element
		String sql3="delete from employees where id=10";
		int delete=stmt.executeUpdate(sql3);     */
		
		String sql="select id, first, last, age from employees ";
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next()){
			int id=rs.getInt("id");
			int age=rs.getInt("age");
			String first=rs.getString("first");
			String last=rs.getString("last");
			
			System.out.print("  Id:  "+id);
			System.out.print(" , AGE:  "+age);
			System.out.print(" , FIRST:  "+first);
			System.out.println(" , LAST:  "+last);

		}
		rs.close();
		stmt.close();
		con.close();
	
		System.out.println("goodbye");
	}
	

}
