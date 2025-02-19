
package study0218;

public class ClassArray {

	public static void main(String[] args) {

//		Member mem = new Member();
//		mem.name="김유신";
//		mem.job="군인";
//		mem.age=38;
		
		
		Member[] members = new Member[5];
		// 5명 정보 저장 가능 ....하지만?
//		for(int i=0; i<members.length; i++)
//			members[i] = new Member();
		
//		members[0].job="감찰관";
//		members[0].name="박문수";
//		members[0].age=34;
//		members[1].job="군인";
//		members[1].name="이순신";
//		members[1].age=31;
//		members[2].job="문익점";
//		members[2].name="산업스파이";
//		members[2].age=45;
//		
//		for(int i=0; i<members.length; i++) {
//			System.out.println(members[i].name);
//			System.out.println(members[i].job);
//			System.out.println(members[i].age);
//		}
		
//		Member info = new Member();
//
//		Movie mo = new Movie();
//		mo.title = "캡틴아메리카";
//		mo.genre = "액션판타지";
//		mo.gallery = 1000000;
//		mo.open = 2025;
		
//		Member info = new Member();
//		System.out.println(info);
//		System.out.println(info.name);
//		
//		Member m1 = new Member();
//		System.out.println(m1.name);
		
		Member info = new Member(20, "군인");
		
		System.out.println(info.job);
		
		
		
	}

}


