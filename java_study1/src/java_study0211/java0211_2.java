package java_study0211;

import java.util.Scanner;

import java.util.Arrays;

public class java0211_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] game = new int[25];
		
		// game 배열에 값 채우기
		for(int i=0; i<game.length; i++)
			game[i] = (int)(Math.random()*50+1);
		
//		System.out.println(Arrays.toString(game));
		
		
		//5줄 5칸 출력
		
		while(true) {
			for(int i=0; i<=4; i++) { // 빙고판 출력 부분
				for(int k=0; k<=4; k++) {
					
					if(game[i*5+k]==0)
						System.out.printf(" %2s ", "■");
					else
						System.out.printf(" %2d ", game[i*5+k]); //%2d=>자리확보를위한값   
				}
				System.out.println();
			}
			
			
			System.out.print("숫자 입력: ");
			int num = scan.nextInt(); //빙고판에 있는 숫자 입력
			
			for(int i=0; i<game.length; i++) {
				if(game[i]==num) { //내가 입력한 숫자를 배열에서 찾기
					 game[i]=0; 
				}
			}
			
			// 5줄 빙고 되면 종료
			// 한줄 빙고 완성이냐, 두줄 빙고 완성이냐 세 줄이냐를 확인할 수 있는 코드 여기 작성
			// I와 K의 관계성을 잘 보고 규칙을 찾아 반복문으로 연결
			
			int[] a= new int[3][4];
			
		}
		
	}

}
