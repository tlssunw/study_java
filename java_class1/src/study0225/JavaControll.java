package study0225;

public class JavaControll {
	
	final void sum(int a, int b) {
		// 메서드에 final하면 오버라이딩이 안된다.
		// 오버로딩은 새로운 메서드를 정의하는 것 이고
		// 오버라이딩은 기존의 메서드를 내용만 재정의 하는 것 이다.
		// 그래서 final 붙어있는 메소드는 변경될 수 없이 때문에 오버라이딩 불가
		System.out.println("내가 sum이다");
	}
	void sum(int a) {
		int tot = a+20;
		System.out.println("아니야 내가 sum이야");
	}

	public static void main(String[] args) {
		
		final int year = 2025; //year 변수의 값 변경 불가

		
		Movie m = new Movie();
		// private 제어자 붙은 변수에 데이터 저장
		// 생성자 메서드를 사용해서 변수 초기화
		
		System.out.println(m.title);
	}

}
