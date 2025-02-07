package java_study0207;

import java.util.Scanner;

public class java0207_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// 문제 4.
		// *
		// **
		// ***
		// * 을 위와 같이 출력하세요
		// 힌트 > 첫 번째 줄이라서 별 한개 두 번째 줄이라서 별 두개 세 번째줄은 별 세개
		// (이중 for 문)
		
//		int star=0;
		
//		for(int line=1; line<=3; line++) {
//			for(int star=1; star<=line; star++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int line=1; line<=3; line++) {
//			System.out.println();
//			if(line==1) {
//				System.out.println("*");
//			}
//			if(line==2) {
//				System.out.println("**");
//			}
//			if(line==3) {
//				System.out.println("***");
//			};
//			break;
//		}
		
			
		//문제 5.
		// 0 1 2 3
		// 4 5 6 7
		// 8 9 10 11
		// 숫자를 위와 같이 출력하세요 (이중for문)
		
//		int a=0; //0~3
//		int b=0; //4~7
//		int c=0; //8~11
		
//		for(int num=0; num<=11;) {
//			for(int a=0; a<=3; a++) {
//				System.out.print(a+" ");
//			}
//			System.out.println();
//			for(int b=4; b<=7; b++) {
//				System.out.print(b+" ");
//			}
//			System.out.println();
//			for(int c=8; c<=11; c++) {
//				System.out.print(c+" ");
//			}
//			if(num==11);
//			break;
//		}
		
		//선생님 풀이
//		for(int i=0; i<=2; i++) {
//			for(int k=i*4; k<=(i*4)+3; k++) {
//				System.out.print(k+" ");
//			}
//			System.out.println();
//		}
		
		
		// 문제 6.- 비밀번호 찾기
		// 1. 비밀번호는 4자리로 구성되어있다.
		// 2. 비밀번호 각각의 숫자는 1~9중 하나이고, 중복없음
		// 3. 첫번째 숫자는 네 번째 숫자보다 2만큼 크다.
		// 4. 두번째 숫자는 세번째 숫자보다 작다.
		// 5. 비밀번호와 비밀번호 역순의 숫자를 더하기 하면 16566이다 예)1234+4321
		// 6. 위 조건을 모두 충족하는 비밀번호 출력(for문 4개 필요)

//		int a=0, b=0, c=0, d=0; 
//		for(a=1; a<=9; a++) {
//			for(b=1; b<=9; b++) {
//				for(c=1; c<=9; c++) {
//					for(d=1; d<=9; d++) {
//						if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d) {
//							if(a==d+2) {
//								if(b<c) {
//									int pw = a*1000+b*100+c*10+d;
//									int rPw = d*1000+c*100+b*10+a;
//									if( (pw+rPw) == 16566) {
//										System.out.println(pw);
//										break;
//									}
//								}
//						}
//					}
//				}
//			}
//
//			}
//			System.out.println("a"+"b"+"c"+"d");
		
		
		// 문제 7.
		// 알파벳 찾기(반드시 반복문 사용해서) 알파벳 - 26개
		// 알파벳 (대문자 또는 소문자 모두 가능하게) 입력
		// 입력한 알파벳이 몇 번째 알파벳인지 찾기 - 반드시 for문으로
		
		System.out.println("알파벳을 입력하세요: ");
		int alphabet = sc.nextline();
		
		for(; alphabet<=26; alphabet++) {
			System.out.println(alphabet);
			
		
		
		
		}
		
		
		
		
		
	}

}
