package inherit;

public class Product { //부모클래스
	protected boolean onOff=false;
	//protected-부모클래스만 사용하게
	
	protected String brand; // 브랜드
	protected int price; // 가격
	protected String name; //제품 이름 - LG휘센, 캐리어 등
	
	public void power() {
		onOff=!onOff;
		System.out.println("전원 :"+onOff);
	}

}
