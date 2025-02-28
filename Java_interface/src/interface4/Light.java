package interface4;

public class Light implements RemoteCon{

	@Override
	public void operOn() {
		System.out.println("스마트전구를 켭니다");	
	}
	public void operOff() {
		System.out.println("스마트전구를 끕니다");
	}

}
