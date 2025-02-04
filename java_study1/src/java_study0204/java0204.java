package java_study0204;

import java.util.Scanner;

public class java0204 {

	public static void main(String[] args) {
		
		Scanner sc new Scanner(System.in);
		
		// if문
		System.out.print("1. 가위 2.바위 3.보");
		int me = sc.nextInt();
		
		int com = (int)(Math.random()*3+1);
		
		if (me == com) {
			System.out.println("비김");
		} else if ((me ==1 && com==3) || (me ==2 && com==1) || (me==3 && com==2)) {
			System.out.println("이김");
		} else {
			System.out.println("패배");
		}
		
		// switch문
		switch (me-com) {
		case 0:
			System.out.println("비김");
			break;
		case -2:
		case 1:
			System.out.println("이김");
		case -1: case 2:
			System.out.println("패배...");
			break;
		}

	}

}
