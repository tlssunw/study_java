package test2;

public class cash extends payment{
	public cash(int m, String date) {
		super(m,date);
	}
	@Override
	public void processPay() {
		System.out.println("현금 결제"+this.money+
				"결제일"+this.payDate);
	}
}
