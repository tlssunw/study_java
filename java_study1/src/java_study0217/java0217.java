package java_study0217;

import java.util.Arrays;
import java.util.Collections;

public class java0217 {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
		
		/*
		 문제 4. 도서관
		 도서관의 관리자로 대출한 사람들의 기록을 관리하고 있다.
		 도서관에서 여러사람들이 책을 대출하며 각 사람은 여러권의 책을 대출할 수 있다.
		 
		 각 사람이 대출한 책의 제목을 배열로 저장하고
		 그 사람의 대출내역을 출력하는 프로그램을 작성하시오.
		 
		 조건.
		 	- 도서관에는 3명의 이용자가 있고 최대 5권까지 대출
		 	- 각 이용자의 이름과 대출한 책 제목을 출력
		 	
		 	# 이용자의 이름과 책 제목은 키보드를 통해 입력해도 되고
		 	  배열 선언 시 초기값 지정 해도 되고
		 */
		
//		String user1="이순신";
//		String user2="이성계";
//		String user3="김유신";
//		
//		String[] user1_1 =  {user1, "책1", "책2", "책3", "책4", "책5"};
//		String[] user2_1 =  {user2, "책6", "책7"};
//		String[] user3_1 =  {user3, "책8", "책9", "책10"};
//		
//		System.out.println(Arrays.toString(user1_1));
//		System.out.println(Arrays.toString(user2_1));
//		System.out.println(Arrays.toString(user3_1));
//		
//		
//		String[][] book = new String[][]{
//				{"이순신","자바","C언어","Html"},
//				{"김유신","C++","컴퓨터개론","삼국지1","삼국지2"},
//				{"박문수","홍길동전","심청전","안데르센동화1"}
//		};
//		for(String[] info : book) {
//			for(String tmp:info) {
//				System.out.print(tmp);
//			}
//			System.out.println();
//		}
				
		
		// 농장 수확량 계산
		// 농장의 일일 수확량을 배열에 저장했다.
		// 전체 수확량을 구하고, 평균 수확량을 구하세요
		// 가장 많은 수확량은 얼마인지 출력
		
		int[] harvest = {9,10,11,8,7,5};
//		Arrays.sort(harvest);
//		System.out.println(Arrays.sort(harvest));
		
		int total=0;
		for(int am : harvest) {
			total = total+am;
		}
		System.out.println("전체 수확량 : " + total);
		
		float avg = total/(float)harvest.length;
		System.out.println("평균 수확량 : "+avg);
		
		Arrays.sort(harvest);
		System.out.println("가장 많은 수확량 : "+harvest[harvest.length-1]);
//		System.out.println(Arrays.toString(harvest));
		
//		int avg=0, sum=0;
//		for(int num:harvest) {
//			sum=sum+num;
//		}
//		avg = sum/harvest.length;
//		System.out.println("평균 수확량은 : "+avg);

	}

}
