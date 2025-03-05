package genericTest;

public class SnackBox<S> {
	
	S snack;
	
	public void makeBox(S 과자봉지) {
		this.snack = 과자봉지;
		System.out.println(this.snack);
		System.out.println("과자 박스만들기");
	}


}
