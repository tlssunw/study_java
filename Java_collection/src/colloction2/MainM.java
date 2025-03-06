package colloction2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainM {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("김춘추"); names.add("박은희");
		names.add("최예나"); names.add("정소영");
		names.add("김현직"); names.add("서경석");
		System.out.println(names);
		
		// 이순신 이름이 등록되지 않으면 등록 하고 이름이 있으면 등록 안하고 하려면?
		boolean hasName = names.contains("이순신");
		System.out.println(hasName);
		if(!hasName)
			names.add("이순신");
		
		System.out.println(names);
		
		// list -> Array 변경해주는 방법
		String[] arr = names.toArray( new String[names.size()]);
		// toArray - 배열 정렬
		
		// Array(배열) -> list 변경
		ArrayList<String> n = new ArrayList<>(Arrays.asList(arr));
		
		// ArrayList를 정렬하는 방법 - 오름차순
		System.out.println(" === 정렬 전 ( names ) ===");
		System.out.println(names);
		
		Collections.sort(names);
		System.out.println(" === 정렬 후 ( names ) ===");
		System.out.println(names);
		
		// 내림차순
		Collections.sort(names, Collections.reverseOrder());
		//reverseOrder() - 역방향 정렬
		System.out.println(names);
		
		//최예나->최예너로 변경
		names.set( names.indexOf("최예나"), "최예너");
		// 변경할 인덱스, 변경데이터 <--두개의 인자를 넣어줘야함
		System.out.println(names);
		
		// 김씨 성을 가진 사람만 출력
		for(String name : names ) {
			if (name.charAt(0)=='김') 
				System.out.println(name);
		} //charAt - 문자열에서 문자만 빼옴 
		
		// 이름에 '영'을 '진'으로 변경
		names.add("박수영"); names.add("김나영");
		
		System.out.println(names);
		
		for(int i=0; i<names.size(); i++) {
			if(names.get(i).contains("영")) {
				names.set(i, names.get(i).replace("영", "진"));
			}
		}	
		System.out.println(names);
		
		ArrayList<Integer> number = new ArrayList<>();
		number.add(100); number.add(544);
		number.add(213); number.add(11);
		number.add(32); 
		
		for(Integer num : number) {
			System.out.println(num);
		}
		
		// 1~50 랜덤 범위에서 25개 숫자를 저장, 중복 없음
		ArrayList<Integer> bingo = new ArrayList<>();
		
		do {
			int temp = (int )(Math.random()*50+1);
			if(!bingo.contains(temp))
				bingo.add(temp);
		}while(bingo.size()!= 25);
		
		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));

	}

}
