package com.msb.design.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class singleton {

	static Connection get_connection(String url,String uname,String pass) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection(url, uname, pass);
		return con;
		
	}
	static void close_Connection(Connection con) throws SQLException
	{
		con.close();
	}
}
