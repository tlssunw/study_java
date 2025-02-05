package java_study0205;

import java.util.Scanner;

public class java0205_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 동전 앞면 뒷면 맞추기 게임
		System.out.println("당신의 머니는 얼마?: ");
		int money=scan.nextInt();
		final int 판돈=1000;
		// final = 다른값으로 변경할 수 없는 변수 설정
		int win=0;
		
		while(true) {
			
			int coin=(int)(Math.random()*2+1); //1앞 2뒤
			System.out.print("1.앞면 2.뒷면 : ");
			int user = scan.nextInt();
			
			if(user == coin) {
				System.out.println("정답");
				win++;
			} else {
				System.out.println("땡");
			} money -= 판돈; //1번 진행 시 1000원 차감
			
			 if(money < 판돈) {
				 break;
			 }
			 System.out.println("돈이없습니다 내 돈은 : "+money);
			 System.out.println("몇 번 이겼나요?: "+win);
		}
		
		
		
		
		
//		int num = scan.nextInt();
//
//		while(true) {
//			int com=(int)(Math.random()*50+1);
//			System.out.print("정수입력 : ");
//			if(com == num) {
//				System.out.println("정답!");
//				break;
//			}
//			if(com>num)
//				System.out.println("업");
//			if(com<num)
//				System.out.println("다운");
// 		}
		
	}

}
