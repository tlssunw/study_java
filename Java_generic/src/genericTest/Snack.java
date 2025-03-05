package genericTest;

public class Snack {

	protected Snack(String snackName, int price) {
		this.snackName=snackName;
		this.price=price;
	}
	protected String snackName; //과자이름
	protected int price; //가격

	@Override
	public String toString() {
		return "과자이름: "+snackName+"가격: "+ price;
	}
}
