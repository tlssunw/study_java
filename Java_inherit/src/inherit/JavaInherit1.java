package inherit;

public class JavaInherit1 {
	public static void main(String[] args) {
		
		Tv tv = new Tv("삼성",950000,"st60");
		Aircon air
		= new Aircon("캐리어",542000,"ca18t");
		Computer com = new Computer("삼성",1730000,"매직스테이션10");
		
		tv.power();
		air.power();
		com.power();
		
		
	}
}
