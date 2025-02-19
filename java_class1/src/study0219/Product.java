package study0219;

public class Product {
	String name; //상품명
	String brand; //브랜드
	int quantity; //수량
	
	Product(){} //기본생성자메서드
	Product(String name, int quantity){
		this.name=name;
		this.quantity=quantity;
	}
	Product(String name, String brand, int quantity){
		this.name=name;
		this.brand=brand;
		this.quantity=quantity;
	}

}
