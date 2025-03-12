package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {
	protected Connection conn;
	protected Statement st;
	protected ResultSet rs;
	
	public DBConnect() {
		connection();
	}
	
	private void connection() {
		
		// 드라이버 로드
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		}
		
		// 계정 로그인
		String user = "smanager";
		String password = "1234";
		String url = "jdbc:mysql://localhost:3306/smanager";
		
		// 값 초기화
		conn = null;
		st = null;
		rs = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println("DB연결 실패");
			e.printStackTrace();
		}
		
		// 정보를 가져오기 위해 쿼리문 select하기
		String sql = "select * from storage";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			System.out.println("Asdfasdfse");
		} catch (Exception e) {
			System.out.println("쿼리문 조회 실패");
			e.printStackTrace();
		}
		
	}
	
}
