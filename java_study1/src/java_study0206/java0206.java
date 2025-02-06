package java_study0206;

import java.util.Scanner;

public class java0206 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("UP and DOWN 게임(컴퓨터버전");
		System.out.println("1~50중 하나 입력 : ");
		
		int number=scan.nextInt();
		
		int max=50, min =1, t=50; // t변수는 random(); * t로 사용
		
		while (true) {
			int com = (int)(Math.random()*50+1);
			System.out.println("컴퓨터 : "+com);
			if(number==com) {
				System.out.println("정답!");
				break;
			}
			if (number > com) {
				System.out.println("UP");
				min = com+1; //up인 경우 범위의 최소값 변경
				t=max-com; //범위의 최대값에서 현재 값 빼면 * 값 나옴
			}
			if (number < com) {
				System.out.println("DOWN");
				max = com -1; //다운인 경우 범위의 최대값 변경
				t = max-min-1; //범위의 최대값 - 최소값 +1 하면 * 값나옴
			}
		}
	}

}
