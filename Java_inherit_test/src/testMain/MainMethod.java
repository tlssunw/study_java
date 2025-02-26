package testMain;

public class MainMethod {

	public static void main(String[] args) {
		
		Circle c = new Circle(10,0);
		c.draw();
		
		Rect r = new Rect(30,41);
		r.draw();
		
		Triangle t = new Triangle(15,20);
		t.draw();

	}

}
