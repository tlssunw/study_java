package study0218;

public class Member {
	
	String name; // 이름 - 인스턴스 변수
	int age; // 나이
	String job; // 직업
	
	Member(){ // 기본 생성자 메소드
		this.name="박문수";
		// 클래스 내부에서 인스턴스 변수를 표현하려면 this를 붙여 표현
		System.out.println(this);
	}
	
	Member(int age, String job){
		this.age = age;
		this.job = job;
	}
	Member(int age, String job, String name){
		this.name = name;
		this.age = age;
		this.job = job;
	}

}
