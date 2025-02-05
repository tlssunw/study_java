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
		
		
//		//문제 풀어보기
//		int num1 = 0;
//		int num2=0;
//		System.out.println("두 숫자를 입력하세요 : ");
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		
//		int small, big;
//		if(num1 < num2) {
//			small = num1;
//			big = num2;
//		}else {
//			small = num2;
//			big = num1;
//		}
//		
////		// 또다른 방법
////		if(num1 < num2) {
////			int temp = num1;
////			num1 = num2;
////			num2 = temp;
////		}
////		
//		int sum=0;
//		for(; small<=big; small++ ) { 
//			sum = sum+small;
//		}System.out.println("더한 값은?:" + sum );
//		
		
		
		
		// 내가 키보드로 입력한 숫자에 해당하는 구구단 출력하기
		int num =0;
		System.out.println("숫자를 입력하세요 :");
		num = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d \n", num,i, num*i);
		}
		
		
//		for (int i=1; i<=9; i++) {
//			System.out.printf("2*%d=%d \n",i,2*i);
//		}
//		System.out.println("2*1="+(2*1));
//		System.out.println("2*2="+(2*2));
//		System.out.println("2*3="+(2*3));
		
	}

}
