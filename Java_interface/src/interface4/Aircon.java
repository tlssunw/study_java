package interface4;

public class Aircon implements RemoteCon{

	@Override
	public void operOn() {
		System.out.println("에어컨을 켭니다");	
	}
	public void operOff() {
		System.out.println("에어컨을 끕니다");
	}

}
