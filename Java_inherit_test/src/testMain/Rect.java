package testMain;

public class Rect extends Shape{

	public Rect(int w, int h) {
		super(w,h);
	}

	@Override
	public void draw() {
		System.out.println("밑변" + width+
				"높이"+height+"인 사각형을 그린다");
	}
}
