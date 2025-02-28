package interface1;

public class MainMethod {

	public static void main(String[] args) {
		
		김명준 준 = new 김명준();
		최예나 나 = new 최예나();
		
		준.moving();
		나.moving();
		// Active = Move와 Attack을 상속하고 있기 때문에 가능
		Active 명준 = new 김명준();
		Active 예나 = new 최예나();
		명준.moving();
		
		Attack 명준1 = new 김명준();
		명준1.target();
		
	}

}
