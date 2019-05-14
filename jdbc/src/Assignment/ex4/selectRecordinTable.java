package Assignment.ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class selectRecordinTable {
	public static void main(String[] args) {
		Statement stmt=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("Jdbc:mysql://localhost:3306/test1","root","root");
			stmt=con.createStatement();
			String sql="select * from person";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()){
				int id=rs.getInt("id");
				int age=rs.getInt("age");
				String first=rs.getString("firstName");
				String last=rs.getString("lastName");
				
				//display values
				System.out.print(" id: "+id);
				System.out.print(",age: "+age);
				System.out.print(" ,firstname: "+first);
				System.out.println(" ,lastname: "+last);
				
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
