package inner1;

public class Test {
	
	static int count=1; // 클래스 변수 (정적변수)
	int age; // 인스턴스 변수
	A a;
	
	Test(){
		a=new A();
	}
	
	void innerView() {
		this.a.view();
	}
	
	static void Origin() { //클래스메서드
//		a.view(); - 오류
//		A bb = new A(); //오류
	}
	// 정적 내부 클래스 (static)
	static class Dog{
		int year;
	}
	void setTYear(int year) {
		Dog d = new Dog();
		d.year=year;
	}
	// 인스턴스 내부클래스 정의 - 외부클래스그의 객체생성해야 사용
	class A {
		int num;
		void view() {System.out.println("내부클래스 메서드");}
	}
	void setNum(int num) {
		this.a.num=num; 
	}
	
	void sum() {
		int a,b; //지역변수 
	} 

}

// 내부클래스 - 클래스 내부에 만드는 클래스 ﻿