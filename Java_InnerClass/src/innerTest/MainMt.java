package innerTest;

public class MainMt {

	public static void main(String[] args) {
		// job클래스를 이용해 익명클래스 다루기
		// 익명 클래스 객체를 통해 직업을 입력하고 myjob메서드 실행하여 내 직업 출력
		
		Job job = new Job() { 
			@Override
			public void myJob() {
				System.out.println(Jobname);
			}
		}; //익명클래스 정의와 객체 생성
		job.Jobname="웹프로그래머";
		job.myJob();
		
		// work 인터페이스 이용해 익명클래스 다루기
		// working 메서드를 실행하여 내가 하는 일 출력하기
		
		Work work = new Work() {
			@Override
			public void working() {
				System.out.println("게시판 CRUD 구현");
			}
		}; // 익명클래스 정의와 객체 생성
		work.working();
	}

}