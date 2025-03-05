package generic2;

public class Soju extends Alcohol{
	
	public Soju(String name, String cmp, int abv) {
		super(name, cmp, abv);
	}
	
	@Override
	public String toString() {
		return "소주 : "+cmp+", "+name+", "+"도수: "+abv+"%"; 
	}
	
	public void aa() {
		System.out.println("나는 소주다");
	}
}
