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
//		fetching the data using the column no.
		System.out.println(rs.getString(1));
// fetching the data using the column name
		System.out.println(rs.getString("sname"));

//		.............................................................query 2
		rs = st.executeQuery("select * from emp_table");
		while (rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2));
		}

///		...................................query 3    inserting the data in the table

//		we have to use the execute update command here that will return the no of rows affected
		query = "insert into emp_table values(2019,'hello')";
		int rows = st.executeUpdate(query);
		System.out.println("no of rows affected: " + rows);
		rs = st.executeQuery("select * from emp_table");
		while (rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2));
		}

//		if we have the data stored in a variable then concatenate the string
		String emp_name = "raju sharma";
		int emp_id = 1001;
		query = "insert into emp_table values(" + emp_id + ",'" + emp_name + "')";
		st.execute(query);
		rs = st.executeQuery("select * from emp_table");
		while (rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2));
		}

		st.close();
		con.close();

	}

}
