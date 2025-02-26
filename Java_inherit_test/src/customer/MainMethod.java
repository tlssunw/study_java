package customer; 

import store.Banana;
import store.Orange;
import store.Grape;
import store.Fruit;

public class MainMethod {

	public static void main(String[] args) {
	
		Banana.banana = new Banana(6000,100);
		Grape.grape = new Grape(5000,100);
		Orange.orange = new Orange(4000,500);
		
		
//		// 바나나와 포도, 오렌지 갯수가 많이 필요하다면?
//		// 바나나 15개, 포도 6개, 오렌지 54개
//		

		
		
		// 다형성 - 하나의 타입으로 여러 타입을 나눌 수 있다.
		// 상속 관계, implements,  
		
//		Fruit f = new Banana(2500,500); // f에 바나나 객체를 담음
//		f.makeJuice();
//		Fruit g = new Grape(3500,400);
//		f.makeJuice();
		
		
		Fruit[] menu = new Fruit[10];
		menu[0] = new Banana(2500,350);
		menu[1] = new Banana(3000,400);
		menu[2] = new Orange(3500,400);
		menu[3] = new Banana(3500,500);
		menu[4] = new Grape(4500,350);
		menu[5] = new Banana(4500,550);
		menu[6] = new Grape(5000,450);
		menu[7] = new Orange(4000,350);
		menu[8] = new Orange(5000,550);
		menu[9] = new Grape(6000,600);
		//import 해야 빨간줄 나오지 않음 
		
//		menu[2].makeJuice();
//		menu[6].pieceFruit();
		
		Buyer ctml = new Buyer(10000); //구매자
		
		for(Fruit m : menu) {
			System.out.println( m );
//			// 출력 결과 -> 바나나 2500원 350ml 
		}
		System.out.println( ctml );
		// 출력 결과 -> 보유머니 : 10000원
		
//		System.out.println("보유머니 :"+ctml.getMoney());

	}

}
