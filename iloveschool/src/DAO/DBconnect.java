package DAO;

import java.sql.*;

public class DBconnect {
	protected Connection conn;
	protected Statement st;
	protected ResultSet rs;
	
	protected DBconnect() {
		connection();
	}

	private void connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			System.out.println("로드 실패");
			e.printStackTrace();
		}
		
		String user = "ssw";
		String password = "1234";
		String url = "jdbc:mysql://localhost:3306/ssw";
		
		try {
			conn = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			System.out.println("계정 접속 실패");
			e.printStackTrace();
		}
	}
	


	

}
