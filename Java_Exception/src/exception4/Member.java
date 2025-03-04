package exception4;

public class Member {

	private String name;
	private int age;
	
	public Member() {}
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void nameCount() throws NullPointerException{
		
		if (name == null) {
			throw new NullPointerException("이름입력안함");
			// 예외 발생시키기(강제) - Throw
		}
		
		if(name.length()==2) {
			System.out.println("이름 외자이다");
		}else if (name.length()==4) {
			System.out.println("이름이 3자이다");
		}else if(name.length()==3) {
			System.out.println("이름이 2자이다");
		}
	}
	
	public int getBirthYear() throws Exception{
		if(age == 0) { //나이 입력 안한 경우
			throw new Exception("나이입력안했어요");
		}
		return 2025-age;
	}
}
