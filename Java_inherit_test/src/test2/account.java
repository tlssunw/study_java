package test2;

public class account extends payment{
	public account(int m, String date) {
		super(m,date);
	}
	@Override
	public void processPay() {
		System.out.println("계좌이체 결제"+this.money+
				"결제일"+this.payDate);
	}
}
