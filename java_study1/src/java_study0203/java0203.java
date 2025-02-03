package java_study0203;

import java.util.Scanner;

public class java0203 {
	
	Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// 싸다구 주차장 주차비 결제
		// 주차장의 기본 요금은 1000원이고 기본 시간은 30분이다.
		// 11분 주차해도 1000원이다
		// 10분당 100원씩 추가요금
		// 34분 주차하면 1000원, 40분 주차하면 1100원 51분 주차하면 1200원
		// 2시간 이상 주차 시 기본요금은 1700원이다.
		// 2시간 10분 주차하면 1800원, 3시간 21분 주차하면 2500원
		// 4시간 이상 주차 시 기본요금은 2500원이다.
		// 4시간 15분 주차하면 2500원
		// 8시간 이상 주차 시 무조건 10000원
		// 주차 몇시간 몇분 했는지 입력하여 주차요금이 얼마인지 출력하세요
		
		int phour, pmin; // 주차 시간, 분
		int cost = 1000; //기본요금
		int totalTime = 0; //총주차시간(분) - 기본시간제외한 나머지
		
		System.out.print("주차 시간(시간, 분): ");
		phour = in.nextInt(); //주차 몇 시간 입력
		pmin = in.nextInt(); //주차 몇 분 입력
		
		totalTime = phour*60+pmin;
		
		if(phour>=8) {//8시간 이상 주차
			cost = 10000;
			totalTime = 0; //8시간 이상이라는 시간에 대해서 이미 요금 계산 완료			
		} else if(phour>= 4) { //4시간 이상 주차
			cost = 2500;
			totalTime -= 240; //4시간의 기본 시간 빼기
		} else if(phour>= 2) { //2시간 이상 주차
			cost = 1700;
			totalTime -= 120;
		} else {
			totalTime -= 30 < ? 0 : totalTime - 30;
		}
		
		int price = cost + (totalTime/10*100);
		System.out.println("주차요금 :" + price +"원");
	}

}
