package study0220;

public class javaMethod2 {

	public static void main(String[] args) {
		
		Member user1 = new Member();
		user1.id=1001;
		user1.userId="sky";
		user1.password="1234";
		
		user1.output();
		Member user2 = new Member("gold", "5432",1002);
		
		user2.output();
		System.out.println(user1);
		
		String word="이렇게한다";
		System.out.println(word);
	}

}
