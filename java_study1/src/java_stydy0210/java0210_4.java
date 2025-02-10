package java_stydy0210;

import java.util.Scanner;

public class java0210_4 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		// 7개 정수를 저장할 수 있는 배열을 선언하고
		// 정수 7개 입력한 뒤 모두 출력하세요
		
//		int[] arr = new int[7];
//		for(int i=0; i<arr.length; i++) {
//			System.out.print("입력하세요: ");
//			arr[i]=sc.nextInt();
//		}
//		for (int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]); //0번 인덱스부터 6번 인덱스까지
//		}
		
		
		int size = 5;
		int [] age = new int[size];
		// 정적 배열은 지정된 크기를 변경하기 어렵다.
		// 프로그램 실행 시 컴파일 과정에서 배열의 크기가 정해져 있어야
		// 그만큼 할당받는데, 배열의 크기가 확정되어 있지 않으면
		// 컴파일 과정에서 공간을 할당받지 못한다.
		// (윈도우에 의해 필요한만큼 대여 받는건데 정확한 크기가 없으면 대여 안해줌)
		age[0]=10;
		System.out.println(age[0]);
		
		
	}

}
