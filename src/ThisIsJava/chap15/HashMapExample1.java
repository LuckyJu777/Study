package chap15;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample1{
	public static void(String[] args) {
		Map<String, Interger>map = new HashMap<String, Integer>();
		
		map.put("금태훈",25);				//객체저장
		map.put("김창연",24);
		map.put("현주연",24);
		map.put("신주형",24);
		map.put("진진자",21);
		map.put("박지훈",26);
		
		System.out.println("총 Entry 수 : " + map.size());		//이름(키)로 점수 (값)을 검색
		System.out.println("총 Emtry 수: " + map.get("홍길동"));	//저장된 총 Entry 수 얻기
		System.out.println();
		
		
		Set<String> keySet = map.keySet();						
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Interger value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		map.remove("신주형");					//객체 삭제 
		System.out.println("총 Entry 수: " + map.size());
		
		Set<Map.Entry<String, Integer >> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryInterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		map.clear();
		System.out.println("수  Entry 수 :" + map.size());
	}
}