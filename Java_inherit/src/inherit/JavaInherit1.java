package inherit;

public class JavaInherit1 {
	public static void main(String[] args) {
		
		Tv tv = new Tv();
//		tv.onOff=true; // 전원 on
		tv.power(); // 전원 on true
		tv.power(); // 전원 off false
		tv.brand="삼성";
		tv.price=1200000;
		tv.name="OLED ST60";
		
		Computer com = new Computer();
		com.onOff=true; // 전원 on
		
	}
}
