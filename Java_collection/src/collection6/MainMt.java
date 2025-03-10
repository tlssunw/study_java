package collection6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MainMt {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.add("이순신");
		set.add("김유신");
		set.add("이성계"); set.add("강감찬");
		set.add("문익점"); set.add("박문수");
		set.add("정약용");
		
		System.out.println( set );
		
		set.add("김유신");
		System.out.println( set );
		
		// ! 데이터 하나하나 다루고 싶을땐 -> 배열로 바꾼ek
		// HashSet은 직접 값 한 개씩 출력 불가
		
		// HashSet에 저장되어 있는 값 하나씩 출력 하는 방법
		set.toArray(); // set을 배열로 바꿔줌
		ArrayList<String> array = new ArrayList<>(set);
		// arraylist로 바꿔줌
		System.out.println( array.get(2) );
		
		// 두번째 방법
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			// 화면에 하나씩 출력하는 방법
		}
		
		// 거래내역 - 3달 치 거래내역 가져온다.
		// 만원 이하, 5만원 이하, 10만원 이하
		// 거래내역을 데이터베이스에서 가져와서 ArrayList나 vector에 저장
		// 반복문 돌리면서 if문 사용해서 만 원 이하인 경우
		// HashSet A에 저장, 5만원 이하는 HashSet B에 저장
		// HashSet C에는 10만원 이하 저장
		
		set.remove("김유신");
		System.out.println(set);
		System.out.println(set.contains("강감찬"));
		
		// 집합 직접 구현하기
		HashSet<String> 찬양과일 = new HashSet<>();
		찬양과일.add("바나나"); 찬양과일.add("수박");
		찬양과일.add("딸기"); 찬양과일.add("참외");
		찬양과일.add("키위"); 찬양과일.add("메론");
		
		HashSet<String> 예나과일 = new HashSet<>();
		예나과일.add("체리"); 예나과일.add("자두");
		예나과일.add("메론"); 예나과일.add("무화과");
		예나과일.add("망고"); 예나과일.add("바나나");
		예나과일.add("수박"); 예나과일.add("오렌지");
	
		// 교칩합
		HashSet<String> 교집합 = new HashSet<>();
		Iterator<String> 과일 = 찬양과일.iterator();
		while(과일.hasNext()) {
			String fruit = 과일.next();
			if(예나과일.contains(fruit))
			{ 	
				교집합.add(fruit);
			}
		}
		System.out.println(교집합);
		
		// 차집합
		// 찬양과일의 차집합 구하기
		HashSet<String> 차집합 = new HashSet<>();
		과일 = 찬양과일.iterator(); // Iterator는 일회용이다.
		while (과일.hasNext()) {
			String fruit = 과일.next();
			if(!예나과일.contains(fruit)) {
				차집합.add(fruit);
			}
		}
		System.out.println(차집합);
		
		// 합집합
		// 찬양과일과 예나과일의 모든 과일
		HashSet<String> 합집합 = new HashSet<>();
		과일 = 찬양과일.iterator();
		while (과일.hasNext()) {
			합집합.add(과일.next());
		}
		과일 = 예나과일.iterator();
		while(과일.hasNext()) {
			합집합.add(과일.next());
		}
		System.out.println(합집합);
		
		// Set의 메서드를 이용하여 교집합, 차집합, 합집합
		HashSet<String> 교집합2 = new HashSet<>();
		교집합2.retainAll(예나과일); // retain - 교집합
		System.out.println(교집합2);
		
		HashSet<String> 차집합2 = new HashSet<>(찬양과일);
		차집합2.removeAll(예나과일); //removeAll - 공통된걸 뺀다
		System.out.println(차집합2);
		
		HashSet<String> 합집합2 = new HashSet<>(찬양과일);
		합집합2.addAll(예나과일); // addAll - 기존집합에 추가로 넣어준다
		System.out.println(합집합2);
	}

}
