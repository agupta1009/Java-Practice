package com.msb.design.singleton;

public class login_dao {
	private String uname;
	private String email;
	private String pass;
	
	
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "login_dao [uname=" + uname + ", email=" + email + ", pass=" + pass + "]";
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
