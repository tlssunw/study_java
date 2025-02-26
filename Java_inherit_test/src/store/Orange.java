package store;

public class Orange extends Fruit {
	
	public static Orange orange;
	public Orange(int cost, int capacity) {
		super(cost, capacity);
	}
	
	@Override
	public void makeJuice() {
		System.out.println("오렌지 주스 제조");
	}
	@Override
	public void pieceFruit() {
		System.out.println("오렌지 네조각");
	}
	@Override
	public String toString() {
		return("오렌지"+cost+"원 "+capacity+"ml");
	}
	
	

}
