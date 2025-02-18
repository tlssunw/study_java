package study;

public class javaMain {

	public static void main(String[] args) {

		
//		struct member { //구조체 - member타입
//			String name;
//			int age;
//		}
//		member info; // member타입의 변수 info
//		info.name = "김유신";
//		info.age = 24;
//		member[] mem = new member[100];
		
		
	// 기본 데이터타입으로 선언한 변수는 데이터 저장이 직접 가능
	// int num=0;
	// 배열 또는 자바 클래스타입으로 선언한 변수는 참조변수이다.
	// 참조변수에는 메모리주소저장한다.
	// 그래서 자바에서는 new 연산자 통해서 공간을 할당받아 그 공간의 주소를 저장
	
		Member info = new Member();
		info.name="김유신";
		info.age=30;
		System.out.println(info.name);
		
		Member my = new Member(); // 인스턴스 생성(객체 생성)
		my.name="박문수";
		my.age=25;
		
		// 동물종류, 동물이름, 나이
		// 동물종류에는 개, 고양이, 닭, 토끼, 코끼리 등등
		// 동물이름은 볼트, 렉스, 웅이, 꼬끼오, 총총이 등등
		// 나이는 하고 싶은 나이 아무거나
		// 동물 한 마리에 대해서 데이터 입력하고 출력
		
		Animal dog = new Animal();
		dog.type = "개";
		dog.name = "볼트";
		dog.age = 11;
		
		Animal cat = new Animal();
		cat.type = "고양이";
		cat.name = "렉스";
		cat.age = 8;
		
		Animal hen = new Animal();
		hen.type = "닭";
		hen.name = "웅이";
		hen.age = 2;
		
		Animal rabbit = new Animal();
		rabbit.type = "토끼";
		rabbit.name = "꼬끼오";
		rabbit.age = 5;
		
		Animal elephant = new Animal();
		elephant.type = "코끼리";
		elephant.name = "총총이";
		elephant.age = 13;
		
		System.out.println(dog.name);
		
		
	}

}

class Animal { // 동물 정보 저장 클래스
	String type,name; // 동물 종류, 이름(인스턴스변수)
	int age; //동물 나이
	
}

// 클래스 - 사용자 정의 데이터 타입
// class 클래스이름{   }  -> 이렇게 작성
// 클래스 이름 첫 글자 대문자로

class Member { // 클래스 정의 - 클래스안의 내용으로  데이터 저장될 수 있게
			   // 만들겠다고 정의만 한 것 
	String name; // 이름 저장
	int age;
	float eyes;
}




