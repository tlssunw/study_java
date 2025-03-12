package shopping;

import java.util.Scanner;

public class MainMt {
	
	private static Scanner scan = new Scanner(System.in);
	private static int menu(shoppingCart shoppingCart) {
		System.out.println("\n----기능 선택----\n");
		System.out.println("1. 장바구니 재고 확인: ");
		System.out.println("2. 장바구니 상품 삭제: ");
		System.out.println("3. 장바구니 총 가격: ");
		System.out.println("선택 : ");
		int num = scan.nextInt();
		
		if(num==1) {
			shoppingCart.plus();
		}else if(num==2) {
			shoppingCart.delete();
		}else if(num==3) {
			shoppingCart.allPrice();
		}else if(num==4) {
			return 0;
		}
		return menu(shoppingCart);
	}
		
	
	public static void main(String[] args) {
		Product product = new Product();
		shoppingCart shoppingCart = new shoppingCart();

		menu(shoppingCart);
		}
}
