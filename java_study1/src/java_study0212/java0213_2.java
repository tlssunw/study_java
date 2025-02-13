package java_study0212;

public class java0213_2 {

	public static void main(String[] args) {

		// 문자열 메서드(그나마 많이 쓰이는거)
		
		String word="i like tomato";
		//문자열에서 특정 문자 추출
		System.out.println(word.charAt(7));
		
		//문자열에서 지정된위치 문자열 추출
		System.out.println(word.substring(2));
		
		// 2번인덱스부터 6번인덱스 전까지
		System.out.println(word.subSequence(2, 6));
		String temp = word.substring(2,6);
		System.out.println(temp);
		
		// 문자열의 길이(전체 문자가 몇 개인가?)
		System.out.println(word.length());
		
		String text = "나랏말싸미 듕귁에 달아 문자와로 서르 사맛디 아니할세";
		
		//문자열에서 특정 문자 또는 문자열 인덱스 구하기
		int idx = text.indexOf("문");
		System.out.println(idx);
		
		idx=text.indexOf("문자와로");
		System.out.println(idx);
		
		//문자와로부터 출력할래
		idx=text.indexOf("문자와로");
		System.out.println(text.substring(idx));
		//indexOf() 메서드는 문자열에서 특정 문자나 문자열의 인덱스를 알려주는데
		//만약 문자열에 없는 값이라면 -1을 준다.
		//문자열에 특정 문자나 문자열이 포함되어 있는지 알 수 있다.
		
		System.out.println(text.contains("듕귁에"));
		
		//문자열 비교 - equals() 문자열A.equals(문자열B)
		//결과는 true, false
		
		//문자열 분할
		text = "서경림-김현진-김미란-김석진-주동건-정수영";
		System.out.println(text.split("-")[2]);
		
		String[] names=text.split("-");
		System.out.println(names[4]);
		
		//배열->문자열로 변환 
		text = String.join(",",names);
		System.out.println(text);
		
		//대문자, 소문자
		System.out.println(word);
		System.out.println(word.toUpperCase()); //대문자로 변경
		System.out.println(word.toLowerCase()); //소문자로 변경
		
		//문자열 합치기 "abc" + "zxc"=>abxzxc
		System.out.println("abc"+word);
		System.out.print("abx".concat(word));
		
		//String 타입의 변수가 비었냐?(문자열이 저장되었느냐?)
		System.out.println(word.isBlank()); // false, true로 답변
		System.out.println(word.isEmpty());
		
		word="";
		System.out.println(word.isBlank()); 
		System.out.println(word.isEmpty());  // 띄어쓰기도 문자로구분
		
		word=" ";
		System.out.println(word.isBlank());
		System.out.println(word.isEmpty());
		
		//Empty 는 문자열의 인덱스가 존재하지 않아야 true
		//Blank 는 띄어쓰기와 같이 빈공간인 경우에도 비었다고 표기
		
//		word=null; //null이 저장되어 있는 경우에는 문자열 관련 메서드 사용불가
//		System.out.println(word.isBlank());
//		System.out.println(word.isEmpty());
		
		//문자열 치환
		
		word = "김현진은 너구리를 좋아한다.";
		System.out.println(word.replace("너구리", "강아지"));
		
		text=word.replace("너구리", "강아지");
		System.out.println(text); //저장해줘야 영구사용가능
		
		word = "010.1234.5678.9123";
		System.out.println(word.replaceAll("[0-4]","a"));
	}

}
