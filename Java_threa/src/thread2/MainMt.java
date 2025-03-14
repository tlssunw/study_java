package thread2;

public class MainMt {

	public static void main(String[] args) {

		Cafe cafe = new Cafe(); //카페 오픈
		
		Thread barista = new Thread(new Barista(cafe));
		Thread customer = new Thread(new Customer(cafe));
		
		barista.start(); // 바리스타 스레드 시작 - 제조할 준비 완료
		customer.start(); //손님 스레드 시작 - 주문할 결심
	}

}
