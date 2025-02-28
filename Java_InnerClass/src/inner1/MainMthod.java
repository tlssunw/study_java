package inner1;

public class MainMthod {

	public static void main(String[] args) {

//		Test.A a = new Test.A();

		Test t = new Test();
		
		t.setNum(10); //내부클래스가 노출 안됨
		t.innerView();
	
		t.a.num=10; //내부클래스가 노출됨
		
//		Test.A a = t.new A();
//		a.num=10;
//		a.num=20;
		
		// 정적 내부클래스를 굳이 노출하면서 객체를 만들고자 한다면
		Test.Dog dof = new Test.Dog();
		
		Test.Origin(); // 클래스 메서드 실행은 객체없이 가능하다.
		
	}

}
