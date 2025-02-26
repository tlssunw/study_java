package test2;

public class checkCard extends payment{
	
	public checkCard(int m, String date) {
		super(m,date);
	}
	@Override
	public void processPay() {
		System.out.println("체크카드 결제"+this.money+
				"결제일"+this.payDate);
	}

}
