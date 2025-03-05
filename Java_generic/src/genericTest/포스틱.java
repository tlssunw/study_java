package genericTest;

public class 포스틱 extends Snack{
	
	public 포스틱(String snackName, int price) {
		super(snackName, price);
	}
	
	@Override
	public String toString() {
		return "과자이름: "+snackName+"가격: "+ price;
	}


}
