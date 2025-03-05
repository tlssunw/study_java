package genericTest;

public class 예감 extends Snack{
	
	public 예감(String snackName, int price) {
		super(snackName, price);
	}
	@Override
	public String toString() {
		return "과자이름: "+snackName+"가격: "+price;
	}


}
