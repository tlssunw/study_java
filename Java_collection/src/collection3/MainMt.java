package collection3;

import java.util.ArrayList;
import java.util.Collections;

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
		
		
		// 이메일을 아이디와 비밀번호를 조회 하기!
		String email="brown@gmail.com";
		for(Member mem : memberList) {
			if( mem.getEmail().equals(email) ) {
				System.out.println(mem.getMemberId());
				System.out.println(mem.getPassword());
				break;
			}
		}
	
		// memberList.contains(대상);
		// 타입에 대해서도 비교하기 때문에 동일한 타입으로 비교할 수 있게
		// email은 String클래스 타입이라 안된다.
		// 그래서 Member클래스 객체에 email을 담아서 비교 되게 한다.
		
		Member 대상 = new Member();
		대상.setEmail("아무거나@naver.com");
		//동일한 Member클래스로 비교하고자 함
		
		for(int i=0; i<memberList.size(); i++) {
			Member cmp = memberList.get(i);
			
			if (cmp.equals(대상)) {
				System.out.println("찾았다!");
			}
		}
		
//		System.out.println(memberList.contains(대상));
		//이메일을 가진 데이터가 없으면 false가 나옴
		
		// * 문제! 장은호 생년월일이 memberList에 등록된 사람들과 똑같은 게 있나?
		
		Member 장은호 = new Member();
		장은호.setBirth("19901221");
		장은호.setEmail("babo@daum.net");
		장은호.setMemberId("kkk1");
		
	
		System.out.println(memberList.contains(장은호));
		
		// 멤버 객체를 정렬해보겠음
//		Collections.sort(memberList);

		System.out.println("apple".compareTo("bag"));
		Collections.sort(memberList);
		for(Member m : memberList) {
			System.out.println(m.getId()+" "+m.getMemberId()+" "+
							m.getAge());
		}
		
		

	}

}
