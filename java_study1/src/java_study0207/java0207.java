package java_study0207;

import java.util.Scanner;

public class java0207 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int me=0, com=0, num=1;
		
		while(true) { // 언제 31이 나올지 모르니 무한루프로 전체를 반복
			
			System.out.println("숫자 몇 개 입력할것?: ");
			me=sc.nextInt();
			//1~3 사이 값 입력했는지 체크하는 반복문 만들면 좋겠지요
			System.out.println("나: ");
			for(int i=1; i<=me; i++) {
				System.out.println((num++)+" ");
				if(num ==32) break;
			}
			if(num==32) {
				System.out.println("내거졌다..");
				break; //while문 종료
			}
			
			com = (int)(Math.random()*3+1);
			System.out.println("\n컴퓨터 : ");
			for(int i=1; i<=com; i++) {
				System.out.println((num++)+"  ");
				if(num==32) break;
			}
			if(num==32) {
				System.out.println("컴퓨터 패배");
				break; //while 종료
			}
			
			
		}
	}

}
