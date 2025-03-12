package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import VO.School;

public class SchoolDAO extends DBconnect{

	public ArrayList<School> searchSelect(String searchWord) {
		
		String sql = "select * from school where school_name like "
				+ "'%"+searchWord + "%'";
		
		ArrayList<School> list = new ArrayList<School>();
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				School data = new School(
			rs.getInt("id"), rs.getString("diff"), rs.getString("school_name"),
			rs.getString("address"), rs.getInt("post_code"), rs.getString("tel"),
			rs.getString("fax"), rs.getString("education_office"),
			rs.getString("public_private"), rs.getString("homepage")
				);
				
				list.add(data);
			}
			
		}catch(SQLException e) {
			System.out.println("학교 검색 실패");
		}
		return list;
		
		//검색어- 중구, 중학교 일때
		// String sql = "select * from where address like '%중구%' or diff='중'";
		// 모든 키워드를 전부 검색할때
		// select * from where address like '%중구%' or diff='중' or 
		
		
	}

	public void saveData(String id, int schoolNum) {
	      // id변수는 로그인한 아이디 이고, schoolNum은 선택한 학교번호(id)이다.
	      //insert, delete, update는 executeUpdate 메서드를 사용하고 결과는 없기에 ResuleSet오로 안받아도 된다.
	      // 내가 선택한 학교번호가 테이블에 저장 될 수 있게 saveData 메서드 내용을 완성하세요
	      
	      String sql = "insert into my_school(member_id, school_id) values ('" +id + "' ," +schoolNum+" )";
	      try {
	    	 st = conn.createStatement();
	         st.executeUpdate(sql);
	         
	         
	      }catch(SQLException e){
	         System.out.println("학교 번호 저장 안됨");
	         e.printStackTrace();
	         
	      }
	      
	   }

}
