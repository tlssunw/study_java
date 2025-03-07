package collection3;

import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDao extends DBConnect{
	
	 // 테이블에서 데이터 가져오기
	public ArrayList<Member> select() {
		String sql = "select * from member1";
		
		ArrayList<Member> list = new ArrayList<>();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			// 조회한 결과를 rs이 받음
			
			while (rs.next()) {
				Member m = new Member(rs.getLong("id"),
						rs.getString("member_id"), rs.getString("email"),
						rs.getString("password"), rs.getString("birth"),
						(int)(Math.random()*21+20));
				// rs에서 객체 하나씩 컬럼명을 주어 데이터 받음
				// while문으로 컬럼당 하나씩의 데이터를 하나씩출력
				
				list.add(m);
				
			}
		}catch (SQLException e) {
			System.out.println("member1 전체 조회 실패"); 
		}
		return list;
	}
	
	
	

}
