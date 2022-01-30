package com.msb.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class registrationDao {
	
	public void insert(String username, String email,String password) throws ClassNotFoundException, SQLException
	{
		String query="insert into user_details values(?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root/mysql");
		PreparedStatement st=con.prepareStatement(query);
		st.setString(1,username);
		st.setString(2,email);
		st.setString(3, password);
		st.executeUpdate();
		
	}

}
