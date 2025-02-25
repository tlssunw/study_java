package inherit;

public class Tv extends Product{ //자식클래스
	
	public Tv() {
		super(); //부모클래스의 생성자메서드
		// super는 부모클래스의 객체를 의미한다.
	}
	
	public Tv(String brand, int price, String name) {
		super();
		super.brand=brand;
		this.price=price;
		this.name=name;
	}
	
	
}
