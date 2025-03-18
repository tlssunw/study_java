package service;

import DAO.MemberDao;
import jakarta.servlet.http.HttpServletRequest;

public class MemberService {
	
	public void login(HttpServletRequest request) {
		String email = request.getParameter("userId");
		String pass = request.getParameter("userPw");
		
		MemberDao dao = new MemberDao();
		
		if(dao.loginCheck(email, pass)) {
			request.getSession().setAttribute("user", email);
		}
	}

}
// 클라이언트의 요청처리흐름
// 주소에 의한 요청 -> 서비스(실제 처리 코드) -> DAO(데이터베이스 필요 시)
// -> 서비스(테이블에서 가져온 거 있다면 서비스 쪽으로 리턴)
// -> DAO로부터 받은 거 있다면 서블렛에게 리턴 -> 서블렛(클라이언트에게 페이지 제공)