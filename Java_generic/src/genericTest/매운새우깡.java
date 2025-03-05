package genericTest;

public class 매운새우깡 extends Snack{
	
	public 매운새우깡(String snackName, int price) {
		super(snackName, price);
	}

	@Override
	public String toString() {
		return "과자이름: "+snackName+"가격: "+price;
	}


}
