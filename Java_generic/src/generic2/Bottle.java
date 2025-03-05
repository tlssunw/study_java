package generic2;

public class Bottle<T extends Alcohol> { // 제네릭 타입을 사용하는 클래스
	T item;
	
	public void make(T item) {
		//객체에 대한 제한설정을 메소드 내에 만들어줄 수 있음
		System.out.println("만들기");
		this.item = item;
		System.out.println( item );
	}
	
	public T getItem() {
		return this.item;
	} //제네릭 타입을 반환 타입으로 사용
}
