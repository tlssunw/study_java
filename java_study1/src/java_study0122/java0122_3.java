package java_study0122;

import java.util.Scanner;

public class java0122_3 {

	public static void main(String[] args) {
		
		// 비교연산자 - 두 개 데이터를 비교하여 참, 거짓 결과
		
		System.out.println(10>5);
		System.out.println(11<4);
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		System.out.println("정수 입력 : ");
		num = scan.nextInt();
		
		System.out.println("5보다 큰 숫자인가? " + (num > 5));
		boolean big;
		big = num >= 10;
		
		System.out.println("10 이상인가?" + big);
		
		System.out.println(10 == 10); //두 숫자가 같다
		System.out.println(10 == 13);
		
		String word="가나다"; //문자열 타입은 String 클래스타입
		String word2 = new String("가나다");
		
//		System.out.println(word == word2);
		System.out.println(word.equals(word2)); //문자열 비교는 equals 사용
		// == 비교연산자는 비교하는 2개의 값이 같은 자료형인지 판별
		
		System.out.println(10 != 5); //같지 않아야만 참
		
		// 놀이동산에 가서 바이킹을 타는데 키가 140 이상만 탈 수 있다.
		int tall;
		System.out.println("키 :");
		tall = scan.nextInt();
		System.out.println(tall >= 140);
		
		// 바이킹 탑승 조건 : 키 140이상 190이하
		// 비교연산자로 만들어진 조건식이 여러개인경우 논리연산자를 사용
		System.out.println(tall>=140 and tall <=190);
		
		// 140 <= tall <= 190
		System.out.println(140 <= tall <= 190);
		// 비교데이터 타입 불일치 (boolean , int)
	
	}

}
