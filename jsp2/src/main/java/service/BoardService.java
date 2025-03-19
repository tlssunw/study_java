package service;

import java.util.ArrayList;

import DAO.BoardDao;
import DTO.Board;
import jakarta.servlet.http.HttpServletRequest;

public class BoardService {
	
	private BoardDao dao = new BoardDao();

	public void save(HttpServletRequest request) {
		// request객체에서 파라미터 값 가져와 Board 클래스 객체에 저장
		// Board 클래스 객체를 DAO에 넘겨주기
		
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		
		Board board = new Board();
		
		board.setWriter(writer);
		board.setTitle(title);
		board.setContent(content);
		
		dao.insert(board);
	}

	public void allSelect(HttpServletRequest request) {
		//데이터베이스 테이블에서 조회 하여 가져오기
		ArrayList<Board> list = dao.select();
		// 조회 결과를 ArrayList에 저장하고 request 의 Attribute로 저장하기
		request.setAttribute("boardList", list);
		
	}
}
