package java_study0204;

import java.util.Scanner;

public class java0204_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("숫자입력");
//		int num = sc.nextInt(); 
//		
//		for(int i=1; i<=num; i++) {
//			System.out.println(i);
//		}
		
		// 6번 반복하는 반복문 만들고 싶다.
		// 1부터 시작해서 6까지 1씩 증가
		// i=1 -> 1부터 시작하겠다
		// i<=6; 6까지
		
//		for (int i=1; i<=6; i++) {
//			System.out.println(i);
//		}
//		
//		// 정수 5부터 17까지 출력하는 반복문 만드세요
//		for (int a=5; a<=17; a++) {
//			System.out.println(a);
//		}
////		
//		// 총합구하기
//		int sum=0;
//		for(int num=1; num<=10; num++) {
//			sum=sum+num;
//		}
//		System.out.println("1부터 10까지의 합" + sum);
		
		//문제 풀어보기
		System.out.println("첫 번째 숫자를 입력하세요 : " + num);
		System.out.println("두 번째 숫자를 입력하세요 :" + num2);
		int num = 0;
		int num2=0;
		num = sc.nextInt();
		num2 = sc.nextInt();
		
		for(num=0; num2>num; num++) { 
			num=num+num2;
		}System.out.println("더한 값은?:" + num );
		
	}

}
