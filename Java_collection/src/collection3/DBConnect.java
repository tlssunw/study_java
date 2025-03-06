package collection3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect { 
	
	public Connection conn;
	public Statement st;
	public ResultSet rs;
	
	public DBConnect() {
		connection();
	}
	
	private void connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user = "ssw";
			String password = "1234";
			String url = "jdbc:mysql://localhost:3306/ssw";
			conn = DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			System.out.println("드라이버 로드 및 접속 실패");
		}

		// 드라이버로드
		// 계정 로그인
	}

}
