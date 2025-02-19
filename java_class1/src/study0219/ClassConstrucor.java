package study0219;

public class ClassConstrucor {

	public static void main(String[] args) {
		
		Food f1 = new Food("돈까스",8000);
		
		System.out.println(f1.foodName);
		
		Food f2 = new Food();
		// 기본생성자 메소드가 존재하기에 Food() 실행됨
		
		Product pr = new Product();
		Product pr1 = new Product("자바칩프라푸치노",12);
		Product pr2 = new Product("바닐라라떼","빽다방",15);
		
		

	}

}
