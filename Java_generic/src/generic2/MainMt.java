package generic2;

public class MainMt {

	public static void main(String[] args) {
		
//		Bottle<String> b1 = new Bottle<String>();
//		// Bottle클래스의 제네릭 타입으로 String 지정함
//		// String item으로 변경, make메소드의 매개변수 String item으로 변경
//		b1.make("레몬소주");
		
		Soju sj = new Soju("참이슬","진로",16);
		Wine wn = new Wine("디안느소비뇽","앙드레뤼통",12);
		Makgeolli mg = new Makgeolli("공주밤막걸리","사곡양조원",6);
		
		Bottle<Soju> 참이슬 = new Bottle<>();
		// 앞쪽에서 제너럴타입 지정해줬다면 뒤에는 꺽새만 표현해도 됨
		참이슬.make(sj);
		Soju al = 참이슬.item;
		al.aa();
		
		Bottle<Alcohol> 술병 = new Bottle<>();
		술병.make(wn);
		
		Bottle<Makgeolli> 밤막걸리 = new Bottle<>();
		밤막걸리.make(mg);
		
		Service 은호 = new Service();
		은호.drink(참이슬);
		
		Service 수영 = new Servie();
		수영.drink(밤막걸리);
		

		
//		술병 = 참이슬;
		// 자식은 부모클래스로 들어갈 수 있지만 제네틱타입은 부모자식 따지지 않
		
		Alcohol ach = sj; 
		
		
		
//		Bottle<Wine> 소비뇽 = new Bottle<>();
//		소비뇽.make(wn);
//		

//		
//		Bottle<Alcohol> 소주병 = new Bottle<>();
//		소주병.make(sj); //부모에서 제네릭을 사용해도 자식클래스 객체 다룰 수 있음
		
//		Bottle<Toy> 티니핑 = new Bottle<>();
//		티니핑.make(new Toy());
		

	}

}
