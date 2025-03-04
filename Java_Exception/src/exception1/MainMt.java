package exception1;

import java.util.InputMismatchException;
import java.util.Scanner;
public class MainMt {

	public static void main(String[] args) {

		// 예외처리
		int a = 10;
		Scanner sc = new Scanner(System.in);
		
		try { //오류가 예상되는 코드 부분에 try로 감싼다
			System.out.print("a변수 입력: ");
			a = sc.nextInt();
			
			System.out.println(a/0);
		}catch( ArithmeticException e ) {
			System.out.println("0으로 나누면 실행 안돼");
		}catch( Exception i ) {
			System.out.println("정수로 입력 해야 돼");
		}
		//try안에서 발생한 부분을 catch가 가져간다.(프로그램이 계속 실행될 수 있도록)
		
	}

}
