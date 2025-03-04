package inner2;

public class LocalClass {
	
	private String name;
	
	public void getBirth() { //인스턴스 메서드
		class Birth{ //지역 내부클래스
			int year;
			int month;
		}
		Birth b = new Birth();
		b.year=2000;
		b.month=4;
		System.out.println(b.year+" "+b.month);
	}

//	Birth bb = new Birth();
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
