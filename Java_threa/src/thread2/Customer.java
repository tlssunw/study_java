package thread2;

import java.util.Random;

public class Customer implements Runnable{
	private Cafe cafe;
	private final String[] menu = {"아메리카노","키위주스","라떼","아인슈페너"};
	private final Random random  = new Random();
	
	public Customer(Cafe cafe) {
		this.cafe=cafe;
	}

	@Override
	public void run() {
		try {
			while(true) {
				String item = menu[random.nextInt(menu.length)];
				cafe.placeOrder(item);
				Thread.sleep(2000);
			}
		}catch(Exception e){
			e.printStackTrace();
		}

		
	}

} //손님
