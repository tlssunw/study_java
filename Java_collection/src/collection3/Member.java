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
public class Member {

	private Long id; //회원아이디
	private String memberId; //회원아이디
	private String email; //회원이메일
	private String password; //회원비밀번호
	private String birth; //생년월일
	
//	public Member() {}
//	public Member(Long id, String memberId, String email, String password, String birth) {
//		this.id=id;
//		this.memberId=memberId;
//		this.password=password;
//		this.email=email;
//		this.birth=birth;
//	}

}
