package shopping;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@Setter
//@Getter
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
public class Product extends shoppingMall{
	String name; //이름
	int price; //가격
	int amount; //재고
	
	Product(){}
	Product(String name, int price, int amount){
		this.name=name;
		this.price=price;
		this.amount=amount;
	}

	
}
