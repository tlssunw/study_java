package java_study0121;

public class java0121_2 {

	public static void main(String[] args) {
		
		System.out.println("한 줄에 하나씩 출력");
		System.out.print("한 줄에 이어서 출력");
		System.out.print("   그 다음 이어서 출력");
		
		System.out.printf("그냥 print처럼 사용 가능");
		System.out.printf("println처럼 \n하려면 \n");
		System.out.printf("다음 줄에 출력 \n"); //\n =enter key
		System.out.printf(" %d ", 100); //,뒤에 있는 문자를 표현하기 위해
		System.out.printf(" %% "); // printf에서는 %를 사용하려면 두개 이상 사용해야 출력됨
		// 형식지정자를 사용하기 위해 주의해야 할 것
		// 1. 형식 지정자와 데이터 위치를 맞춰야 한다.
		System.out.printf("%d  %f ", 100, 3.14);
		// 2. 형식 지정자와 데이터 갯수 맞춰야 한다.
		System.out.printf("%d %d", 10, 20, 30);
		
		// println과 printf 의 출력 차이
		System.out.println(2025+"년" + 1+"월" +21+"일");
		System.out.printf("%d년 %d월 %d일 \n", 2025,1,21);
		
		float fnum = 5.12345f;
		System.out.println("println 출력 :" + fnum);
		System.out.printf("printf 출력 %.1f \n", fnum);
		// ㄴ%f는 기본 6자리 출력이기 때문 / %.1f = .뒤 한 자리만 표현
		
		int num =15;
		System.out.println(num);
		System.out.printf("%-4d\n", num); //자리 수 확보

	}

}



/*
	형식 지정자 *서식문자
	%d, %i - 10진수 정수
	%f - 10진수 실수
	%c - 문자
	%s - 문자열
	%b - boolean 타입
*/