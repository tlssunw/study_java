package java_study0206;

import java.util.Scanner;

public class java0206_3 {

	public static void main(String[] args) {
		
		// 문제 1- 무한루프
		// 정수 한 개씩 계속 입력받기
		// 입력하다 0을 입력하면 지금까지 입력한 모든 숫자의 합 출력
		
		Scanner sc = new Scanner(System.in);
		
//		int sum = 0;
//		
//		for(int num1=0; true;) {
//			System.out.print("정수를 입력하세요 : ");
//			num1 = sc.nextInt();
//			sum=sum+num1;
//			if(num1==0) {
//				System.out.println("끝");
//				System.out.println("지금까지 입력한 숫자의 합 : "+sum);
//				break;
//			} else {
//				num1++;
//				System.out.println("다시");
//			}
//
//		}
		
		// 문제 2- 무한루프
		// 컴퓨터와 가위바위보 게임하기
		// 내가 10번을 이길 때 까지 계속 게임하기
		// 10번을 이기면 그 동안 몇 번 패배하고 몇 번 비겼는지 출력
		
//		int com = (int)(Math.random()*3+1);
//		
//		int win=0;
//		int lose=0;
//		int draw=0;
//		
//		for(win=1; win<=10;) {
//			System.out.print("1. 가위 2. 바위 3.보: ");
//			int user = sc.nextInt();
//				if(user==com) {
//					System.out.println("비겼습니다");
//					draw++;
//				}else if ((user==1 && com==3)||(user==2 && com==1)||(user==3 && com==2)) {
//					System.out.println("이겻습니당");
//					win++;
//				}else {
//					System.out.println("졌습니다");
//					lose++;
//				}
//		}
//		System.out.println("이긴 횟수는 : "+ win);
//		System.out.println("진 횟수는 : "+lose);
//		System.out.println("비긴 횟수는 : "+draw);
		
		
		
		// 문제 3
		// 컴퓨터와 주사위게임을 한다. 각각 주사위 2개를 던져서 주사위 합이 큰 쪽이 이긴다.
		// 단, 주사위 2개가 같은 숫자라면 합이 작아도 이긴다
		// 둘 다 같은 숫자가 나왔다면 합이 큰 쪽이 이긴다.
		// 예) 나-3,4 컴-1,3 내가 이김
		// 나-5,6 컴 1,1 컴퓨터 이김
		// 5판을 진행했을 때 몇승 몇패 몇무인지 출력
		
		System.out.println("");
		int com=(int)(Math.random()*6+1);
		int me=(int)(Math.random()*6+1);
		
		


	}

}
