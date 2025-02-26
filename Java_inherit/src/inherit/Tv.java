package inherit;

public class Tv extends Product{ //자식클래스
	
	public Tv() {
		super(); //부모클래스의 생성자메서드가 반드시 먼저 실행된다.
		// super는 부모클래스의 객체를 의미한다.
		System.out.println("자식");
	}
	
	public Tv(String brand, int price, String name) {
		super(brand,price,name);
	}
	
	@Override
	public void power() {
		onOff=!onOff;
		System.out.println("Tv 전원 :"+onOff);
	}
	
}
