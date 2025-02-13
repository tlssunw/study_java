package java_study0213;

import java.util.Scanner;

public class java0213 {

	public static void main(String[] args) {

		String title = "자바는 즐거워";
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("제목입력 : ");
//		title = scan.next(); //nextline();
		
		System.out.println(title);
		
		System.out.print("나이: ");
		int age = scan.nextInt();
		
		System.out.print("이름: ");
		String name = scan.next();
		System.out.print("키: ");
		int tall = scan.nextInt();
		
		System.out.println(age + " " + name);
		
				
	}

}
