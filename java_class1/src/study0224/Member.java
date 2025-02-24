package study0224;

public class Member {
	
	static int count = 1; // 클래스 변수
	
	String name="박문수";
	int age=10;
	String addr;
	String dept;
	
	{// 인스턴스 초기화 블럭
		name="김유신";
		dept="컴퓨터공학과";
		count++;
		
	}
	
	Member(){
		name="아무개";
		age=10;
		addr="대전";
//		dept="컴퓨터공학과";
		//
	}
	Member(String name, int age, String addr){
		this.name=name;
		this.age=age;
		this.addr=addr;
//		dept="컴퓨터공학과";
	}

}

// 클래스의 멤버 변수 초기화 방법,
// 멤버 변수인 인스턴스 변수의 초기화 방법

