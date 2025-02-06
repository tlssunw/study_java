package java_study0206;

import java.util.Scanner;

public class java0206_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int user = 0;
		do {
		System.out.println("1. 가위 2. 바위 3. 보 : ");
		user = sc.nextInt();
//		if( user>=1 && user <=3 ) break;
		} while(!(user>=1 && user <=3))
			
		System.out.println("가위바위보진행");
		
//		int a= 10;
//		do {
//			System.out.println("do~while 문");
//			a++;
//			
//		} while (a<15);
		
		// 초기값 -> {내용} -> 조건식비교 -> 참이면 -> {내용}
		
//		int i=1;
//		while(i<=3) {
//			int k=1; // k값을 초기화시켜줘야 i의 while문을 한번 더 사용
//			while(k<=2) {
//				System.out.println("i="+i+"k="+k);
//				k++;
//			}
//			i++;
//		}

//		for(int i=1; i<=3; i++) {
//			for(int k=1; k<=2; k++) {
//				System.out.println("i= "+i+"k="+k);
//			}
//		}
		
	}

}
