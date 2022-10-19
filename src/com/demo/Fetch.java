package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Fetch {
public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		Connection conn=null;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/marlabs","root", "Pass@123");
		PreparedStatement ps= conn.prepareStatement("Select * from employee11");
				ResultSet rs=ps.executeQuery();
				
				while(rs.next()) {
					int id=rs.getInt("id");
					String name=rs.getString("name");
					System.out.println("Id="+id);
					System.out.println("name="+name);
					
							
				}
		
		 conn.close();
		
		
	}
}
