package java_study0205;

import java.util.Scanner;

public class java0205 {
	// 자바의 변수 종류
	// 지역변수, 클래스변수(staitic), 인스턴스변수
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
//		for(int i=1; i<=5; i++) {
//			System.out.println("변수 i사용 반복문 "+i);
//			for(int k=1; k<=3; k++) {
//				System.out.println("변수 k사용"+k);
//			}
//		}
		
		int i=1;
		for(int k=2; k<=9;) {
			System.out.println(k + "*" + i + "=" + (k*i));
			i++;
			if(i==10) {
				k++;
				i=1;
			}
		}
		
		//2단부터 9단까지 중첩 for문 사용해 나타내기
//		for (int k=2; k<=9; K++) {
//			for(int i=1; i<=9; i++) {
//				System.out.println(k + "*" i + "=" +(k*i));
//			}
//		}

		
//		int num = 0;
//		for(; num!=100;) {
//			System.out.println("정수 입력 : ");
//			num=sc.nextInt();
//		}
		// for(;;), for(; true;), for(; num!=0;)
		// 무한루프 종료하는 세 가지 방법
		
		
//		for(; true;) {
//		System.out.print("정수입력 : ");
//		int num = sc.nextInt();
//		if(num==0) return;
//		}
//		System.out.println("무한루프 종료되었습니다");

//		int total=0;
//		for(int i=10; i<=100; i=i+10) {
//			total += i; // total=total+i;
//		}
//		System.out.println(total);
	}

}
