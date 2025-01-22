package java_study0122;

public class java0122_2 {

	public static void main(String[] args) {
		
		// 증감연산자 ++, --
		int a = 10, b = 10, result = 0;
		// ++
		System.out.println("++ 전 : " + a);
		a++; // a=a+1
		System.out.println("++ 후 : " + a);
		
		++a;
		System.out.println("++a : " + a);
		
		// 증감연산자의 위치가 변수 앞, 변수 뒤 차이
		a=10;
		result = a++;
		System.out.println("result = a++ : " + result);
		result = ++b;
		System.out.println("result = ++b : " + result);
		
		// 증감연산자를 변수 앞에 붙이면 우선순위가 상위권
		// 증감연산자를 변수 뒤에 붙이면 우선순위가 하위권
		
		
	}

}
