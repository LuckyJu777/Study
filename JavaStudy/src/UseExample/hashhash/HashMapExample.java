package hashhash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample{
	public static void main(String[] args) {
		//Map 컬렉션
		Map<String, Integer> door = new HashMap<String, Integer>();
		
		//객체저장
		door.put("문 소리가 들려용", 1);
		door.put("누가 나가시나 봐용", 2);
		door.put("오 5시를 향해 달려가고 있어용", 3);
		door.put("빅-스튜핏-주주", 4);
		System.out.println("총 entry 수: " +door.size());
		
		//객체찾기
		System.out.println("\t쿵쾅콱칵 : " + door.get("문 소리가 들려용"));
		System.out.println();
		
		//객체를 하나씩 처리
		Set<String> keySet = door.keySet();		//keySet 얻기
		Iterator<String>keyIterator = keySet.iterator(); 
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = door.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
	
	//객체 삭제
		door.remove("홍길동");	//의문의? 길동씨 1삭제
		door.remove("문 소리가 들려용");
		System.out.println("총 Entry 수 : " + door.size());
	
		Set<Map.Entry<String, Integer>> bigdoor = door.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = bigdoor.iterator();
		
		while(entryIterator.hasNext()) {
			
		}
	}
}