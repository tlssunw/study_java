package exception4;

public class MaintMt {

	public static void main(String[] args) {
		
		Member m1 = new Member();
		Member m2 = new Member("김유신", 25);
		
		m1.nameCount(); //name=null
		m2.nameCount();
		
		try {
			int a = m1.getBirthYear(); 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
