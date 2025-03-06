package collection1;

import java.util.ArrayList;

public class MainMt {

	public static void main(String[] args) {
		
//		MyArray a = new MyArray();
//		a.add(100);
//		a.add(20);
//		a.add(40);
//		a.add(120);
//		a.add(2);
//		
//		System.out.println(a.get(3));
		
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(1023);
		list.add("장미란");
		list.add("포카칩");
		list.add(3.144);

		System.out.println( list.size() ); // 크기 - 데이터 몇개 저장되어 있는가
		System.out.println( list.get(2)); // 인덱스 위치의 데이터 출력
		System.out.println( list.indexOf("포카칩")); // 배열에 특정데이터 어디?
		
		list.remove( 0 ); // 인덱스를 지정하여 해당 데이터 삭제
		list.remove( "포카칩"); // 삭제 할 데이터 입력하여 삭제
		System.out.println( list );
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(Object o : list) {
			System.out.println(o);
		}
		// object - 제네릭으로 지정한 클래스타입
		
		list.add(1, "내가원하는곳"); //add는 오버로딩되어있음
		System.out.println(list);
		System.out.println(list.contains("장미란"));
		// contains-배열안에 "장미란"이 있는지 없는지 확인해줌
		
		list.clear();
		// 배열에 있는 내용 싹 정리
		System.out.println(list);
	}
	
	

}
