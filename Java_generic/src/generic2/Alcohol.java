package generic2;

public class Alcohol { //부모클래스
	protected Alcohol(String name, String cmp, int abv) { //생성자메소드
		this.name=name;
		this.cmp=cmp;
		this.abv=abv;
	}
	protected String name; // 술 이름
	protected String cmp; // 회사명
	protected int abv; // 도수
	
	
	
}
