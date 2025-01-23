package java_study0123;

import java.util.Scanner;

public class java0123 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		// 조건연산자
//		// (조건식) ? 참일 경우 실행 내용 : 거짓일경우 실행 내용;
//		
//		String result = (1 > 5) ? "5보다 크다" : "5보다 작다";
//		System.out.println(result);
//		
//		int age = 16;
//		int price = (age < 19) ? 1000 : 1500 ;
//		System.out.printf("나이 : %d살, 버스요금 %d원 \n", age, price);
//		
//		System.out.print("첫번째 숫자 : ");
//		int num1 = scan.nextInt();
//		System.out.print("두번째 숫자 : ");
//		int num2 = scan.nextInt();
//		
//		int res = (num1 > num2) ? num1 : num2 ;
//		// 조건식이 참이라면 res=num1 수행
//		// 조건식이 거짓이라면 res=num2 수행
//		System.out.println("두 숫자 중 큰 숫자는?" + res);
//		
//		// 두 숫자를 입력받아서 두 수가 같다. 같지 않다 출력
//		
//		System.out.println("첫 번째 : ");
//		int num3 = scan.nextInt();
//		System.out.println("두 번째 :");
//		int num4 = scan.nextInt();
//		
//		String plusnum = (num3 == num4) ? "같다" : "같지않다";
//		System.out.println(plusnum);
//		
//		System.out.println( "정수입력 : ");
//		int num = scan.nextInt();
//		
//		// 입력한 정수가 양수냐 음수냐 , 0이냐 * 조건식이 최소두개가 필요함
//		String res = (num > 0) ? "양수" : ( num == 0 ) ? "음수" : "0이다";
//		System.out.print(res);
		
		// 바이킹을 타기 위해서는 키가 135이상이어야 한다.
		// 바이킹 탑승 여부를 출력하세요 (키 입력받기)
//		
//		System.out.print("키를 입력하세요 : ");
//		int tall = scan.nextInt();
//		
//		String res = (tall >= 135) ? "탈 수 있다" : "탈 수 없다";
//		System.out.println(res);
		
		// 각 음식의 가격 출력하기
		
//		System.out.print("1. 파미향 짬뽕 2. 쿠켄 돈가스 3. 공주순대 : ");
//		int select = scan.nextInt();
//		
//		int price = (select == 1) ? 9000 : 0;
//		//1번을 선택했을 때 9000원, 아니면 0원 , 2, 3도 0원
//		price = (select == 2) ? 8000 : price;
//		price = (select == 3) ? 6500 : price;
//		
//		System.out.println("가격은" + price);
		
		// 정수 세개를 키보드를 통해 입력받기
		// 세 정수 중에서 가장 큰 정수를 출력하세요
		// 두 개가 같은 경우, 세 개가 같은 경우는 배제하고!
		
		System.out.println("첫번째 정수를 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.println("두번째 정수를 입력하세요 : ");
		int num2 = scan.nextInt();
		System.out.println("세번째 정수를 입력하세요 : ");
		int num3 = scan.nextInt();
		
//		int max = (num1 > num2) ? num1 : (num2 > num3) ? num2 : num3;
		int max = (num1 > num2) ? num1 : num2;
		max= (max > num3) ? max : num3;
		
		System.out.println("제일 큰 정수는? : " + max);
		
		
		
		
		
	}

}
