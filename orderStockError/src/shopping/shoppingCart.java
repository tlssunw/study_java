package shopping;

import lombok.ToString;

@ToString
public class shoppingCart extends shoppingMall{ //장바구니서비스

	
	public void delete() {
		System.out.println("장바구니에서 삭제되었습니다");
	}
	
	

	public void allPrice() {
		Price price = new Price();
		
		System.out.println("총가격은: "+ price +"입니다");
	}


	
	public void plus() {//장바구니 추가 메서드
		// 재고가 부족한 경우 주문 방지
		Product p1 = new Product();
		
		p1.amount = 3;
		
		if(p1.amount==0) {
			System.out.println("재고부족");
		}else {
			System.out.println("주문불가");
		}

	}
	
	
}
//Product p1 = new Product();
//int num = 0;
//if(p1.amount > num) {
//	System.out.println("장바구니 추가");
//}
//else if(p1.amount < num ) {
//System.out.println("재고부족");
//}else {
//	System.out.println("주문불가");
//
//}
