package collection6;

import java.util.TreeSet;

public class TreeMain {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		
		tree.add(35); tree.add(41); tree.add(29);
		tree.add(9); tree.add(15); tree.add(20);
		tree.add(56); tree.add(49); tree.add(11);
		tree.add(17); tree.add(89); tree.add(39);
		
		System.out.println(tree);
		
		System.out.println(tree.headSet(20));
		// headSet() - 검색 기능
		// 넣어준 값보다 작은 값을 검색함(일치하는 경우 출력 안됨)
		
		System.out.println(tree.tailSet(31));
		// tailSet() - 특정 값 기준으로 작은 데이터 모두 찾기
		
		System.out.println(tree.first());
		// first - 첫 번째 값 찾기
		
		System.out.println(tree.last());
		// last - 마지막 값 찾기
		
		System.out.println(tree.higher(29));
		// higher - 해당값보다 큰 값 중에 가장 가까운값 찾기 (가까운값없으면 null)
		
		System.out.println(tree.lower(30));
		// lower - 해당값보다 작은 값 중에 가장 가까운 값 찾기(가까운값없으면 null)

		System.out.println(tree.ceiling(37));
		// ceiling - 해당값 이상인 값 중 가장 가까운 거 찾기
		//         - 해당값 포함해서 찾기 때문에 입력한 값이 나올 수도 있음
		
		System.out.println(tree.floor(17));
		// floor - 해당값 이하인 값 중 가장 가까운 거 찾기
		//       - 해당값 포함 해서 찾기에 입력한 값이 나올 수 있음
		
		System.out.println(tree.subSet(17,41));
		// subSet - 범위 지정하여 검색 . a부터 b전까지 검색
	}  

}
