package com.msb.java.jdbc;

import java.sql.*;

public class jdbc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/abc";
		String uname = "root";
		String pass = "root/mysql";
		String query = "select sname from table1 where roll_no=101";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		System.out.println(rs.getString("sname"));

		st.close();
		con.close();

	}

}
