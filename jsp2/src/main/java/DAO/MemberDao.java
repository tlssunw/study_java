package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDao {
	private Connection conn;
	private PreparedStatement pt;
	private ResultSet rs;
	
	public MemberDao() {
		connect();
	}

	private void connect() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			
			String user = "tlssunw";
			String pass = "1234";
			String url = "jdbc:mysql://210.219.170.244:3306/tlssunw";
			conn = DriverManager.getConnection(url, user, pass);
			
			
		}catch(Exception e){
			System.out.println("드라이버 로드 실패 및 접속 실패");
			e.printStackTrace();
		}
		
			}
	public boolean loginCheck(String email, String pw) {
		String sql = "select * from test_member"+" where email=? and password=?";
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1, email);
			pt.setString(2, pw);
			rs=pt.executeQuery();
			if(rs.next()) return true; //로그인 성공
		}catch(SQLException e) {
			System.out.println("아이디 비밀번호 조회 실패");
			e.printStackTrace();
		}
		return false; //로그인 실패 -아이디또는 비번 틀림
		}
}
