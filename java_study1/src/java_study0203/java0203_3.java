package java_study0203;

public class java0203_3 {

	public static void main(String[] args) {
		
		// switch 문
		// if 문
		
//		switch(10) {
//		case 1:
//			System.out.println("1을선택");
//			if() {
//				break;
//			}
//			break; //제어문 강제종료
//		case 3:
//			System.out.println("3을 선택");
//		case 10:
//			System.out.println("10을 선택");
//		}
//
//		// break 강제종료시킴
		
		int num = 50;
		switch (num) {
		case 10:
			System.out.println("10 선택");
			break;
		case 30:
			System.out.println("30 할거야?");
			break;
		case 20:
			System.out.println("case에 표현하는 데이터는 정수, 문자, 문자열");
			break;
		case 50:
			System.out.println("입력된 값에 맞는 case 실행은"+ "break 또는} 까지 실행");
			break;
		default:
			System.out.println("case에 없는 값이야 다시해!");
		}
		
//		if(점수<=100 && 점수 >=90) {
//			"a학점"
//		} else if (점수>=80) {
//			"B학점"
//		}
	
		int 점수 = 79;
		switch (점수/10) {
		case 10:
		case 9:
			System.out.println("A학점");
		case 8:
			System.out.println("B학점");
		case 7:
			System.out.println("C학점");
		default:
			System.out.println("F학점");
		
		}
		
		
	}

}
