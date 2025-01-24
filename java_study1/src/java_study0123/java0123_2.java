package java_study0123;

public class java0123_2 {

	public static void main(String[] args) {
		
		//비트 논리 연산자
		System.out.println(27 & 13); // and연산
		System.out.println(27 | 13); // or연산
		System.out.println(27 ^ 13); //xor연산
		System.out.println(~13); // not 연산
		
		//비트 쉬프트연산자
		System.out.println(21 << 2); //21을 왼쪽으로 2칸 이동
		// <<시프트 연산자
		// 이동시켜주는 연산자(왼쪽으로 두 칸씩 이동)
		System.out.println(17 >> 3); // >> 시프트 연산자
		
		//if문
		// 바이킹 탑승 - 키가 140 이상만 탑승
		int tall = 163;
		//if문에는 조건식이 반드시 if뒤에 붙어야 한다.
		if(tall>=140) { //중괄호는 
			System.out.println("탑승가능");
			System.out.println("키가 140 이상이다.");
			int a=10;
			a = 132+2;
		} else { //else는 조건식이 거짓일 경우 실행
			System.out.println("탑승불가");
		}
		
		
		// 두 숫자 중 큰 수는 ?
		int num1 = 35, num2 = 12;
		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}

		// 철수와 민수 중 누구 발이 더 큰가?
		int 철수 = 275, 민수=260;
		if (철수>민수) {
			System.out.println("철수가 더 크다");
		}else {
			System.out.println("민수가 더 크다");
		}
		
		// 편의점에서 도시락을 사먹는데, 가격이 5200원이다
		// 내 통장 잔액이 4530원이라면, 얼마를 이체 해야 할까?
		// (잔액이 충분하다면 이제할 필요 없다.)
		int 도시락=5200, 잔액 = 4530;
		if (도시락 > 잔액) {
			System.out.println((도시락-잔액)+"원을 이체하세요");
		} else {
			System.out.println("이체할 필요가 없습니다");
		}
		
		// 바이킹 탑승 조건 - 키가 140이상 190이하 만 가능
		if(tall>=140 && tall<=190) {
			System.out.println("탑승조건");
		}else {
			System.out.println("탑승불가");
		}
		
		// 후룸라이드 탑승 하려면 키가 130이상 이거나 몸무게 45kg이상만 가능
		tall=125;
		int wg = 35;
		if (!(tall >= 130 || wg>=45)) {
		 System.out.println("탑승가능");
		} else {
			System.out.println("탑승가능");
		}
	}

}
