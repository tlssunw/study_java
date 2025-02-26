package inherit;

public abstract class Product { //부모클래스
	protected boolean onOff=false;
	//protected-부모클래스만 사용하게
	
	public String brand; // 브랜드
	protected int price; // 가격
	protected String name; //제품 이름 - LG휘센, 캐리어 등
	
	public Product() {
		System.out.println("부모클래스생성");
	}
	public Product(String brand, int price, String name) {
		this.brand=brand;
		this.price=price;
		this.name=name;
	}
	
	public abstract void power();
	// 자식 클래스에서 오버라이딩 하기 때문에 부모는 추상적인 메서드로 만들기만 하면 됨
	// 추상메서드는 반드시 추상클래스에서만 가능
	
	// 추상클래스는 객체 생성이 불가

}
