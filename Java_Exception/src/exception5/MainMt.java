package exception5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class MainMt {

	public static void main(String[] args) {

//		// 오류가 발생해도 오류가 없어도 무조건 실행
//		Scanner sc = new Scanner(System.in);
//		int money = 0;
//		int total = 0;
//		
//		try {
//			System.out.print("현금: ");;
//			money = sc.nextInt();
//			total = money*5;
//		}catch(Exception e) {
//			System.out.println("숫자만 입력하세요");
//		}finally { // 오류가 나던, 나지 않던 실행한다는 의미의 구문
//			System.out.println("총 금액 : "+total);
//		} // 파일열기, 데이터베이스 연결에서  반드시 파일을 닫고,
//		// 데이터베이스 연결 헤제 하는게 좋다.
		
		String fileName = "c://test//data.txt";
		
		// 자동 자원 봔한
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
			String line = br.readLine();
			System.out.println(line);
		}catch(Exception e) {
			System.out.println("파일 열고 읽기 오류");
			e.printStackTrace();
		}
		
//		BufferedReader read = null;
//		try {
//			read = new BufferedReader(new FileReader(fileName));
//			String line = read.readLine();
//			System.out.println(line);
//		}catch(Exception e) {
//			System.out.println("파일 열고 읽기 오류");
//			e.printStackTrace();
//		}finally {
//			try {
//				read.close();
//			}catch()
//			
//		}
		

	}

}
