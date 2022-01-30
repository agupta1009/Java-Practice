package com.msb.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class loginDao {
	
	public boolean check(String username, String password) throws Exception {
		String query="select * from user_details where username=? and password=?";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root/mysql");
		PreparedStatement st=con.prepareStatement(query);
		st.setString(1,username);
		st.setString(2,password);
		ResultSet rs=st.executeQuery();
		if(rs.next())
		{
			return true;
		}
		
		return false;
	}

}
