package java_study0121;

import java.util.Scanner;

public class java0121 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 만 나이 입력
		int age = 0;
		System.out.print("나이 :");
		age = scan.nextInt();
		
		// 태어난 년도 구하기
		int birth = 2025 - age;
		System.out.print("태어난 년도 :" + birth + "년");
	}

}
