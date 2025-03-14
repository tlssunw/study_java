package thread2;

public class Cafe {
	private Order order;
	private boolean orderPlace = false; // 주문 했냐(true) 안했냐(false)   
	
	public synchronized void placeOrder(String menu) throws InterruptedException { //매장에서 먹기
		while(orderPlace) { // 제조하는동안 손님 대기
			wait();
		}
		order=new Order(menu);
		System.out.println("손님 매장 주문: "+order.getOrderId()+
				" - "+order.getMenu());
		orderPlace = true;
		notify(); // 주문이 들어갔으니까 바리스타를 실행
	}
	
	public synchronized Order give() throws InterruptedException {
		while(!orderPlace ) {
			wait(); // 주문이 들어오기 전까지 바리스타는 대기
		}
		orderPlace=false;
		notify();
		return order;
	}

}
