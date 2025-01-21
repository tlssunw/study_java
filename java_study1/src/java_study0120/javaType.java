package java_study0120;

import java.util.Scanner;

//import java.util.Scanner;

public class javaType {

	public static void main(String[] args) {
		
		// 변수 - 데이터를 저장하기 위한 메모리 공간
		// 변수의 이름 - 데이터가 저장된 공간을 사용하기 위해 부여한 별명
		// 변수 선언 방법 - 데이터타입 변수이름(예- int num;)
		// 저장할 데이터에 맞는 데이터타입을 설정해야 한다.
		// 변수이름의 첫 글자는 문자로, 자바 예약어는 사용 불가
		
		// 자바에서 결과로 출력하는 방법
		System.out.println();
		// 자바에서 키보드를 통해 데이터 입력하는 방법
		// 1. 입력 객체를 생성
		// 2. 입력 객체를 통해 데이터에 맞는 입력메서드 호출
		
		Scanner input = new Scanner(System.in);
		
		// num이라는 변수에 정수 데이터 입력하여 저장하기
		// nextInt()가 정수 데이터 입력 하기 위한 메서드이다.
		int num = input.nextInt();
		
		
		// 과제풀이
		int apple = 20;
		int appleBox=11;
		int orange=15;
		int orangeBox=12;
		
		int totalApple = appleBox * apple;
		int totalOrange = orangeBox * orange;
		int totalFruit = totalApple + totalOrange;
		System.out.println("사과 총 갯수 :" + totalApple);
		System.out.println("오렌지 총 갯수 :" + totalOrange);
		System.out.println("과일 총 갯수 :" + totalFruit);
	}

}
