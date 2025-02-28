package interface4;

public class Tv implements RemoteCon{

	@Override
	public void operOn() {
		System.out.println("tv를 켭니다");	
	}
	public void operOff() {
		System.out.println("tv를 끕니다");
	}

}
