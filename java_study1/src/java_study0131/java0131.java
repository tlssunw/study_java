package java_study0131;

import java.util.Scanner;

public class java0131 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
//		if 조건식 { 조건식이 참이라면 조건식 다음의 중괄호 안에 내용만 실행
//			참일경우 실행할 내용, 여러줄 가능
//		}
//		
//		if(조건식) {
//			
//		} else { else는 조건식이 거짓일 경우에만 실행
//			거짓일경우 실행할 내용, 여러 줄 가능 
//		}
	
//		int 나이 = 25;
//		if (나이 > 19) {
//			System.out.println("성인입니다.");
//		}else {
//			System.out.println("청소년입니다");
//		}
		
//		int money = 6400;
//		if(money >= 10000) {
//			System.out.println("충전안함");
//		}else {
//			System.out.println("잔액부족 " + (10000-money)+"충전");
//			money = (10000-money) + money;
//		}
//		System.out.println("현재 잔액 : " + money);

//		//사각형의 너비와 높이 이다.
//		// 현재 사각형은 정사각형인가 직각사각형인가?
//		int width = 53, height = 52;
//		if (width == height) {
//			System.out.println("정사각형입니다");
//		} else {
//			System.out.println("직각사각형입니다");
//		}
		
		// 입력한 숫자가 짝수인가 홀수인가?
//		int num = 0;
//		
//		System.out.print("숫자입력 : ");
//		num = in.nextInt();
//		
//		if (num % 2 == 1) {
//			System.out.println("홀수입니다");
//		} else {
//			System.out.println("짝수입니다");
//		}
		
//		int num = 15;
//		if (num>0) {
//			System.out.println("양수이다");
//		}else if (num<0){
//			System.out.println("음수이다");
//		} else {
//			System.out.println("0이다");
//		}
		
//		int score = 81; // 100~90은 A, 89~80은 B, 79~70은 C, 나머지는 F
//		if (score <= 100 && score >=90) {
//			System.out.println("A학점이다");
//		}
//		else if (score >= 80) {
//			System.out.println("B학점이다");
//		}
//		else if (score >= 70) {
//			System.out.println("C학점이다");
//		} else {
//			System.out.println("F학점이다");
//		}
		
//		int num=0;
//		System.out.print("메뉴를 선택 :");
//		num = in.nextInt();
//		
//		if (num==1) {
//			System.out.println("데이터저장");
//		}else if (num==2) {
//			System.out.println("데이터삭제");
//		}else if (num==3) {
//			System.out.println("종료");
//		}else {
//			System.out.println("잘못입력했습니다");
//		}
		
		// 싸다구 주차장 주차비 결제
		// 주차장의 기본 요금은 1000원이고 기본 시간은 30분이다.
		// 11분 주차해도 1000원이다
		// 10분당 100원씩 추가요금
		// 34분 주차하면 1000원, 40분 주차하면 1100원 51분 주차하면 1200원
		// 2시간 이상 주차 시 기본요금은 1700원이다.
		// 2시간 10분 주차하면 1800원, 3시간 21분 주차하면 2500원
		// 4시간 이상 주차 시 기본요금은 2500원이다.
		// 4시간 15분 주차하면 2600원
		// 8시간 이상 주차 시 무조건 10000원
		// 주차 몇시간 몇분 했는지 입력하여 주차요금이 얼마인지 출력하세요
		
		int pTime = 0; //주차시간
		int defaultTime = 30; //기본시간
		int cost = 1000; //기본요금
		int tenM = 100; //10분에 100원 추가요금
		
		System.out.print("몇 분 주차했나요? :");
		pTime = in.nextInt();
		
		if (0>pTime && pTime<=39) { //기본요금 100원
		}else {
			pTime= pTime-defaultTime;
			cost=(pTime/10)*tenM+cost; 
		}
		System.out.println("요금은" + cost + "입니다");
		
		

	}

}
/*
 변수 : 데이터 (값)를 저장하기 위한 메모리 공간
 변수 이름 : 데이터가 저장된 메모리공간을 사용하기 위해서는 이름을 부여해야 한다.
 
 System.out.println(1000); --> 한번쓰이고 끝
 int a = 1000;
 System.out.println(a); --> 지속적인 재사용 가능
 
 변수선언 : 데이터타입 정하기, 변수이름 정하기
 		-> 사용할 데이터에 맞춰서 정하기
 		-> int num; 데이터타입 변수이름;
 		
 데이터타입 변환(형변환)
 	자동 형변환 : 데이터타입이 작은범위에서 큰범위로 데이터가 저장되는경우
 	float a = 10; --> 자동형변환(실수타입으로)
 	강제 형변환 : 데이터타입이 큰범위에서 작은범위로 데이터가 저장되는경우
 	int b = (int)2.14f; --> 강제형변환
 	
 나누기 % : 나머지 구하기
 ++ -- : 증감연산자 (1씩 증가, 1씩 감소)
 
 
 
 */