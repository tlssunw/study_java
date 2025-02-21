package study0221;

public class JavaMethod {
	
	static void findSubject(Courses[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i].point==2) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		
		Courses[] course = new Courses[] {
				new Courses(1, "정보사회와 컴퓨터",3),
				new Courses(2, "데이터베이스",3),
				new Courses(3, "자료구조", 3),
				new Courses(4, "JAVA",3),
				new Courses(5, "HTML",2)
		};
		
		findSubject(course);
		
		// 학점이 2학점인 과목을 찾아라!!-메서드
		// 메서드 내용은 courses배열을 반복문으로 돌려서
		// point가 2인 거 찾기 위한 if문
		// 그리고 찾았으면 그 자리에서 출력 할 것인지 아니면 반환할 것인지
		// 내용이 동작하기 위해 필요한 것
		// - courses배열이 필요-> 매개변수

	}
	
}
