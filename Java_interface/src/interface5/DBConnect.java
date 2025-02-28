package interface5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

public class DBConnect {// 데이터베이스 연결 작업만 함
	
	private Connection conn; // 계정 로그인 상태 저장
	private Statement st; // 쿼리문 보내기 위해 필요
	private ResultSet re; // 조회 결과 받기
	
	protected DBConnect() {
		connection(); // DB연결
	}
	
	private void connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //드라이버 로드
			
			String user = "ssw";
			String password = "1234";
			String url = "jdbc:mysql://localhost:3306/ssw"; //DB주소//DB명
			
			conn = DriverManager.getConnection(url,user,password);
			
		}catch(Exception e) {
			System.out.println("드라이버 로드 실패 또는 연결 실패");
			e.printStackTrace();
		}
	}
}
