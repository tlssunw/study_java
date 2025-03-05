package collection1;

import java.util.ArrayList;

public class MyArray {
//	int[] arr;
//	
//	// 정수 추가메서드
//	public void add(int num) {
//		if (arr == null) {
//			arr = new int[1];
//		}else {
//			int[] temp = new int[arr.length+1];
//			for (int i=0; i<arr.length; i++) {
//				temp[i] = arr[i];
//			}
//			arr=temp;
//		}
//		
//		arr[arr.length-1]=num;
//	}
//	
//	// 인덱스 지정하여 정수 출력 메서드
//	public int get(int index) {
//		if(arr.length-1<index)
//			throw new RuntimeException("인덱스범위초과");
//			
//		return arr[index];
//	}
	
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
}
