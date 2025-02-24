package study0224;

public class JavaDefault1 {

	public static void main(String[] args) {
		
		Member m1 = new Member(); // 객체생성, 인스턴스생성
		System.out.println(m1.name);
		
		System.out.println(m1.count);
		
		System.out.println(Member.count);
		
		Member m2 = new Member();
		System.out.println(m2.count);

	}

}
