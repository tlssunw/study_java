package inner2;


public class MainMthod {

	public static void main(String[] args) {
		 LocalClass lc = new LocalClass();
		 
		 lc.getBirth();
		 // 지역 내부 클래스는 해당 메서드를 호출해야 사용가능
		 
		 Item item = new Item();
		 item.sale();
		 
		 Item shoes = new Item() {
			 @Override
			 public void sale() {
				 System.out.println("신발 판매");
			 }
			 
			 public void make() {
				 System.out.println("신발 만들기");
			 }
		 }; // 익명클래스 정의와 객체 생성
		 // Item클래스가 부모클래스가 되고 익명클래스가 자식클래스
		 // 익명클래스 다시 정의하고 객체생성해야한다

		 shoes.sale();
//		 shoes.make(); // 오류

		 Animal dog = new Animal() {
			 @Override
			 public void eat() {
				 System.out.println("멍멍이가밥먹는다");
			 }
		 }; //인터페이스를 implements한 익명클래스 정의와 객체
	}

}
@FunctionalInterface
interface Animal{ //Animal 인터페이스 정의
	public void eat(); // 추상메서드
}

class A {
	
}
