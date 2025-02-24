package study0224;

public class Member {
	
	static int count = 1; // 클래스 변수
	
	String name="박문수";
	int age=10;
	String addr;
	String dept;
	
	static { //클래스 초기화 블럭 - 클래스 변수만 초기화 가능
//		age = 10; //인스턴스 초기화 변수 불가
		count=0;
	}
	
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

	}
	Member(String name, int age, String addr){
		this.name=name;
		this.age=age;
		this.addr=addr;
//		dept="컴퓨터공학과";
	}
	
	//인스턴스 메서드
	void setName(String name) {
		this.name=name;
		output(); //클래스메서드 호출 가능
	}
	
	//클래스 메서드
	static void output() {
		setName("이순신"); //인스턴스메서드 호출 불가
		System.out.println(name); //인스턴스메서드 사용불가
		
	}
}

// 클래스의 멤버 변수 초기화 방법,
// 멤버 변수인 인스턴스 변수의 초기화 방법

