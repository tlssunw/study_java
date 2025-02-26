package test2;

public abstract class payment {
	
	protected int money;
	protected String payDate;
	
	protected payment() {}
	protected payment(int m, String date) {
		this.money=m;
		this.payDate=date;
	}
	public abstract void processPay();

}
