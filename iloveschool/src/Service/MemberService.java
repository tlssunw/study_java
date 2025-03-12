package Service;

import java.util.Scanner;

import DAO.MemberDAO;

public class MemberService implements ActiveService{
	
	private MemberDAO dao; //MemberDAO는 회원 관련 데이터베이스 작업을 위한 클래스
	
	public MemberService() {
		this.dao=new MemberDAO(); //DAO 객체 생성
	}
	public String signIn() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n---로그인---");
		
		System.out.println("ID : ");
		String mId = scan.nextLine();
		System.out.println("PW :");
		String mPw = scan.nextLine();
		// 로그인을 위해서 입력한 아이디와 비밀번호를 테이블에 조회한다.
		
		if( dao.userIdAndPassWord(mId, mPw))
			return mId; // 로그인 성공했다면 인력한 아이디리런
	
		
		return null; //로그인 실패 시 null 리턴
	}
	
	public void signUp() {
		System.out.println("회원 가입 완료");
	}

}
