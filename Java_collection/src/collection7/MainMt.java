package collection7;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MainMt {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("수박", 15000); map.put("바나나", 5400);
		map.put("앵두", 2300); map.put("딸기", 12400);
		
		System.out.println(map);
		
		map.put("수박", 19000);
		System.out.println(map);
		
		if(map.containsKey("수박")) {
			System.out.print("key로 수박이 사용중");
		}
		// 포함여부는 contain인데 key, value 각각 있다.
		
		
		System.out.println(map.keySet());
		// Set타입으로 반환시킴
		
		System.out.println(map.values());

		System.out.println(map.get("앵두"));
		System.out.println(map.get("참외")); // 없는 키라면, null
		// map에 저장된 key값을 넣어 출력함
		
		// 맵에 저장되어 있는 특정 key의 value 변경
		map.put("앵두", 3100);
		System.out.println(map);
		
		
		
		// 특정 키에 대한 value를 바꾸고자 한다면
		map.replace("앵두", 4300);
		System.out.println(map);
		// put 메소드는 새로운 값 저장 또는 변경 
		map.put("토마토", 5600);
		System.out.println(map);
		map.replace("구아바",9800);
		System.out.println(map);
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		System.out.println(map.entrySet());
		
		for(Entry<String, Integer> ent : map.entrySet()){
			System.out.println(ent.getKey()+ " "+ent.getValue());
		}
		
		HashMap<String, Active> cmd = new HashMap<>();
		cmd.put("회원가입", new Member());
		cmd.put("게시판", new Member());
		cmd.put("게임", new Member());
		
		cmd.get("게시판").save();
		cmd.get("회원가입").save();
		cmd.get("게임").save();
		
		String command = "게시판";
		
		Active action = cmd.get(command);
		action.save();
	}

}
