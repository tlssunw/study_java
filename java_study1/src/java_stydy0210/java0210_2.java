package java_stydy0210;

import java.util.Scanner;

public class java0210_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//문제7. 알파벳 찾기(반복문 이용해서)
		
		System.out.print("알파벳 입력: ");
		char alp=scan.nextLine().charAt(0);
		//아스키 코드에서 A - 65(10진수), a - 97(10진수)
		for(int i = 1; i<=26; i++) {
			if(alp==(i+64) || alp==(i+96) ) {
				System.out.printf("알파벳 %c는 %d번째 알파벳\n", alp, i);
			}
		}
	}

}
