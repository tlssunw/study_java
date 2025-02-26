package test2;

public class creditCard extends payment{
	public creditCard(int m, String date) {
		super(m,date);
	}
	@Override
	public void processPay() {
		System.out.println("신용카드 결제"+this.money+
				"결제일"+this.payDate);
	}
}
