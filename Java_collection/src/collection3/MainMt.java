package collection3;

import java.util.ArrayList;

public class MainMt {

	public static void main(String[] args) {
		
//		ArrayList<Member> list = new ArrayList<>();
//		
//		list.add( new Member(1l, "ssw","ssw@naver.com","1234","20000906") );
//		
//		list.add(new Member(2l, "wwf","wwf@naver.com","3456","19990105"));
//		
//		System.out.println(list);
		
		MemberDao dao = new MemberDao();
		
		ArrayList<Member> memberList = dao.select();
		
		for(Member m : memberList) {
			System.out.println(m);
		}
		
	}

}
