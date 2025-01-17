package study0116;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		주석 - 설명이나 메모, 코드 대기, 등등
		/*
		 * 여러 줄 수석 - 주석은 프로그램으로 실행 되지않는 부분이다.
		 * 주석 안에 코드를 작성해도 실행 안된다. 각 코드의 설명을 작성하는 용도로 사용
		 * 저장 단축키 = ctrl + s
		 * 주석 단축기 = ctrl + /
		 * 실앻 단축기 = ctrl + F11
		 */
		System.out.println("자바 이클립스 테스트");
		
//		데이터를 사용하려면 변수를 선언해야 한다.
//		변수를 선언 할 때는 반드시 데이터 타입을 정해야 한다.
//		변수의 이름은 저장할 데이터에 맞는 의미 있는 이름으로 지어야 한다.
//		정수 : int, byte, short, long
//		실수 : float, double
//		문자 : char
//		논리 : blooleam
		int age; 
		age = 100; // 변수에 100 저장(대입연산)
		age = 27; // 덮어쓰기됨
		age = '가'; // 자바에서 ''표현은 문자를 의미
					// ""표현은 문자열을 의미
//		타입에 맞지 않는 경우는 다른 값으로 바뀌어 저장된다.
//		age = 3.14f; 
		
		int num2 = 20; // 변수를 선언하면서 데이터를 저장
		int num3 = 43;
//		num3은 43이다. 라고 하면 안됨 num3과 43이 같다는 표현이라
//		num3에 43을 저장했다, num3에 43을 대입했다. 라고 표현
		System.out.println(num2 + num3);
		
		int sum = num2+num3;
		System.out.println(sum);
		
//		사각형 너비와 높이 값으로 넓이를 구하세요.
		int width = 20;
		int height = 30;
		int area = width + height;
		System.out.println(area);
		
		int blue = 20; //오렌지주스
		int red = 15; //딸기주스
		int white = 0;
		// 파란 컵에 오렌지주스가 20ml있다.
		// 빨간 컵에 딸기주스가 15ml 있다.
		// 파란 컵에 딸기주스를, 빨간컵에 오렌지주스를 담으려면 어떻게 해야할까?
		// blue 와 red 값 출력
		white = blue;
		blue = red;
		red = white;
		System.out.println(blue);
		System.out.println(red);
		
		int birthYear = 1991;
		// 김철수의 태어난 년도를 birth_year에 저장했다. 나이는?
		int myAge = 2025 - birthYear;
		System.out.println(myAge);
		
		// 변수란 데이터(값)을 저장할 수 있는 메모리공간
		// 변수의 공간에는 데이터타입에 맞는 데이터만 저장할 수 있게 해줘야 한다.
		// 변수 선언은 데이터타입 변수명 (ex. int num;)
		// 변수 이름은 카멜표기법이 일반적이다
		// 변수 이름은 변수의 사용목적에 맞는 이름으로 한다(길어도됨)
		
		
		float fnum = 2.156f;
		System.out.println(fnum);
		
		fnum=2.123456789f;
		System.out.println(fnum);
		
		double dnum = 1.123456789012345;
		System.out.println(dnum);
		
		char ch='a';
		System.out.println(ch);
		ch ='가';
		System.out.println(ch);
		ch = 97;
		System.out.println(ch);
		ch = 'H';
		System.out.println(ch - 'A');
		System.out.println('J'-64);
		
		String name = "홍길동";
		System.out.println(name);
		
		boolean isApple = true;
		System.out.println(isApple);
		
		
		}

}
