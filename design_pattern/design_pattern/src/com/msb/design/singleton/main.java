package com.msb.design.singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		login_dao user1=new login_dao();
		user1.setUname("Ankush");
		String url="jdbc:mysql://localhost:3306/login";
		String uname="root";
		String pass="root/mysql";
		
//		instead of writing the code to get connection again and again i can simply call the static method in the singleton class thereby creation just only a single object everutime when i need the connection
		Connection con=singleton.get_connection(url, uname, pass);
		Statement st=con.createStatement();
		String query="select * from user_details where username='"+ user1.getUname()+ "'";
		ResultSet rs=st.executeQuery(query);
		rs.next();
		user1.setEmail(rs.getString(2));
		user1.setPass(rs.getString(3));
		System.out.println(user1);
		st.close();
		singleton.close_Connection(con);
		

	}

}
