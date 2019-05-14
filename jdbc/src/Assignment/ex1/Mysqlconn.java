package Assignment.ex1;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class Mysqlconn {
	public static void main(String[] args) {
		try{
			System.out.println("i am in try");
			Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		System.out.println("connected");
			
		}catch(Exception e){
			System.out.println("error to connect mysql");
		}
	}

}
