package collection3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor // 기본 생성자 메서드
@AllArgsConstructor // 모든 인스턴스를 매개변수로 메서드
public class Member implements Comparable<Member>{

	private Long id; //회원아이디
	private String memberId; //회원아이디
	private String email; //회원이메일
	private String password; //회원비밀번호
	private String birth; //생년월일
	private int age; //나이
	
	// 컬렉션에서 contains, indexOf와 같은 비교하는 동작 메서드 사용하려면
	// 사용자정의 클래스에서는 equals를 구현해야 한다
	 
	@Override
	public boolean equals(Object obj) {
		Member temp = (Member)obj; 
		//email은 Member타입이라 Object타입인 obj에 들어오지 못해 강제 형변환함
		this.birth.equals(temp.birth);
		boolean isSame = this.birth.equals(temp.birth);
		isSame = isSame && (this.email.equals(temp.email));
		isSame = isSame && (this.memberId.equals(temp.memberId));
		// 세 가지 다 비교하기
		return isSame;
	}
	
	@Override
	public int compareTo(Member o) {
		// 정렬을 위한 compareTo메서드 구현
		// 정렬 기준을 정해야 한다
//		return this.age-o.age;
		return this.birth.compareTo(o.birth);
		// ㄴ문자열을 비교하는 방법
		
		// 내림차순으로 정렬하려면
//		1. return this.birth.compareTo(o.birth)*-1;
//		2. return o.birth.compareTo(this.birth);
	}


}
